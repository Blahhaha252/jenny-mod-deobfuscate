#!/usr/bin/env python3

import argparse
import json
import re
from pathlib import Path

PACKAGE = "com.trolmastercard.sexmod"


def strip_comments_and_strings(source: str) -> str:
    pattern = re.compile(
        r'''
        //.*?$                         |
        /\*.*?\*/                    |
        "(?:\\.|[^"\\])*"          |
        '(?:\\.|[^'\\])*'
        ''',
        re.MULTILINE | re.DOTALL | re.VERBOSE,
    )

    def repl(match):
        s = match.group(0)
        return "\n" * s.count("\n")

    return pattern.sub(repl, source)


def split_top_level_commas(text: str):
    parts = []
    start = 0
    depth = 0

    for i, ch in enumerate(text):
        if ch == "<":
            depth += 1
        elif ch == ">":
            depth = max(0, depth - 1)
        elif ch == "," and depth == 0:
            part = text[start:i].strip()
            if part:
                parts.append(part)
            start = i + 1

    part = text[start:].strip()
    if part:
        parts.append(part)

    return parts


def base_type_name(type_text: str):
    type_text = type_text.strip()
    type_text = re.sub(r"@\w+(?:\s*\([^)]*\))?\s*", "", type_text)

    if "<" in type_text:
        type_text = type_text.split("<", 1)[0].strip()

    type_text = re.sub(r"(?:\[\]|\.\.\.)+$", "", type_text).strip()

    return type_text.rsplit(".", 1)[-1]


def parse_inheritance(source: str, file_stem: str, known_files):
    clean = strip_comments_and_strings(source)

    decl_pattern = re.compile(
        rf'''
        \b(class|interface|enum)\s+
        {re.escape(file_stem)}
        (?:\s*<[^{{}};]*?>)?
        \s*
        (?P<header>[^{{;]*)
        \{{
        ''',
        re.DOTALL | re.VERBOSE,
    )

    match = decl_pattern.search(clean)
    if not match:
        return [], []

    header = match.group("header")

    extends_names = []
    implements_names = []

    ext_match = re.search(
        r"\bextends\b(?P<body>.*?)(?=\bimplements\b|\bpermits\b|$)",
        header,
        re.DOTALL,
    )
    if ext_match:
        for part in split_top_level_commas(ext_match.group("body").strip()):
            name = base_type_name(part)
            if name in known_files and name != file_stem:
                extends_names.append(name)

    impl_match = re.search(
        r"\bimplements\b(?P<body>.*?)(?=\bpermits\b|$)",
        header,
        re.DOTALL,
    )
    if impl_match:
        for part in split_top_level_commas(impl_match.group("body").strip()):
            name = base_type_name(part)
            if name in known_files and name != file_stem:
                implements_names.append(name)

    return list(dict.fromkeys(extends_names)), list(dict.fromkeys(implements_names))


def build_map(source_dir: Path):
    java_files = list(source_dir.rglob("*.java"))

    known_files = {
        file.stem: file
        for file in java_files
    }

    reference_pattern = re.compile(
        rf"\b{re.escape(PACKAGE)}\.([A-Za-z_$][A-Za-z0-9_$]*)\b"
    )

    graph = {}

    for file in java_files:
        source = file.read_text(encoding="utf-8", errors="replace")

        references = []

        for match in reference_pattern.finditer(source):
            target = match.group(1)

            if target not in known_files:
                continue

            if target == file.stem:
                continue

            references.append(target)

        extends_names, implements_names = parse_inheritance(
            source,
            file.stem,
            known_files,
        )

        graph[file.stem] = {
            "file": str(file),
            "references": references,
            "extends": extends_names,
            "implements": implements_names,
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

    info = graph[name]

    print(f"\n{name} references:")
    if not info["references"]:
        print("  (nothing found)")
    else:
        for target in info["references"]:
            print(f"  -> {target}")

    print(f"\n{name} extends:")
    if not info.get("extends"):
        print("  (nothing found)")
    else:
        for target in info["extends"]:
            print(f"  -> {target}")

    print(f"\n{name} implements:")
    if not info.get("implements"):
        print("  (nothing found)")
    else:
        for target in info["implements"]:
            print(f"  -> {target}")


def show_used_by(graph, name):
    if name not in graph:
        print(f"Unknown file/class: {name}")
        return

    refs = []
    extended_by = []
    implemented_by = []

    for source, info in graph.items():
        if name in info["references"]:
            refs.append(source)
        if name in info.get("extends", []):
            extended_by.append(source)
        if name in info.get("implements", []):
            implemented_by.append(source)

    print(f"\nFiles referencing {name}:")
    if refs:
        for source in refs:
            print(f"  <- {source}")
    else:
        print("  (nothing found)")

    print(f"\nClasses/interfaces extending {name}:")
    if extended_by:
        for source in extended_by:
            print(f"  <- {source}")
    else:
        print("  (nothing found)")

    print(f"\nClasses/enums implementing {name}:")
    if implemented_by:
        for source in implemented_by:
            print(f"  <- {source}")
    else:
        print("  (nothing found)")


def main():
    parser = argparse.ArgumentParser(
        description="Map sexmod Java references and inheritance."
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
        help="Show what a class/file references, extends, and implements"
    )

    parser.add_argument(
        "--used-by",
        help="Show what references, extends, or implements this class/file"
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
