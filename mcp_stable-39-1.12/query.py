#!/usr/bin/env python3

import json
import sys
from pathlib import Path


VALID_MODES = {
    "uses",
    "used-by",
    "both",
    "extends",
    "extended-by",
    "implements",
    "implemented-by",
    "inheritance",
    "all",
}


def usage():
    print(
        "usage:\n"
        "  query.py <class> uses [map.json]\n"
        "  query.py <class> used-by [map.json]\n"
        "  query.py <class> both [map.json]\n"
        "  query.py <class> extends [map.json]\n"
        "  query.py <class> extended-by [map.json]\n"
        "  query.py <class> implements [map.json]\n"
        "  query.py <class> implemented-by [map.json]\n"
        "  query.py <class> inheritance [map.json]\n"
        "  query.py <class> all [map.json]\n"
        "\n"
        "modes:\n"
        "  uses            references made by this class\n"
        "  used-by         classes that reference this class\n"
        "  both            uses + used-by, including inheritance sections\n"
        "  extends         direct superclass/interface(s) this class extends\n"
        "  extended-by     classes/interfaces that directly extend this class\n"
        "  implements      interfaces this class directly implements\n"
        "  implemented-by  classes/enums that directly implement this interface\n"
        "  inheritance     extends + extended-by + implements + implemented-by\n"
        "  all             everything"
    )


def print_reference_uses(graph, name):
    refs = graph[name].get("references", [])

    print(f"\n{name} uses:")

    if not refs:
        print("  (nothing found)")
        return

    counts = {}
    for ref in refs:
        counts[ref] = counts.get(ref, 0) + 1

    for ref, count in sorted(
        counts.items(),
        key=lambda x: (-x[1], x[0])
    ):
        print(f"  -> {ref} ({count})")


def print_reference_used_by(graph, name):
    dependents = []

    for source, info in graph.items():
        count = info.get("references", []).count(name)
        if count:
            dependents.append((source, count))

    print(f"\n{name} is used by:")

    if not dependents:
        print("  (nothing found)")
        return

    dependents.sort(key=lambda x: (-x[1], x[0]))

    for source, count in dependents:
        print(f"  <- {source} ({count})")


def print_extends(graph, name):
    targets = graph[name].get("extends", [])

    print(f"\n{name} extends:")

    if not targets:
        print("  (nothing found)")
        return

    for target in targets:
        print(f"  -> {target}")


def print_extended_by(graph, name):
    sources = [
        source
        for source, info in graph.items()
        if name in info.get("extends", [])
    ]

    print(f"\n{name} is extended by:")

    if not sources:
        print("  (nothing found)")
        return

    for source in sorted(sources):
        print(f"  <- {source}")


def print_implements(graph, name):
    targets = graph[name].get("implements", [])

    print(f"\n{name} implements:")

    if not targets:
        print("  (nothing found)")
        return

    for target in targets:
        print(f"  -> {target}")


def print_implemented_by(graph, name):
    sources = [
        source
        for source, info in graph.items()
        if name in info.get("implements", [])
    ]

    print(f"\n{name} is implemented by:")

    if not sources:
        print("  (nothing found)")
        return

    for source in sorted(sources):
        print(f"  <- {source}")


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

    if mode not in VALID_MODES:
        print(f"unknown mode: {mode}")
        usage()
        sys.exit(1)

    if mode in ("uses", "both", "all"):
        print_reference_uses(graph, name)

    if mode in ("used-by", "both", "all"):
        print_reference_used_by(graph, name)

    # For "both", also include the inheritance relationships because they're
    # now part of the dependency picture.
    if mode in ("extends", "inheritance", "both", "all"):
        print_extends(graph, name)

    if mode in ("extended-by", "inheritance", "both", "all"):
        print_extended_by(graph, name)

    if mode in ("implements", "inheritance", "both", "all"):
        print_implements(graph, name)

    if mode in ("implemented-by", "inheritance", "both", "all"):
        print_implemented_by(graph, name)


if __name__ == "__main__":
    main()
