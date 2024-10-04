# lib/saude_ruby/percentual_gordura.rb
module SaudeRuby
  class PG
    # Calcula o percentual de gordura corporal com base no IMC, idade e sexo
    def self.calcular(imc, idade, sexo)
      raise "Sexo deve ser 'masculino' ou 'feminino'" unless ["masculino", "feminino"].include?(sexo)

      sexo_fator = sexo == "masculino" ? 1 : 0
      percentual = (1.20 * imc) + (0.23 * idade) - (10.8 * sexo_fator) - 5.4
      format("%.2f", percentual).to_f
    end
  end
end
