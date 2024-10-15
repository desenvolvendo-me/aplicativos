<?php

use PHPUnit\Framework\TestCase;
use SaudePhp\RCQ;

class RCQTest extends TestCase
{
    public function testCalcularRCQ()
    {
        $rcq = RCQ::calcular(90, 100);
        $this->assertEquals(0.9, $rcq);
    }

    public function testClassificacaoMasculino()
    {
        $classificacao = RCQ::classificacao(0.92, 'masculino');
        $this->assertEquals("Risco aumentado", $classificacao);
    }

    public function testClassificacaoFeminino()
    {
        $classificacao = RCQ::classificacao(0.84, 'feminino');
        $this->assertEquals("Baixo risco", $classificacao);
    }

    public function testQuadrilInvalido()
    {
        $this->expectException(\InvalidArgumentException::class);
        RCQ::calcular(90, 0);
    }

    public function testSexoInvalido()
    {
        $this->expectException(\InvalidArgumentException::class);
        RCQ::classificacao(0.9, 'invalido');
    }
}
