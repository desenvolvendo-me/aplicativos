const Aluno = require('../lib/aluno');

describe('Aluno', () => {
    test('Deve calcular o IMC corretamente', () => {
        const aluno = new Aluno({ peso: 70, altura: 1.75 });
        const imc = aluno.imc();
        expect(imc).toBeCloseTo(22.86, 2);
    });

    test('Deve calcular a TMB corretamente', () => {
        const aluno = new Aluno({ peso: 70, altura: 1.75, idade: 30, sexo: 'masculino' });
        const tmb = aluno.tmb();
        expect(tmb).toBeCloseTo(1695.36, 2);
    });

    test('Deve calcular o RCQ corretamente', () => {
        const aluno = new Aluno({ cintura: 90, quadril: 100 });
        const rcq = aluno.rcq();
        expect(rcq).toBeCloseTo(0.90, 2);
    });

    test('Deve calcular o Percentual de Gordura Corporal corretamente', () => {
        const aluno = new Aluno({ peso: 70, altura: 1.75, idade: 30, sexo: 'masculino' });
        const pg = aluno.pg();
        expect(pg).toBeCloseTo(18.13, 2);
    });
});
