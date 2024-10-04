# lib/saude_ruby/imc.rb
module SaudeRuby
  class IMC
    def self.calcular(peso, altura)
      raise "Altura deve ser maior que zero" if altura <= 0
      imc = peso / (altura ** 2)
      format("%.2f", imc).to_f
    end

    def self.classificacao(imc)
      case imc
      when 0..18.4 then "Abaixo do peso"
      when 18.5..24.9 then "Peso normal"
      when 25..29.9 then "Sobrepeso"
      when 30..34.9 then "Obesidade Grau 1"
      when 35..39.9 then "Obesidade Grau 2"
      else "Obesidade Grau 3 (mórbida)"
      end
    end
  end
end
