# TODO — Voice LLM Fongbe

## Phase 1 — Inventaire & Setup

- [ ] Rechercher et cataloguer tous les datasets fongbe (Zenodo, HF, GitHub, Kaggle, OPUS)
- [ ] Télécharger datasets prioritaires : Laleye speech, FFR corpus, datasets Kaggle
- [ ] Analyser datasets : nb samples, durée audio, qualité, distribution speakers
- [ ] Contacter chercheurs clés : Laleye, Dossou, Emezue, Masakhane
- [ ] Lire papers ciblés : Laleye speech, Whisper, 1-2 low-resource ASR africain
- [ ] Documenter état de l'art dans STATE_OF_ART.md
- [ ] Tester Radio NLP downloader Capp FM
- [ ] Évaluer volume audio disponible via Radio NLP

## Phase 2 — Data Engineering

- [ ] Audit corpus FFR : duplicates, noise, alignement, caractères spéciaux, vocab
- [ ] Nettoyer corpus : déduplication, normalisation unicode, gestion tons
- [ ] Audit audio : sample rate, durée, bruit, qualité transcription, alignement
- [ ] Pipeline preprocessing : resampling 16kHz, normalisation, VAD, découpage segments
- [ ] Feature extraction : mel-spectrograms compatibles Whisper
- [ ] Créer splits train/val/test 80/10/10 stratifiés (speaker, durée, qualité)
- [ ] Entraîner tokenizer BPE/Unigram adapté au fongbe (tons, caractères spéciaux)
- [ ] Data augmentation si nécessaire : speed, pitch, noise, SpecAugment

## Phase 3 — Baseline Model

- [ ] Décider architecture baseline : Whisper small/base vs Wav2Vec2 vs MMS
- [ ] Justifier choix dans ADR (taille data, compute, SOTA)
- [ ] Setup environnement training : Python, GPU, logging, reproductible
- [ ] Implémenter pipeline training : dataloader, loop, validation, checkpointing
- [ ] Configurer MLOps : W&B ou MLflow, logger hyperparams/metrics/samples
- [ ] Définir métriques : WER primary, CER, perplexité, métriques custom fongbe
- [ ] Fine-tuner baseline avec hyperparams standard
- [ ] Évaluer baseline : calcul métriques, analyse erreurs, patterns
- [ ] Documenter résultats dans BASELINE_RESULTS.md
- [ ] Benchmark vs Laleye/Dossou si disponible

## Phase 4 — Optimisation

- [ ] Analyser erreurs baseline : catégoriser (phonétique, tonale, OOV, contexte)
- [ ] Hyperparameter tuning : grid/random search (LR, batch, warmup, decay)
- [ ] Tester architectures : Whisper medium/large, LoRA/PEFT
- [ ] Améliorer données : collecter plus, corriger transcriptions, augmentation ciblée
- [ ] Techniques avancées si pertinent : multi-task, transfer learning, semi-supervised
- [ ] Compression : quantization INT8, pruning, distillation

## Phase 5 — Publication

- [ ] Validation finale : test set non vu, real-world, robustesse (bruit, accents)
- [ ] Documentation technique : architecture, training, hyperparams, limitations
- [ ] Rédiger paper académique (AfricaNLP, LREC, Interspeech)
- [ ] Préparer dataset release : metadata, licence, datasheet, upload HF/Zenodo
- [ ] Préparer model release : model card, inference code, demo, upload HF
- [ ] Créer demo/API : Gradio/Streamlit, déployer HF Spaces
- [ ] Soumettre paper et diffuser : Twitter/LinkedIn, Masakhane, communauté fongbe

---

**Prochaine tâche** : Rechercher et cataloguer datasets
