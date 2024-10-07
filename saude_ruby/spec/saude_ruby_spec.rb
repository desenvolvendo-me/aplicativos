# spec/saude_ruby_spec.rb
RSpec.describe SaudeRuby do
  before(:each) do
    @aluno = SaudeRuby::Aluno.new(peso: 70, altura: 1.75, idade: 30, sexo: "masculino", cintura: 80, quadril: 100)
  end

  it "calcula o IMC corretamente" do
    expect(@aluno.imc).to eq(22.86)
  end

  it "calcula o TMB para homens corretamente" do
    expect(@aluno.tmb).to eq(1695.36)
  end

  it "calcula o RCQ corretamente" do
    expect(@aluno.rcq).to eq(0.8)
  end

  it "calcula o Percentual de Gordura Corporal corretamente para homens" do
    expect(@aluno.pg).to eq(18.13)
  end
end
