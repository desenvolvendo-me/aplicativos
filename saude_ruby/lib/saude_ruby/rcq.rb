# lib/saude_ruby/rcq.rb
module SaudeRuby
  class RCQ
    def self.calcular(cintura, quadril)
      raise "Quadril deve ser maior que zero" if quadril <= 0
      rcq = cintura.to_f / quadril.to_f
      format("%.2f", rcq).to_f
    end

    def self.classificacao(rcq, sexo)
      if sexo == "masculino"
        rcq > 0.9 ? "Risco aumentado" : "Baixo risco"
      elsif sexo == "feminino"
        rcq > 0.85 ? "Risco aumentado" : "Baixo risco"
      else
        raise "Sexo deve ser 'masculino' ou 'feminino'"
      end
    end
  end
end
