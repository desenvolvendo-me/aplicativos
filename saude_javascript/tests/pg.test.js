const PG = require('../lib/pg');

describe('PG (Percentual de Gordura)', () => {
  test('Deve calcular corretamente o percentual de gordura para homem', () => {
    const percentual = PG.calcular(22.86, 30, 'masculino');
    expect(percentual).toBeCloseTo(18.13, 2);
  });

  test('Deve calcular corretamente o percentual de gordura para mulher', () => {
    const percentual = PG.calcular(22.86, 30, 'feminino');
    expect(percentual).toBeCloseTo(28.93, 2);
  });

  test('Deve lançar erro para sexo inválido', () => {
    expect(() => {
      PG.calcular(22.86, 30, 'outro');
    }).toThrow("Sexo deve ser 'masculino' ou 'feminino'");
  });
});
