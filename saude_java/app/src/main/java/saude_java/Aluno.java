package saude_java;

public class Aluno {

    private double peso;
    private double altura;
    private int idade;
    private String sexo;
    private double cintura;
    private double quadril;

    public Aluno(double peso, double altura, int idade, String sexo, double cintura, double quadril) {
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
        this.sexo = sexo;
        this.cintura = cintura;
        this.quadril = quadril;
    }

    public double imc() {
        return IMC.calcular(peso, altura);
    }

    public double tmb() {
        // Altura convertida para centímetros
        return TMB.calcular(peso, altura * 100, idade, sexo);
    }

    public double rcq() {
        return RCQ.calcular(cintura, quadril);
    }

    public double pg() {
        return PG.calcular(imc(), idade, sexo);
    }

    // Getters para as variáveis (se necessário)
    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public double getCintura() {
        return cintura;
    }

    public double getQuadril() {
        return quadril;
    }
}
