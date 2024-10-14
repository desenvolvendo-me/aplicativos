const RCQ = require('../lib/rcq');

describe('RCQ (Relação Cintura-Quadril)', () => {
    test('Deve calcular corretamente o RCQ', () => {
        const rcq = RCQ.calcular(90, 100);
        expect(rcq).toBeCloseTo(0.90, 2);
    });

    test('Deve lançar erro para quadril igual ou menor que zero', () => {
        expect(() => {
            RCQ.calcular(90, 0);
        }).toThrow('Quadril deve ser maior que zero');
    });

    test('Deve classificar corretamente o RCQ para homem', () => {
        const classificacao = RCQ.classificacao(0.91, 'masculino');
        expect(classificacao).toBe('Risco aumentado');
    });

    test('Deve classificar corretamente o RCQ para mulher', () => {
        const classificacao = RCQ.classificacao(0.86, 'feminino');
        expect(classificacao).toBe('Risco aumentado');
    });

    test('Deve lançar erro para sexo inválido', () => {
        expect(() => {
            RCQ.classificacao(0.91, 'outro');
        }).toThrow("Sexo deve ser 'masculino' ou 'feminino'");
    });
});
