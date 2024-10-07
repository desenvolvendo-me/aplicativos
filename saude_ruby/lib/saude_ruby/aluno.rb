# lib/saude_ruby/aluno.rb
module SaudeRuby
  class Aluno
    attr_reader :peso, :altura, :idade, :sexo, :cintura, :quadril

    def initialize(peso: nil, altura: nil, idade: nil, sexo: nil, cintura: nil, quadril: nil)
      @peso = peso
      @altura = altura
      @idade = idade
      @sexo = sexo
      @cintura = cintura
      @quadril = quadril
    end

    def imc
      IMC.calcular(@peso, @altura)
    end

    def tmb
      TMB.calcular(@peso, @altura * 100, @idade, @sexo) # altura convertida para cm
    end

    def rcq
      RCQ.calcular(@cintura, @quadril)
    end

    def pg
      PG.calcular(imc, @idade, @sexo)
    end
  end
end
