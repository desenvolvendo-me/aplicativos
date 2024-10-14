class RCQ:
    @staticmethod
    def calcular(cintura, quadril):
        if quadril <= 0:
            raise ValueError("Quadril deve ser maior que zero")
        rcq = cintura / quadril
        return round(rcq, 2)

    @staticmethod
    def classificacao(rcq, sexo):
        if sexo == "masculino":
            return "Risco aumentado" if rcq > 0.9 else "Baixo risco"
        elif sexo == "feminino":
            return "Risco aumentado" if rcq > 0.85 else "Baixo risco"
        else:
            raise ValueError("Sexo deve ser 'masculino' ou 'feminino'")
