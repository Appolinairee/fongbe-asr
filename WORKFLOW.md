# Workflow Fongbe ASR

## Objectif

Les donnees viennent de plateformes publiques. Le projet doit les telecharger dans Drive, puis construire le dataset local d'entrainement.

## Flux

```text
Zenodo / GitHub / Hugging Face
              |
              v
/content/drive/MyDrive/fongbe/data/raw
              |
              v
scripts/prepare_dataset_hf.py
              |
              v
data/processed/fongbe_asr_unified
              |
              v
scripts/finetune_whisper.py
```

## Telechargement Drive

Dans Colab:

```bash
python scripts/download_sources_to_drive.py \
  --dest /content/drive/MyDrive/fongbe/data/raw
```

En local:

```bash
python scripts/download_sources_to_drive.py --dest data/raw
```

## References Telechargees

Voir `DATA_SOURCES.md`.

Le script telecharge:
- Laleye Fongbe Speech Dataset depuis Zenodo
- pyFongbe depuis GitHub
- godwinh/fongbe-asr depuis Hugging Face
- kaith/dataset_fongbe depuis Hugging Face

## Preparation

```bash
python scripts/prepare_dataset_hf.py
```

## Entrainement

```bash
python scripts/finetune_whisper.py
```
