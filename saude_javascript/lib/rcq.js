class RCQ {
    static calcular(cintura, quadril) {
        if (quadril <= 0) {
            throw new Error('Quadril deve ser maior que zero');
        }

        const rcq = cintura / quadril;
        return parseFloat(rcq.toFixed(2));
    }

    static classificacao(rcq, sexo) {
        if (sexo === 'masculino') {
            return rcq > 0.9 ? 'Risco aumentado' : 'Baixo risco';
        } else if (sexo === 'feminino') {
            return rcq > 0.85 ? 'Risco aumentado' : 'Baixo risco';
        } else {
            throw new Error("Sexo deve ser 'masculino' ou 'feminino'");
        }
    }
}

module.exports = RCQ;
