# Fongbe Data Sources

Le projet ne cree pas un dataset public de zero. Il telecharge les sources existantes, puis les prepare localement pour l'entrainement.

## References

| Source | URL | Format |
| --- | --- | --- |
| Laleye Fongbe Speech Dataset | https://zenodo.org/records/6604637 | ZIP Zenodo avec WAV, transcriptions et metadata |
| pyFongbe | https://github.com/laleye/pyFongbe | Depot GitHub avec corpus ASR |
| godwinh/fongbe-asr | https://huggingface.co/datasets/godwinh/fongbe-asr | Hugging Face, `train.pkl` |
| kaith/dataset_fongbe | https://huggingface.co/datasets/kaith/dataset_fongbe | Hugging Face, CSV/JSON |

## Download To Drive

Dans Colab:

```bash
python scripts/download_sources_to_drive.py \
  --dest /content/drive/MyDrive/fongbe/data/raw
```

En local:

```bash
python scripts/download_sources_to_drive.py --dest data/raw
```

Ensuite, `scripts/prepare_dataset_hf.py` peut construire `data/processed/fongbe_asr_unified` depuis ces sources.
