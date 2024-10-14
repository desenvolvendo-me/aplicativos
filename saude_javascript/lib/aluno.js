const IMC = require('./imc');
const TMB = require('./tmb');
const RCQ = require('./rcq');
const PG = require('./pg');

class Aluno {
    constructor({ peso = null, altura = null, idade = null, sexo = null, cintura = null, quadril = null } = {}) {
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
        this.sexo = sexo;
        this.cintura = cintura;
        this.quadril = quadril;
    }

    imc() {
        return IMC.calcular(this.peso, this.altura);
    }

    tmb() {
        // altura convertida para cm (por isso multiplicada por 100)
        return TMB.calcular(this.peso, this.altura * 100, this.idade, this.sexo);
    }

    rcq() {
        return RCQ.calcular(this.cintura, this.quadril);
    }

    pg() {
        return PG.calcular(this.imc(), this.idade, this.sexo);
    }
}

module.exports = Aluno;
