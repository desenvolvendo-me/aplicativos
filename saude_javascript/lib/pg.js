class PG {
    // Calcula o percentual de gordura corporal com base no IMC, idade e sexo
    static calcular(imc, idade, sexo) {
      if (!["masculino", "feminino"].includes(sexo)) {
        throw new Error("Sexo deve ser 'masculino' ou 'feminino'");
      }
  
      const sexoFator = sexo === 'masculino' ? 1 : 0;
      const percentual = (1.20 * imc) + (0.23 * idade) - (10.8 * sexoFator) - 5.4;
      return parseFloat(percentual.toFixed(2));
    }
  }
  
  module.exports = PG;
  