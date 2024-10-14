import pytest
from src.saude_python.tmb import TMB

def test_calcular_tmb():
    assert TMB.calcular(70, 175, 25, "masculino") == 1723.86
    assert TMB.calcular(60, 160, 30, "feminino") == 1366.6
    with pytest.raises(ValueError):
        TMB.calcular(70, 175, 25, "outro")  # Teste para sexo inválido
