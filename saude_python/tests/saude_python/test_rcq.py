import pytest
from src.saude_python.rcq import RCQ

def test_calcular_rcq():
    assert RCQ.calcular(80, 90) == 0.89
    assert RCQ.calcular(70, 85) == 0.82
    with pytest.raises(ValueError):
        RCQ.calcular(80, 0)  # Teste para quadril inválido

def test_classificacao_rcq():
    assert RCQ.classificacao(0.91, "masculino") == "Risco aumentado"
    assert RCQ.classificacao(0.89, "masculino") == "Baixo risco"
    assert RCQ.classificacao(0.86, "feminino") == "Risco aumentado"
    assert RCQ.classificacao(0.84, "feminino") == "Baixo risco"
    with pytest.raises(ValueError):
        RCQ.classificacao(0.85, "outro")  # Teste para sexo inválido
