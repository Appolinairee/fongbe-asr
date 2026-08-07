# Inventaire des Datasets Fongbe

**Date** : 2026-08-07  
**Statut** : ✅ Phase de recherche complétée

---

## 🎙️ DATASETS AUDIO (Speech)

### 1. **Laleye Fongbe Speech Dataset** ⭐ PRIORITÉ HAUTE
- **Source** : Zenodo
- **DOI** : `10.5281/zenodo.6604637`
- **URL** : https://doi.org/10.5281/zenodo.6604637
- **GitHub** : https://github.com/laleye/FongbeSpeechDataset
- **Licence** : CC0-1.0
- **Taille** : ~? heures audio
- **Description** : Dataset speech fongbe avec transcriptions
- **Auteur** : Laleye Fréjus A. A. (OPSCIDIA, Paris)
- **Année** : 2022
- **Citation** :
  ```bibtex
  @dataset{laleye_frejus_a_a_2022_6604637,
    author = {Laleye Fréjus A. A.},
    title = {Fongbe speech dataset},
    year = {2022},
    publisher = {Zenodo},
    doi = {10.5281/zenodo.6604637}
  }
  ```
- **Notes** : 2nd place Google NLP Hack Series. Inclut code training, vocab.json, modèle baseline.
- **À télécharger** : ✅ OUI

---

### 2. **FFSTC - Fongbe to French Speech Translation Corpus** ⭐⭐ PRIORITÉ TRÈS HAUTE
- **Source** : ArXiv / LREC-COLING 2024
- **Paper** : https://arxiv.org/abs/2403.05488
- **PDF** : http://www.lrec-conf.org/proceedings/lrec-coling-2024/pdf/2024.main-1.638.pdf
- **Taille** : **31 heures** audio fongbe + transcriptions françaises
- **Description** : Corpus speech-to-speech translation fongbe→français
- **Auteurs** : Fortune Kponou, Fréjus A. A. Laleye, Eugène C. Ezin
- **Affiliation** : IMSP (Bénin), OPSCIDIA (Paris)
- **Année** : 2024 (Mars)
- **Licence** : À vérifier
- **Citation** :
  ```bibtex
  @inproceedings{kponou2024ffstc,
    title={FFSTC: Fongbe to French Speech Translation Corpus},
    author={Kponou, Fortune and Laleye, Fréjus A. A. and Ezin, Eugène C.},
    booktitle={LREC-COLING 2024},
    year={2024}
  }
  ```
- **Notes** : Premier corpus fongbe→français pour speech translation
- **Dataset URL** : À chercher (probablement Zenodo ou GitHub)
- **À télécharger** : ✅ OUI

---

### 3. **FFSTC 2 - Extended Corpus** ⭐⭐⭐ PRIORITÉ MAXIMALE
- **Source** : IWSLT 2025 / Interspeech 2025
- **Paper IWSLT** : https://aclanthology.org/2025.iwslt-1.13/
- **Paper Interspeech** : https://www.isca-archive.org/interspeech_2025/kponou25_interspeech.pdf
- **Taille** : **61 heures** audio (31h FFSTC v1 + 36h nouveau)
- **Description** : Extension du corpus FFSTC avec 36h audio supplémentaire
- **Utilité** : ASR + Speech Translation
- **Auteurs** : Fortune Kponou et al.
- **Année** : 2025
- **Notes** : Dataset le plus récent et le plus large pour fongbe speech
- **Dataset URL** : À chercher
- **À télécharger** : ✅ OUI - **DATASET PRINCIPAL**

---

### 4. **Hugging Face - godwinh/fongbe-asr**
- **Source** : Hugging Face Datasets
- **URL** : https://huggingface.co/datasets/godwinh/fongbe-asr
- **Description** : Dataset ASR fongbe avec waveforms en CSV
- **Notes** : Transformation du dataset original avec valeurs waveform directement
- **À explorer** : ✅ OUI

---

### 5. **Hugging Face - kaith/dataset_fongbe**
- **Source** : Hugging Face Datasets
- **URL** : https://huggingface.co/datasets/kaith/dataset_fongbe
- **Description** : Dataset fongbe (détails à explorer)
- **À explorer** : ✅ OUI

---

## 📝 DATASETS TEXTE (NMT / NLP)

### 6. **FFR v1.0 - Fon-French Neural Machine Translation** ⭐ DÉJÀ LOCAL
- **Source** : GitHub / OPUS
- **GitHub** : https://github.com/bonaventuredossou/ffr-v1
- **Paper** : https://arxiv.org/abs/2006.09217
- **OPUS** : http://opus.nlpl.eu/FFR-v2.php
- **Local** : `collecte/fon-fr.txt/` (8.8 MB)
- **Licence** : CC-BY-NC-SA-4.0 (usage non-commercial requis approbation auteurs)
- **Taille** : Corpus parallèle fon-français
  - FFR.fon-fr.fon (3.4 MB)
  - FFR.fon-fr.fr (3.0 MB)
  - FFR.fon-fr.xml (2.7 MB metadata)
- **Auteurs** : Bonaventure F. P. Dossou, Chris C. Emezue
- **Année** : 2020 (v1.0), 2023 (v2 OPUS)
- **Description** : Premier corpus parallèle fon-français pour NMT
- **Citation** :
  ```bibtex
  @inproceedings{dossou2020ffr,
    title={FFR v1.1: Fon-French Neural Machine Translation},
    author={Dossou, Bonaventure F. P. and Emezue, Chris C.},
    journal={arXiv:2006.09217},
    year={2020}
  }
  ```
- **Statut** : ✅ DÉJÀ TÉLÉCHARGÉ

---

### 7. **Kaggle - Fon_French_Parallel_Data_25377** ⭐ DÉJÀ LOCAL
- **Local** : `collecte/4432712/Fon_French_Parallel_Data_25377.csv` (1.4 MB)
- **Taille** : **25,377 paires** fon-français
- **Description** : Corpus parallèle CSV
- **Statut** : ✅ DÉJÀ TÉLÉCHARGÉ

---

### 8. **Kaggle - French_to_fongbe** ⭐ DÉJÀ LOCAL
- **Local** : `collecte/4266935/French_to_fongbe.csv` (3.2 MB)
- **Description** : Corpus français→fongbe
- **Statut** : ✅ DÉJÀ TÉLÉCHARGÉ

---

### 9. **GitHub - kingabzpro/French-to-Fongbe-and-Ewe-MT**
- **Source** : GitHub
- **URL** : https://github.com/kingabzpro/French-to-Fongbe-and-Ewe-MT
- **Description** : MT français→fongbe/ewe avec simpletransformers
- **Local** : `collecte/4266935/French_to_ewe_dataset.xlsx` (2.8 MB) - Langue proche
- **Notes** : Code et modèle disponibles
- **À explorer** : Modèle baseline possible

---

### 10. **Dictionnaire Fongbé-Français JSON** ⭐ DÉJÀ LOCAL
- **Local** : `collecte/App "Dictionnaire Fongbé-Français_2.1.0"/` (6.4 MB)
- **Fichiers** :
  - formatsyd.json (2.1 MB)
  - unisformats.json (3.0 MB)
  - Forma.json (1.5 MB)
- **Description** : Dictionnaire structuré fongbe-français
- **Utilité** : Lexique, validation vocab, augmentation données
- **Statut** : ✅ DÉJÀ TÉLÉCHARGÉ

---

## 🌍 DATASETS MULTILINGUES (incluant Fongbe)

### 11. **Masakhane - MasakhaNER 2.0**
- **Source** : Hugging Face
- **URL** : https://huggingface.co/datasets/jaypee01/masakhaner2
- **Description** : Named Entity Recognition, 20 langues africaines (incl. fongbe)
- **Taille** : Plus grand dataset NER publiquement disponible
- **À télécharger** : Si pertinent pour tâches NER

---

### 12. **Masakhane - MasakhaPOS**
- **Source** : Hugging Face
- **URL** : https://huggingface.co/datasets/masakhane/masakhapos
- **Description** : POS tagging, 20 langues africaines (incl. fongbe)
- **À télécharger** : Si pertinent pour tâches POS

---

### 13. **Masakhane - MasakhaNER-X**
- **Source** : Hugging Face
- **URL** : https://huggingface.co/datasets/masakhane/masakhaner-x
- **Description** : Agrégation MasakhaNER 1.0 + 2.0, annotations byte-level span
- **À télécharger** : Si pertinent

---

### 14. **Masakhane - AfriQA**
- **Source** : Hugging Face
- **URL** : https://huggingface.co/datasets/orionweller/masakhane-afriqa-gold-passages
- **Description** : Cross-lingual QA, 10 langues africaines, 12K+ exemples
- **À télécharger** : Si pertinent pour QA tasks

---

## 🤖 MODÈLES PRÉ-ENTRAÎNÉS

### 15. **Professor/mms-300m-fongbe** ⭐⭐ IMPORTANT
- **Source** : Hugging Face Models
- **URL** : http://huggingface.co/Professor/mms-300m-fongbe
- **Description** : Modèle ASR fongbe fine-tuné sur MMS-300M
- **Performance** : **SOTA sur ALFFA test benchmark**
- **Spécificités** : Préserve diacritiques tonals, caractères orthographiques (ɖ, ɛ, ɔ, è, é)
- **Notes** : Peut servir de baseline ou point de départ
- **À tester** : ✅ OUI

---

## 📚 AUTRES RESSOURCES

### 16. **kitihounel - fongbe-lexicon**
- **Source** : GitHub
- **URL** : https://github.com/kitihounel/fongbe-lexicon
- **Description** : Lexique fongbe
- **À explorer** : Validation vocab

---

### 17. **kitihounel - fspell**
- **Source** : GitHub
- **URL** : https://github.com/kitihounel/fspell
- **Description** : Simple spell checker for Fongbe
- **À explorer** : Nettoyage données

---

### 18. **Radio NLP - Capp FM Downloader** ⭐ DÉJÀ LOCAL
- **Local** : `radio nlp/`
- **Description** : Système automatisé de téléchargement audio fongbe depuis SoundCloud (Capp FM)
- **Statut** : Opérationnel, à tester
- **Utilité** : Source continue de données audio réelles

---

## 📊 RÉSUMÉ

### Datasets Audio Prioritaires
1. **FFSTC 2** (61h) - À télécharger ⭐⭐⭐
2. **FFSTC v1** (31h) - À télécharger ⭐⭐
3. **Laleye Speech** (?h) - À télécharger ⭐
4. **Radio NLP** (continu) - À activer ⭐

### Datasets Texte Disponibles
- FFR corpus (8.8 MB) ✅
- 25K paires Kaggle ✅
- Dictionnaire JSON (6.4 MB) ✅

### Modèles Baseline
- Professor/mms-300m-fongbe (SOTA) ✅
- kingabzpro MT model

---

## 🎯 PROCHAINES ACTIONS

1. ✅ **Recherche datasets** - COMPLÉTÉE
2. [ ] **Télécharger FFSTC 2** (61h) - Trouver URL
3. [ ] **Télécharger FFSTC v1** (31h) - Trouver URL
4. [ ] **Télécharger Laleye dataset** (Zenodo)
5. [ ] **Tester Radio NLP downloader**
6. [ ] **Explorer HF datasets** (godwinh, kaith)
7. [ ] **Contacter auteurs** pour datasets privés/accès

---

**Note** : Certains datasets nécessitent de contacter les auteurs. Licences à vérifier avant usage.
