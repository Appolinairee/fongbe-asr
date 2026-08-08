"""Tests unitaires pour le dataset fongbe"""
import pytest
from datasets import load_from_disk
from pathlib import Path


@pytest.fixture
def dataset_path():
    return Path("data/processed/fongbe_asr_unified")


def test_dataset_exists(dataset_path):
    """Vérifier que le dataset existe"""
    assert dataset_path.exists(), f"Dataset {dataset_path} introuvable"
    

def test_dataset_structure(dataset_path):
    """Vérifier structure train/val/test"""
    ds = load_from_disk(dataset_path)
    
    assert "train" in ds
    assert "validation" in ds
    assert "test" in ds


def test_dataset_size(dataset_path):
    """Vérifier tailles des splits"""
    ds = load_from_disk(dataset_path)
    
    assert len(ds["train"]) == 10864
    assert len(ds["validation"]) == 1358
    assert len(ds["test"]) == 1359
    

def test_dataset_columns(dataset_path):
    """Vérifier colonnes du dataset"""
    ds = load_from_disk(dataset_path)
    
    required_cols = {"audio_path", "text", "source"}
    assert set(ds["train"].column_names) == required_cols
