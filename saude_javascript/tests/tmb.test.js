const TMB = require('../lib/tmb');

describe('TMB (Taxa Metabólica Basal)', () => {
    test('Deve calcular corretamente a TMB para homem', () => {
        const tmb = TMB.calcular(70, 175, 30, 'masculino');
        expect(tmb).toBeCloseTo(1695.36, 2);
    });

    test('Deve calcular corretamente a TMB para mulher', () => {
        const tmb = TMB.calcular(70, 175, 30, 'feminino');
        expect(tmb).toBeCloseTo(1505.1, 2);
    });

    test('Deve lançar erro para sexo inválido', () => {
        expect(() => {
            TMB.calcular(70, 175, 30, 'outro');
        }).toThrow("Sexo deve ser 'masculino' ou 'feminino'");
    });
});
