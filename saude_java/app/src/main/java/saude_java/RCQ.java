package saude_java;

public class RCQ {

    public static double calcular(double cintura, double quadril) {
        if (quadril <= 0) {
            throw new IllegalArgumentException("Quadril deve ser maior que zero");
        }
        double rcq = cintura / quadril;
        return Math.round(rcq * 100.0) / 100.0;  // arredonda para duas casas decimais
    }

    public static String classificacao(double rcq, String sexo) {
        if (sexo.equalsIgnoreCase("masculino")) {
            return rcq > 0.9 ? "Risco aumentado" : "Baixo risco";
        } else if (sexo.equalsIgnoreCase("feminino")) {
            return rcq > 0.85 ? "Risco aumentado" : "Baixo risco";
        } else {
            throw new IllegalArgumentException("Sexo deve ser 'masculino' ou 'feminino'");
        }
    }
}
