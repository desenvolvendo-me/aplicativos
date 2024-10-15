<?php

use PHPUnit\Framework\TestCase;
use SaudePhp\IMC;

class IMCTest extends TestCase
{
    public function testCalcularIMC()
    {
        $imc = IMC::calcular(70, 1.75);
        $this->assertEquals(22.86, $imc);
    }

    public function testClassificacaoIMC()
    {
        $classificacao = IMC::classificacao(22.86);
        $this->assertEquals("Peso normal", $classificacao);
    }

    public function testAlturaInvalida()
    {
        $this->expectException(InvalidArgumentException::class);
        IMC::calcular(70, 0);
    }
}
