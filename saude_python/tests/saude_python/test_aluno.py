import pytest
from src.saude_python.aluno import Aluno

def test_aluno_imc():
    aluno = Aluno(peso=70, altura=1.75)
    assert aluno.imc() == 22.86

def test_aluno_tmb():
    aluno = Aluno(peso=70, altura=1.75, idade=25, sexo="masculino")
    assert aluno.tmb() == 1723.86

def test_aluno_rcq():
    aluno = Aluno(cintura=80, quadril=90)
    assert aluno.rcq() == 0.89

def test_aluno_pg():
    aluno = Aluno(peso=70, altura=1.75, idade=25, sexo="masculino")
    assert aluno.pg() == 16.98