import pytest
from src.saude_python.imc import IMC

def test_calcular_imc():
    assert IMC.calcular(70, 1.75) == 22.86
    assert IMC.calcular(50, 1.60) == 19.53
    with pytest.raises(ValueError):
        IMC.calcular(70, 0)

def test_classificacao_imc():
    assert IMC.classificacao(18.0) == "Abaixo do peso"
    assert IMC.classificacao(22.0) == "Peso normal"
    assert IMC.classificacao(28.0) == "Sobrepeso"
    assert IMC.classificacao(32.0) == "Obesidade Grau 1"
    assert IMC.classificacao(37.0) == "Obesidade Grau 2"
    assert IMC.classificacao(42.0) == "Obesidade Grau 3 (mórbida)"
