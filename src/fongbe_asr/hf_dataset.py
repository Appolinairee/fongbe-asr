from pathlib import Path
from typing import Optional

from datasets import Audio, DatasetDict, load_dataset, load_from_disk


DEFAULT_DATASET_PATH = "data/processed/fongbe_asr_unified"
DEFAULT_SAMPLING_RATE = 16000


def normalize_audio_column(
    dataset: DatasetDict,
    sampling_rate: int = DEFAULT_SAMPLING_RATE,
) -> DatasetDict:
    """Return a dataset with a canonical decoded `audio` column."""
    split_name = next(iter(dataset.keys()))
    columns = set(dataset[split_name].column_names)

    if "audio" in columns:
        return dataset.cast_column("audio", Audio(sampling_rate=sampling_rate))

    if "audio_path" in columns:
        dataset = dataset.cast_column("audio_path", Audio(sampling_rate=sampling_rate))
        return dataset.rename_column("audio_path", "audio")

    raise ValueError("Dataset must contain either an 'audio' or 'audio_path' column.")


def load_fongbe_dataset(
    dataset_path: str = DEFAULT_DATASET_PATH,
    hf_dataset_id: str = "",
    cache_dir: Optional[str] = None,
) -> DatasetDict:
    """Load the prepared dataset locally, or download it from Hugging Face."""
    path = Path(dataset_path)

    if path.exists():
        return load_from_disk(str(path))

    if not hf_dataset_id:
        raise FileNotFoundError(
            f"Dataset introuvable a {path}. "
            "Definis HF_DATASET_ID pour le telecharger depuis Hugging Face."
        )

    dataset = load_dataset(hf_dataset_id, cache_dir=cache_dir)
    if not isinstance(dataset, DatasetDict):
        raise TypeError(f"{hf_dataset_id} did not load as a DatasetDict.")

    path.parent.mkdir(parents=True, exist_ok=True)
    dataset.save_to_disk(str(path))
    return dataset
