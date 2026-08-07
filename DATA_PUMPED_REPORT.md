# 🚀 RAPPORT DE POMPAGE - Données Fongbe

**Date**: 2026-08-07  
**Statut**: Pompage massif phase 1 complété

---

## 📊 RÉSUMÉ GLOBAL

- **Taille totale**: 3.7 GB
- **Audio total**: **12.78h** 🎉
- **Fichiers audio**: 13,581 
- **Fichiers texte**: 3,406
- **Datasets**: 14

---

## ✅ DATASETS POMPÉS

### Audio (12.78h confirmées ✅)
1. **Laleye Zenodo** - 3,179 samples, 5.6h, 13 speakers ✅
2. **pyFongbe** - 10,402 samples, 7.18h, train/test splits ✅
3. **godwinh/fongbe-asr** - HF dataset (à analyser) ✅
4. **masakhane** - Datasets MT ✅

### Texte (~100K+ paires)
1. **FFR v1** - 53,975 paires fon-français ✅
2. **FFR v2** - Dataset étendu ✅
3. **kaith HF** - 11,919 samples ✅
4. **masakhane-mt** - Corpus MT ✅
5. **Collecte locale** - ~25K paires ✅
6. **Dictionnaires** - 6.4 MB JSON ✅

---

## ❌ PAS ENCORE POMPÉS (Gros volumes)

### Audio prioritaire
- **FFSTC v1** - 31h (besoin contact Fortune Kponou)
- **FFSTC 2** - 61h (besoin contact Fortune Kponou)
- **Radio NLP** - Système scraping local (à activer)

### Sources web à scraper
- JW.org (restrictions extraction)
- fongbebenin.com
- beninlangues.com
- YouTube podcasts fongbe
- CMU Wilderness (non accessible)
- Bible corpora (certains échoués)

---

## 🎯 PROCHAINES ACTIONS

**Court terme** (données accessibles):
1. Activer Radio NLP scraping
2. Tenter autres liens Bible/Tatoeba
3. Contacter auteurs FFSTC

**Moyen terme** (scraping agressif):
1. YouTube/podcasts fongbe
2. Sites web fongbe
3. Apps mobiles (extraction)

**Alternative**: 
- Commencer baseline avec 5.6h audio + 100K texte disponibles

---

## 📁 STRUCTURE DATA

```
data/raw/
├── Fongbe_Speech_Dataset/    # 5.6h audio (Laleye)
├── ffr-v1/                    # 54K paires texte
├── kaith_dataset_fongbe/      # 12K samples
├── godwinh_fongbe-asr/        # Dataset ASR
├── masakhane-mt/              # MT corpus
├── pyFongbe/                  # Outils + data
└── [9 autres datasets]

collecte/
├── fon-fr.txt/                # 8.7 MB
├── 4432712/                   # 25K paires
└── dictionnaires/             # 6.4 MB
```

---

## 🎯 BILAN

**✅ TOTAL AUDIO ACTUEL: 12.78h** (Laleye 5.6h + pyFongbe 7.18h)  
**🎯 OBJECTIF FINAL: 90h+** (FFSTC v1+v2)  
**📉 Gap restant: 77h à récupérer**

**Avec 12.78h audio + 100K+ texte → BASELINE VIABLE !**
