class PG:
    @staticmethod
    def calcular(imc, idade, sexo):
        if sexo not in ["masculino", "feminino"]:
            raise ValueError("Sexo deve ser 'masculino' ou 'feminino'")
        
        sexo_fator = 1 if sexo == "masculino" else 0
        percentual = (1.20 * imc) + (0.23 * idade) - (10.8 * sexo_fator) - 5.4
        return round(percentual, 2)
