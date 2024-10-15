<?php

use PHPUnit\Framework\TestCase;
use SaudePhp\TMB;

class TMBTest extends TestCase
{
    public function testCalcularTMBMasculino()
    {
        $tmb = TMB::calcular(70, 175, 30, 'masculino');
        $this->assertEquals(1688.36, $tmb);
    }

    public function testCalcularTMBFeminino()
    {
        $tmb = TMB::calcular(60, 160, 25, 'feminino');
        $this->assertEquals(1421.15, $tmb);
    }

    public function testSexoInvalido()
    {
        $this->expectException(\InvalidArgumentException::class);
        TMB::calcular(70, 175, 30, 'invalido');
    }
}
