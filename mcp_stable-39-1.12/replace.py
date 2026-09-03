#!/usr/bin/env python3

import csv
import re
import shutil
import sys
from pathlib import Path


MAPPING_FILES = [
    ("methods.csv", "searge", "name"),
    ("fields.csv",  "searge", "name"),
    ("params.csv",  "param",  "name"),
]


def load_csv_mappings(csv_path, old_column, new_column):
    mappings = {}

    with open(csv_path, "r", encoding="utf-8-sig", newline="") as f:
        reader = csv.DictReader(f)

        if old_column not in reader.fieldnames:
            raise RuntimeError(
                f"{csv_path}: missing column {old_column!r}\n"
                f"Found columns: {reader.fieldnames}"
            )

        if new_column not in reader.fieldnames:
            raise RuntimeError(
                f"{csv_path}: missing column {new_column!r}\n"
                f"Found columns: {reader.fieldnames}"
            )

        for row in reader:
            old = row[old_column].strip()
            new = row[new_column].strip()

            if old and new:
                mappings[old] = new

    return mappings


def main():
    if len(sys.argv) != 2:
        print(f"Usage: {Path(sys.argv[0]).name} <java file>")
        sys.exit(1)

    input_path = Path(sys.argv[1])

    if not input_path.is_file():
        print(f"Error: file not found: {input_path}")
        sys.exit(1)

    mappings = {}

    for filename, old_column, new_column in MAPPING_FILES:
        csv_path = Path(filename)

        if not csv_path.is_file():
            print(f"Error: couldn't find {filename}")
            sys.exit(1)

        loaded = load_csv_mappings(
            csv_path,
            old_column,
            new_column
        )

        mappings.update(loaded)

        print(f"Loaded {len(loaded):,} mappings from {filename}")

    print(f"Total mappings: {len(mappings):,}")

    # Match Java identifiers only.
    #
    # This prevents something like:
    #
    #     some_func_70088_a_thing
    #
    # from accidentally matching:
    #
    #     func_70088_a
    #
    names = sorted(
        mappings.keys(),
        key=len,
        reverse=True
    )

    pattern = re.compile(
        r"(?<![\w$])("
        + "|".join(re.escape(name) for name in names)
        + r")(?![\w$])"
    )

    text = input_path.read_text(encoding="utf-8")

    replacement_counts = {}

    def replace(match):
        old = match.group(1)
        new = mappings[old]

        replacement_counts[old] = (
            replacement_counts.get(old, 0) + 1
        )

        return new

    converted = pattern.sub(replace, text)

    backup_path = input_path.with_suffix(
        input_path.suffix + ".bak"
    )

    # Don't overwrite the original backup if we run this twice.
    if not backup_path.exists():
        shutil.copy2(input_path, backup_path)
        print(f"Backup: {backup_path}")
    else:
        print(f"Backup already exists: {backup_path}")

    input_path.write_text(converted, encoding="utf-8")

    total_replacements = sum(replacement_counts.values())

    print(f"\nReplaced {total_replacements:,} occurrences")
    print(f"Across {len(replacement_counts):,} unique mappings")
    print(f"Updated: {input_path}")


if __name__ == "__main__":
    main()
