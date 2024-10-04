# lib/saude_ruby/tmb.rb
module SaudeRuby
  class TMB
    def self.calcular(peso, altura, idade, sexo)
      if sexo == "masculino"
        tmb = 88.36 + (13.4 * peso) + (4.8 * altura) - (5.7 * idade)
      elsif sexo == "feminino"
        tmb = 447.6 + (9.2 * peso) + (3.1 * altura) - (4.3 * idade)
      else
        raise "Sexo deve ser 'masculino' ou 'feminino'"
      end
      format("%.2f", tmb).to_f
    end
  end
end
