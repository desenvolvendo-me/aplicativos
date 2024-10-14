class TMB {
    static calcular(peso, altura, idade, sexo) {
        let tmb;

        if (sexo === 'masculino') {
            tmb = 88.36 + (13.4 * peso) + (4.8 * altura) - (5.7 * idade);
        } else if (sexo === 'feminino') {
            tmb = 447.6 + (9.2 * peso) + (3.1 * altura) - (4.3 * idade);
        } else {
            throw new Error("Sexo deve ser 'masculino' ou 'feminino'");
        }

        return parseFloat(tmb.toFixed(2));
    }
}

module.exports = TMB;
