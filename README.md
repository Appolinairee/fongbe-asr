# Fongbe ASR

Automatic Speech Recognition system for Fongbe (Benin) using parameter-efficient fine-tuning of Whisper with LoRA.

[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)

## Overview

This repository contains code and documentation for fine-tuning OpenAI's Whisper model on Fongbe speech data using Low-Rank Adaptation (LoRA). The project investigates optimal parameter-efficient fine-tuning strategies for low-resource African languages.

**Dataset:** 13,581 audio-transcription pairs (12.22 hours total)  
**Sources:** Laleye et al. (Zenodo) + pyFongbe corpus  
**Split:** 80% train / 10% validation / 10% test

## Quick Start

### Local Training

```bash
git clone https://github.com/Appolinairee/fongbe-asr.git
cd fongbe-asr
python -m venv venv && source venv/bin/activate
pip install -r requirements.txt
python scripts/finetune_whisper.py
```

### Google Colab

Use the provided `colab_training.ipynb` notebook for GPU-accelerated training with automatic GitHub/Drive synchronization.

See `WORKFLOW.md` for detailed setup instructions.

## Repository Structure

```
fongbe-asr/
├── scripts/
│   ├── finetune_whisper.py          # Main training script
│   ├── experiment_lora_ranks.py     # LoRA rank ablation study
│   └── prepare_dataset_hf.py        # Dataset preprocessing
├── colab_training.ipynb             # Colab notebook with sync
├── TRAINING_GUIDE.md                # Training documentation
└── WORKFLOW.md                      # Development workflow guide
```

## Research Questions

1. What is the optimal LoRA rank for Fongbe ASR? (r ∈ {2, 4, 8, 16, 32, 64})
2. Which Whisper modules benefit most from fine-tuning? (encoder vs decoder)
3. What performance is achievable with limited labeled data?

## Expected Results

- Baseline WER: 20-40%
- Training time: 3-6 hours (T4 GPU)
- Model size: ~10MB (LoRA adapters only)

## Citation

```bibtex
@misc{fongbe-asr-2026,
  title={Parameter-Efficient Fine-Tuning of Whisper for Fongbe ASR},
  author={Your Name},
  year={2026},
  publisher={GitHub},
  url={https://github.com/Appolinairee/fongbe-asr}
}
```

## Acknowledgments

- Laleye et al. dataset: [DOI:10.5281/zenodo.6604637](https://doi.org/10.5281/zenodo.6604637)
- pyFongbe corpus: [github.com/laleye/pyFongbe](https://github.com/laleye/pyFongbe)
- Whisper: [github.com/openai/whisper](https://github.com/openai/whisper)

## License

MIT License - see [LICENSE](LICENSE) for details.
