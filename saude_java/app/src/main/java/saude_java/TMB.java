package saude_java;

public class TMB {

    public static double calcular(double peso, double altura, int idade, String sexo) {
        double tmb;
        if (sexo.equalsIgnoreCase("masculino")) {
            tmb = 88.36 + (13.4 * peso) + (4.8 * altura) - (5.7 * idade);
        } else if (sexo.equalsIgnoreCase("feminino")) {
            tmb = 447.6 + (9.2 * peso) + (3.1 * altura) - (4.3 * idade);
        } else {
            throw new IllegalArgumentException("Sexo deve ser 'masculino' ou 'feminino'");
        }
        return Math.round(tmb * 100.0) / 100.0;  // arredonda para duas casas decimais
    }
}
