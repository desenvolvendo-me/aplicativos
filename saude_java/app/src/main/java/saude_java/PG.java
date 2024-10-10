package saude_java;

public class PG {

    public static double calcular(double imc, int idade, String sexo) {
        if (!sexo.equalsIgnoreCase("masculino") && !sexo.equalsIgnoreCase("feminino")) {
            throw new IllegalArgumentException("Sexo deve ser 'masculino' ou 'feminino'");
        }

        int sexoFator = sexo.equalsIgnoreCase("masculino") ? 1 : 0;
        double percentual = (1.20 * imc) + (0.23 * idade) - (10.8 * sexoFator) - 5.4;
        return Math.round(percentual * 100.0) / 100.0;  // arredonda para duas casas decimais
    }
}
