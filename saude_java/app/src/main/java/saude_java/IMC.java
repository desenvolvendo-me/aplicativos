package saude_java;

public class IMC {
    
    public static double calcular(double peso, double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("Altura deve ser maior que zero");
        }
        double imc = peso / (altura * altura);
        return Math.round(imc * 100.0) / 100.0;
    }
    
    public static String classificacao(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else if (imc < 35) {
            return "Obesidade Grau 1";
        } else if (imc < 40) {
            return "Obesidade Grau 2";
        } else {
            return "Obesidade Grau 3 (mórbida)";
        }
    }
}
