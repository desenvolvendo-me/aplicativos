const IMC = require('../lib/imc');

describe('IMC', () => {
  test('Deve calcular o IMC corretamente', () => {
    const imc = IMC.calcular(70, 1.75);
    expect(imc).toBeCloseTo(22.86, 2);
  });

  test('Deve lançar erro para altura inválida', () => {
    expect(() => {
      IMC.calcular(70, 0);
    }).toThrow('Altura deve ser maior que zero');
  });

  test('Deve retornar a classificação correta', () => {
    const classificacao = IMC.classificacao(22.86);
    expect(classificacao).toBe('Peso normal');
  });
});
