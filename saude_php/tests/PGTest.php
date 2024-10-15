<?php

use PHPUnit\Framework\TestCase;
use SaudePhp\PG;

class PGTest extends TestCase
{
    public function testCalcularPGMasculino()
    {
        $percentual = PG::calcular(22.86, 30, 'masculino');
        $this->assertEquals(18.13, $percentual);
    }

    public function testCalcularPGFeminino()
    {
        $percentual = PG::calcular(22.86, 30, 'feminino');
        $this->assertEquals(28.93, $percentual);
    }

    public function testSexoInvalido()
    {
        $this->expectException(\InvalidArgumentException::class);
        PG::calcular(22.86, 30, 'invalido');
    }
}
