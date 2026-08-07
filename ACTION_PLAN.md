# 🎯 PLAN D'ACTION - ASR Fongbe avec Skills

**Date**: 2026-08-07  
**Objectif**: Finetuner Whisper pour ASR fongbe

---

## 📦 SKILLS IMPORTÉS

### 1. **Whisper** (`skills/whisper/`)
- ASR multilingue OpenAI
- 99 langues, 6 tailles modèle
- Finetuning possible avec HF Transformers
- **→ Notre modèle de base**

### 2. **Fine-tuning** (`skills/03-fine-tuning/`)
- PEFT (LoRA, QLoRA)
- Axolotl (framework finetuning)
- LLaMA-Factory
- Unsloth (optimisé)
- **→ Pour finetuner efficacement**

### 3. **Data Processing** (`skills/05-data-processing/`)
- Ray Data (scaling)
- NeMo Curator (cleaning)
- **→ Pour préparer dataset**

### 4. **Evaluation** (`skills/11-evaluation/`)
- LM Evaluation Harness
- NeMo Evaluator
- **→ Pour mesurer WER/CER**

---

## 🎯 CONCENTRATION PRIORITAIRE

### **PHASE 1: Préparation Data (MAINTENANT)**

**Tâches:**
1. ✅ Données pompées (12.22h audio)
2. 🔄 **Unifier datasets** (Laleye + pyFongbe)
3. 🔄 **Format HuggingFace** (audio + text)
4. 🔄 **Train/val/test splits**
5. 🔄 **Vérifier qualité transcriptions**

**Output:** Dataset HF prêt pour finetuning

---

### **PHASE 2: Finetuning Whisper (APRÈS PHASE 1)**

**Approche:**
- Modèle base: `whisper-base` ou `whisper-small`
- Méthode: LoRA (PEFT)
- Framework: HuggingFace Transformers
- Durée: ~3-6h GPU

**Référence skill:** `skills/whisper/SKILL.md`

---

### **PHASE 3: Évaluation (APRÈS PHASE 2)**

**Métriques:**
- WER (Word Error Rate)
- CER (Character Error Rate)

**Target baseline:** WER < 30%

---

## 📋 PROCHAINE ACTION

**Focus immédiat:** Préparer dataset unifié

**Fichier à créer:** `scripts/prepare_dataset_hf.py`
- Combiner Laleye + pyFongbe
- Format HuggingFace Dataset
- Splits 80/10/10

**Temps estimé:** 1-2h
