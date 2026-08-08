#!/usr/bin/env python3
"""Download known Fongbe data sources into Google Drive or a local raw folder."""

import argparse
import os
import shutil
import subprocess
import zipfile
from pathlib import Path


DEFAULT_DESTINATION = Path(
    os.getenv("FONGBE_DATA_ROOT", "/content/drive/MyDrive/fongbe/data/raw")
)
if not DEFAULT_DESTINATION.parent.exists():
    DEFAULT_DESTINATION = Path("data/raw")


SOURCES = [
    {
        "name": "laleye_zenodo",
        "kind": "zip",
        "url": "https://zenodo.org/records/6604637/files/Fongbe_Speech_Dataset.zip?download=1",
        "target": "Fongbe_Speech_Dataset.zip",
        "extract_dir": "Fongbe_Speech_Dataset",
    },
    {
        "name": "pyfongbe",
        "kind": "git",
        "url": "https://github.com/laleye/pyFongbe.git",
        "target": "pyFongbe",
    },
    {
        "name": "godwinh_fongbe_asr",
        "kind": "files",
        "files": [
            (
                "https://huggingface.co/datasets/godwinh/fongbe-asr/resolve/main/train.pkl",
                "train.pkl",
            ),
            (
                "https://huggingface.co/datasets/godwinh/fongbe-asr/raw/main/README.md",
                "README.md",
            ),
        ],
        "target": "godwinh_fongbe-asr",
    },
    {
        "name": "kaith_dataset_fongbe",
        "kind": "files",
        "files": [
            (
                "https://huggingface.co/datasets/kaith/dataset_fongbe/resolve/main/fon1.csv",
                "fon1.csv",
            ),
            (
                "https://huggingface.co/datasets/kaith/dataset_fongbe/resolve/main/fon1.json",
                "fon1.json",
            ),
            (
                "https://huggingface.co/datasets/kaith/dataset_fongbe/resolve/main/metadata.csv",
                "metadata.csv",
            ),
        ],
        "target": "kaith_dataset_fongbe",
    },
]


def run(command: list[str], cwd: Path | None = None) -> None:
    subprocess.run(command, cwd=cwd, check=True)


def download_file(url: str, destination: Path) -> None:
    if destination.exists():
        print(f"skip: {destination}")
        return

    if shutil.which("wget"):
        run(["wget", "-O", str(destination), url])
        return

    run(["curl", "-L", "-o", str(destination), url])


def clone_repo(url: str, destination: Path) -> None:
    if destination.exists():
        print(f"skip: {destination}")
        return

    run(["git", "clone", url, str(destination)])


def extract_zip(archive: Path, destination: Path) -> None:
    if destination.exists():
        print(f"skip extract: {destination}")
        return

    with zipfile.ZipFile(archive) as zip_file:
        zip_file.extractall(archive.parent)


def download_files(files: list[tuple[str, str]], destination: Path) -> None:
    destination.mkdir(parents=True, exist_ok=True)
    for url, filename in files:
        download_file(url, destination / filename)


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument(
        "--dest",
        default=str(DEFAULT_DESTINATION),
        help="Destination raw data folder. In Colab, use /content/drive/MyDrive/fongbe/data/raw.",
    )
    args = parser.parse_args()

    destination = Path(args.dest)
    destination.mkdir(parents=True, exist_ok=True)
    print(f"destination: {destination.resolve()}")

    for source in SOURCES:
        target = destination / source["target"]
        print(f"download: {source['name']} -> {target}")

        if source["kind"] == "zip":
            download_file(source["url"], target)
            extract_zip(target, destination / source["extract_dir"])
        elif source["kind"] == "git":
            clone_repo(source["url"], target)
        elif source["kind"] == "files":
            download_files(source["files"], target)
        else:
            raise ValueError(f"Unknown source kind: {source['kind']}")


if __name__ == "__main__":
    main()
