import pytest
from src.saude_python.pg import PG

def test_calcular_percentual_gordura():
    assert PG.calcular(22.0, 25, "masculino") == 15.95
    assert PG.calcular(22.0, 25, "feminino") == 26.75
    with pytest.raises(ValueError):
        PG.calcular(22.0, 25, "outro")  # Teste para sexo inválido
