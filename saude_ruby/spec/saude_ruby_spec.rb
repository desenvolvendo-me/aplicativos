# spec/saude_ruby_spec.rb
RSpec.describe SaudeRuby do
  it "calcula o IMC corretamente" do
    imc = SaudeRuby::IMC.calcular(70, 1.75)
    expect(imc).to eq(22.86)
  end

  it "calcula o TMB para homens corretamente" do
    tmb = SaudeRuby::TMB.calcular(70, 175, 30, "masculino")
    expect(tmb).to eq(1695.36)
  end

  it "calcula o RCQ corretamente" do
    rcq = SaudeRuby::RCQ.calcular(80, 100)
    expect(rcq).to eq(0.8)
  end

  it "calcula o Percentual de Gordura Corporal corretamente para homens" do
    imc = 22.86
    percentual_gordura = SaudeRuby::PG.calcular(imc, 30, "masculino")
    expect(percentual_gordura).to eq(18.13)
  end

  it "calcula o Percentual de Gordura Corporal corretamente para mulheres" do
    imc = 22.86
    percentual_gordura = SaudeRuby::PG.calcular(imc, 30, "feminino")
    expect(percentual_gordura).to eq(28.93)
  end
end
