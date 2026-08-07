# Plan d'Import des Skills - Projet Voice LLM Fongbe

## 🎯 Catégories de Skills à Importer

### 1. 🔧 **Ingénierie de Code** (Priorité HAUTE)

#### A. De `agent-skills/skills/`
```
✅ test-driven-development/          # TDD obligatoire
✅ code-review-and-quality/          # Quality assurance
✅ code-simplification/              # Code clean
✅ debugging-and-error-recovery/     # Debugging systématique
✅ documentation-and-adrs/           # Documentation technique
✅ git-workflow-and-versioning/      # Git best practices
✅ ci-cd-and-automation/             # CI/CD
✅ planning-and-task-breakdown/      # Planification
✅ incremental-implementation/       # Implémentation incrémentale
✅ api-and-interface-design/         # Design d'API
✅ performance-optimization/         # Performance
✅ observability-and-instrumentation/ # Monitoring
✅ security-and-hardening/           # Sécurité
✅ context-engineering/              # Context management
```

#### B. De `superpowers/skills/`
```
✅ test-driven-development/          # TDD (complémentaire)
✅ systematic-debugging/             # Debugging avancé
✅ writing-plans/                    # Planification de projet
✅ executing-plans/                  # Exécution de plans
✅ subagent-driven-development/      # Développement avec subagents
✅ verification-before-completion/   # Vérification finale
✅ brainstorming/                    # Brainstorming structuré
✅ using-git-worktrees/              # Git worktrees
✅ finishing-a-development-branch/   # Finalisation branches
```

#### C. De `alirezarezvani-claude-skills/engineering/`
```
✅ zero-hallucination-coder/         # Code sans hallucination
✅ karpathy-coder/                   # Style Karpathy (simple, from scratch)
✅ data-quality-auditor/             # Qualité des données
✅ autoresearch-agent/               # Recherche automatisée
```

### 2. 🔬 **Research & ML** (Priorité HAUTE)

#### De `ai-research-skills/`
```
✅ 0-autoresearch-skill/             # Recherche automatisée de papers
✅ 02-tokenization/                  # Tokenization (critique pour fongbe)
✅ 05-data-processing/               # Data processing (nemo-curator, ray-data)
✅ 18-multimodal/whisper/            # Speech recognition baseline
✅ 18-multimodal/audiocraft/         # Audio processing
✅ 01-model-architecture/            # Architectures de base
✅ 03-fine-tuning/                   # Fine-tuning (PEFT, LoRA, unsloth)
✅ 06-post-training/                 # Post-training
✅ 08-distributed-training/          # Training distribué
✅ 10-optimization/                  # Quantization, optimization
✅ 11-evaluation/                    # Evaluation frameworks
✅ 13-mlops/                         # Experiment tracking
✅ 20-ml-paper-writing/              # Paper writing
✅ 21-research-ideation/             # Research ideation
```

### 3. 📊 **Data Engineering** (Priorité HAUTE)

#### De `alirezarezvani-claude-skills/engineering/`
```
✅ data-quality-auditor/             # Audit qualité données
✅ statistical-analyst/              # Analyse statistique
```

### 4. 🧪 **Testing** (Priorité MOYENNE)

#### De `lambdatest-agent-skills/`
```
✅ pytest-skill/                     # Pytest pour Python
✅ shared/                           # Conventions de test
```

### 5. 📝 **Documentation & Workflow** (Priorité MOYENNE)

#### De `context-engineering-skills/`
```
✅ [sélection à affiner selon contenu]
```

---

## 📂 Structure Cible dans `/fongbe/skills/`

```
skills/
├── engineering/                     # Ingénierie de code
│   ├── tdd/                        # Test-Driven Development
│   ├── code-quality/               # Code review & quality
│   ├── debugging/                  # Debugging systématique
│   ├── documentation/              # Documentation
│   ├── git-workflow/               # Git best practices
│   ├── ci-cd/                      # CI/CD automation
│   ├── planning/                   # Planning & breakdown
│   ├── incremental-impl/           # Implementation incrémentale
│   ├── api-design/                 # API design
│   ├── performance/                # Performance optimization
│   ├── observability/              # Monitoring & instrumentation
│   ├── security/                   # Security & hardening
│   └── context-management/         # Context engineering
│
├── research/                        # Research skills
│   ├── autoresearch/               # Automated paper research
│   ├── paper-writing/              # Academic writing
│   ├── ideation/                   # Research ideation
│   └── evaluation/                 # Evaluation frameworks
│
├── ml-engineering/                  # ML Engineering
│   ├── architecture/               # Model architectures
│   ├── training/                   # Training skills
│   ├── fine-tuning/                # Fine-tuning (PEFT, LoRA)
│   ├── post-training/              # Post-training methods
│   ├── optimization/               # Quantization, optimization
│   └── mlops/                      # Experiment tracking
│
├── data/                            # Data Engineering
│   ├── processing/                 # Data pipelines
│   ├── tokenization/               # Tokenization for low-resource
│   ├── audio/                      # Audio processing
│   │   ├── whisper/                # Whisper integration
│   │   └── audiocraft/             # Audiocraft tools
│   ├── quality/                    # Data quality auditing
│   └── statistics/                 # Statistical analysis
│
├── testing/                         # Testing frameworks
│   ├── pytest/                     # Pytest skills
│   └── conventions/                # Testing conventions
│
└── workflow/                        # Workflow & productivity
    ├── subagent-dev/               # Subagent-driven development
    ├── verification/               # Verification before completion
    ├── brainstorming/              # Brainstorming
    └── git-advanced/               # Git worktrees, etc.
```

---

## 🚀 Commandes d'Import

### Phase 1: Engineering Essentials (À faire maintenant)

```bash
# Créer la structure de base
mkdir -p skills/{engineering,research,ml-engineering,data,testing,workflow}

# Engineering - Agent Skills
cp -r ~/starred-skills/development/agent-skills/skills/test-driven-development \
      skills/engineering/tdd/
cp -r ~/starred-skills/development/agent-skills/skills/code-review-and-quality \
      skills/engineering/code-quality/
cp -r ~/starred-skills/development/agent-skills/skills/code-simplification \
      skills/engineering/code-simplification/
cp -r ~/starred-skills/development/agent-skills/skills/debugging-and-error-recovery \
      skills/engineering/debugging/
cp -r ~/starred-skills/development/agent-skills/skills/documentation-and-adrs \
      skills/engineering/documentation/
cp -r ~/starred-skills/development/agent-skills/skills/git-workflow-and-versioning \
      skills/engineering/git-workflow/
cp -r ~/starred-skills/development/agent-skills/skills/ci-cd-and-automation \
      skills/engineering/ci-cd/
cp -r ~/starred-skills/development/agent-skills/skills/planning-and-task-breakdown \
      skills/engineering/planning/
cp -r ~/starred-skills/development/agent-skills/skills/incremental-implementation \
      skills/engineering/incremental-impl/
cp -r ~/starred-skills/development/agent-skills/skills/api-and-interface-design \
      skills/engineering/api-design/
cp -r ~/starred-skills/development/agent-skills/skills/performance-optimization \
      skills/engineering/performance/
cp -r ~/starred-skills/development/agent-skills/skills/observability-and-instrumentation \
      skills/engineering/observability/
cp -r ~/starred-skills/development/agent-skills/skills/security-and-hardening \
      skills/engineering/security/
cp -r ~/starred-skills/development/agent-skills/skills/context-engineering \
      skills/engineering/context-management/

# Engineering - Superpowers
cp -r ~/starred-skills/development/superpowers/skills/systematic-debugging \
      skills/engineering/systematic-debugging/
cp -r ~/starred-skills/development/superpowers/skills/writing-plans \
      skills/workflow/writing-plans/
cp -r ~/starred-skills/development/superpowers/skills/executing-plans \
      skills/workflow/executing-plans/
cp -r ~/starred-skills/development/superpowers/skills/subagent-driven-development \
      skills/workflow/subagent-dev/
cp -r ~/starred-skills/development/superpowers/skills/verification-before-completion \
      skills/workflow/verification/
cp -r ~/starred-skills/development/superpowers/skills/brainstorming \
      skills/workflow/brainstorming/
cp -r ~/starred-skills/development/superpowers/skills/using-git-worktrees \
      skills/workflow/git-worktrees/

# Engineering - Alirezarezvani specialized
cp -r ~/starred-skills/general/alirezarezvani-claude-skills/engineering/zero-hallucination-coder \
      skills/engineering/zero-hallucination/
cp -r ~/starred-skills/general/alirezarezvani-claude-skills/engineering/karpathy-coder \
      skills/engineering/karpathy-style/
cp -r ~/starred-skills/general/alirezarezvani-claude-skills/engineering/data-quality-auditor \
      skills/data/quality/
```

### Phase 2: Research & ML (Ensuite)

```bash
# Research
mkdir -p skills/research/{autoresearch,paper-writing,ideation}
cp -r ~/starred-skills/research/ai-research-skills/0-autoresearch-skill/* \
      skills/research/autoresearch/
cp -r ~/starred-skills/research/ai-research-skills/20-ml-paper-writing/* \
      skills/research/paper-writing/
cp -r ~/starred-skills/research/ai-research-skills/21-research-ideation/* \
      skills/research/ideation/

# Data processing
mkdir -p skills/data/{processing,tokenization,audio/{whisper,audiocraft}}
cp -r ~/starred-skills/research/ai-research-skills/05-data-processing/* \
      skills/data/processing/
cp -r ~/starred-skills/research/ai-research-skills/02-tokenization/* \
      skills/data/tokenization/
cp -r ~/starred-skills/research/ai-research-skills/18-multimodal/whisper/* \
      skills/data/audio/whisper/
cp -r ~/starred-skills/research/ai-research-skills/18-multimodal/audiocraft/* \
      skills/data/audio/audiocraft/

# ML Engineering
mkdir -p skills/ml-engineering/{architecture,training,fine-tuning,post-training,optimization,mlops}
cp -r ~/starred-skills/research/ai-research-skills/01-model-architecture/* \
      skills/ml-engineering/architecture/
cp -r ~/starred-skills/research/ai-research-skills/08-distributed-training/* \
      skills/ml-engineering/training/
cp -r ~/starred-skills/research/ai-research-skills/03-fine-tuning/* \
      skills/ml-engineering/fine-tuning/
cp -r ~/starred-skills/research/ai-research-skills/06-post-training/* \
      skills/ml-engineering/post-training/
cp -r ~/starred-skills/research/ai-research-skills/10-optimization/* \
      skills/ml-engineering/optimization/
cp -r ~/starred-skills/research/ai-research-skills/13-mlops/* \
      skills/ml-engineering/mlops/
cp -r ~/starred-skills/research/ai-research-skills/11-evaluation/* \
      skills/research/evaluation/
```

### Phase 3: Testing (Optionnel, plus tard)

```bash
mkdir -p skills/testing
cp -r ~/starred-skills/testing/lambdatest-agent-skills/pytest-skill \
      skills/testing/pytest/
cp -r ~/starred-skills/testing/lambdatest-agent-skills/shared \
      skills/testing/conventions/
```

---

## ✅ Checklist d'Utilisation Post-Import

Après l'import, créer des documents de référence :

1. **SKILLS_INDEX.md** - Index de toutes les skills avec descriptions
2. **SKILLS_USAGE.md** - Guide d'utilisation des skills
3. **.cursorrules** ou **CLAUDE.md** - Référencer les skills pour l'agent
4. **README.md** dans `/skills/` - Vue d'ensemble

---

## 📊 Estimation

- **Skills importées** : ~45-50 skills
- **Espace disque** : ~100-200 MB
- **Temps d'import** : 2-3 minutes
- **Temps d'organisation** : 10-15 minutes

---

## 🎯 Objectif Final

Avoir un ensemble complet de skills qui couvrent :
- ✅ **Code de qualité** (TDD, review, clean code)
- ✅ **Research** (papers, écriture académique)
- ✅ **ML Engineering** (architecture, training, évaluation)
- ✅ **Data Engineering** (processing, qualité, audio)
- ✅ **Workflow** (planification, subagents, vérification)

Ce setup permettra un développement rigoureux et professionnel du projet voice LLM fongbe.
