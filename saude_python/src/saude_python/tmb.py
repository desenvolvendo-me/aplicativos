class TMB:
    @staticmethod
    def calcular(peso, altura, idade, sexo):
        if sexo == "masculino":
            tmb = 88.36 + (13.4 * peso) + (4.8 * altura) - (5.7 * idade)
        elif sexo == "feminino":
            tmb = 447.6 + (9.2 * peso) + (3.1 * altura) - (4.3 * idade)
        else:
            raise ValueError("Sexo deve ser 'masculino' ou 'feminino'")
        return round(tmb, 2)
