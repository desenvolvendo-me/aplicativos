class IMC:
    @staticmethod
    def calcular(peso, altura):
        if altura <= 0:
            raise ValueError("Altura deve ser maior que zero")
        imc = peso / (altura ** 2)
        return round(imc, 2)

    @staticmethod
    def classificacao(imc):
        if imc < 18.5:
            return "Abaixo do peso"
        elif 18.5 <= imc <= 24.9:
            return "Peso normal"
        elif 25 <= imc <= 29.9:
            return "Sobrepeso"
        elif 30 <= imc <= 34.9:
            return "Obesidade Grau 1"
        elif 35 <= imc <= 39.9:
            return "Obesidade Grau 2"
        else:
            return "Obesidade Grau 3 (mórbida)"
