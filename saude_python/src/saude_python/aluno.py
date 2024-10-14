from src.saude_python.imc import IMC
from src.saude_python.tmb import TMB
from src.saude_python.rcq import RCQ
from src.saude_python.pg import PG

class Aluno:
    def __init__(self, peso=None, altura=None, idade=None, sexo=None, cintura=None, quadril=None):
        self.peso = peso
        self.altura = altura
        self.idade = idade
        self.sexo = sexo
        self.cintura = cintura
        self.quadril = quadril

    def imc(self):
        return IMC.calcular(self.peso, self.altura)

    def tmb(self):
        # Multiplicamos a altura por 100 para converter para centímetros
        return TMB.calcular(self.peso, self.altura * 100, self.idade, self.sexo)

    def rcq(self):
        return RCQ.calcular(self.cintura, self.quadril)

    def pg(self):
        return PG.calcular(self.imc(), self.idade, self.sexo)
