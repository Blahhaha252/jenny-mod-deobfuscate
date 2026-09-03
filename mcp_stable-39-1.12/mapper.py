#!/usr/bin/env python3

import argparse
import json
import re
from pathlib import Path

PACKAGE = "com.trolmastercard.sexmod"


def build_map(source_dir: Path):
    java_files = list(source_dir.rglob("*.java"))

    # filename/class name -> file path
    known_files = {
        file.stem: file
        for file in java_files
    }

    # Matches:
    # com.trolmastercard.sexmod.gw
    # com.trolmastercard.sexmod.em
    # etc.
    reference_pattern = re.compile(
        rf"\b{re.escape(PACKAGE)}\.([A-Za-z_$][A-Za-z0-9_$]*)\b"
    )

    graph = {}

    for file in java_files:
        source = file.read_text(encoding="utf-8", errors="replace")

        references = []

        for match in reference_pattern.finditer(source):
            target = match.group(1)

            # Only record names that actually correspond to one
            # of our Java files.
            if target not in known_files:
                continue

            # Don't count a file referencing itself.
            if target == file.stem:
                continue

            references.append(target)

        graph[file.stem] = {
            "file": str(file),
            "references": references
        }

    return graph


def save_map(graph, output_file: Path):
    output_file.write_text(
        json.dumps(graph, indent=4),
        encoding="utf-8"
    )


def show_uses(graph, name):
    if name not in graph:
        print(f"Unknown file/class: {name}")
        return

    references = graph[name]["references"]

    print(f"\n{name} references:")

    if not references:
        print("  (nothing found)")
        return

    for target in references:
        print(f"  -> {target}")


def show_used_by(graph, name):
    if name not in graph:
        print(f"Unknown file/class: {name}")
        return

    found = False

    print(f"\nFiles referencing {name}:")

    for source, info in graph.items():
        if name in info["references"]:
            print(f"  <- {source}")
            found = True

    if not found:
        print("  (nothing found)")


def main():
    parser = argparse.ArgumentParser(
        description="Map sexmod Java file references."
    )

    parser.add_argument(
        "source",
        type=Path,
        help="Directory containing the Java source"
    )

    parser.add_argument(
        "--output",
        "-o",
        type=Path,
        default=Path("file_map.json"),
        help="Output JSON file"
    )

    parser.add_argument(
        "--uses",
        help="Show what a class/file references"
    )

    parser.add_argument(
        "--used-by",
        help="Show what classes/files reference this one"
    )

    args = parser.parse_args()

    graph = build_map(args.source)

    save_map(graph, args.output)

    print(f"Mapped {len(graph)} Java files")
    print(f"Saved to: {args.output}")

    if args.uses:
        show_uses(graph, args.uses)

    if args.used_by:
        show_used_by(graph, args.used_by)


if __name__ == "__main__":
    main()
