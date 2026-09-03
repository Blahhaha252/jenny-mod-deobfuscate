#!/usr/bin/env python3

import json
import sys
from pathlib import Path


def usage():
    print(
        "usage:\n"
        "  shower.py <class> uses [map.json]\n"
        "  shower.py <class> used-by [map.json]\n"
        "  shower.py <class> both [map.json]"
    )


def main():
    if len(sys.argv) < 3:
        usage()
        sys.exit(1)

    name = sys.argv[1]
    mode = sys.argv[2]

    map_file = Path(sys.argv[3]) if len(sys.argv) >= 4 else Path("file_map.json")

    if not map_file.is_file():
        print(f"error: map file not found: {map_file}")
        sys.exit(1)

    with map_file.open("r", encoding="utf-8") as f:
        graph = json.load(f)

    # Allow "ai.java" as well as "ai"
    if name.endswith(".java"):
        name = name[:-5]

    if name not in graph:
        print(f"unknown class/file: {name}")
        sys.exit(1)

    if mode in ("uses", "both"):
        refs = graph[name]["references"]

        print(f"\n{name} uses:")

        if not refs:
            print("  (nothing found)")
        else:
            counts = {}

            for ref in refs:
                counts[ref] = counts.get(ref, 0) + 1

            for ref, count in sorted(
                counts.items(),
                key=lambda x: (-x[1], x[0])
            ):
                print(f"  -> {ref} ({count})")

    if mode in ("used-by", "both"):
        dependents = []

        for source, info in graph.items():
            count = info["references"].count(name)

            if count:
                dependents.append((source, count))

        print(f"\n{name} is used by:")

        if not dependents:
            print("  (nothing found)")
        else:
            dependents.sort(
                key=lambda x: (-x[1], x[0])
            )

            for source, count in dependents:
                print(f"  <- {source} ({count})")

    if mode not in ("uses", "used-by", "both"):
        print(f"unknown mode: {mode}")
        usage()
        sys.exit(1)


if __name__ == "__main__":
    main()
