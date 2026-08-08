from datasets import Dataset, DatasetDict

from fongbe_asr.hf_dataset import normalize_audio_column


def test_normalize_audio_column_renames_audio_path_to_audio():
    dataset = DatasetDict(
        {
            "train": Dataset.from_dict(
                {
                    "audio_path": ["sample.wav"],
                    "text": ["alin do xwe"],
                    "source": ["test"],
                }
            )
        }
    )

    normalized = normalize_audio_column(dataset)

    assert "audio" in normalized["train"].column_names
    assert "audio_path" not in normalized["train"].column_names
    assert normalized["train"].features["audio"].sampling_rate == 16000


def test_normalize_audio_column_keeps_existing_audio_column():
    dataset = DatasetDict(
        {
            "train": Dataset.from_dict(
                {
                    "audio": ["sample.wav"],
                    "text": ["alin do xwe"],
                    "source": ["test"],
                }
            )
        }
    )

    normalized = normalize_audio_column(dataset)

    assert "audio" in normalized["train"].column_names
    assert normalized["train"].features["audio"].sampling_rate == 16000
