<?php

namespace SaudePhp;

class TMB
{
    /**
     * Calcula a Taxa Metabólica Basal (TMB) com base no peso, altura, idade e sexo.
     *
     * @param float  $peso
     * @param float  $altura
     * @param int    $idade
     * @param string $sexo
     *
     * @return float
     *
     * @throws \InvalidArgumentException
     */
    public static function calcular(float $peso, float $altura, int $idade, string $sexo): float
    {
        if ($sexo === 'masculino') {
            $tmb = 88.36 + (13.4 * $peso) + (4.8 * $altura) - (5.7 * $idade);
        } elseif ($sexo === 'feminino') {
            $tmb = 447.6 + (9.2 * $peso) + (3.1 * $altura) - (4.3 * $idade);
        } else {
            throw new \InvalidArgumentException("Sexo deve ser 'masculino' ou 'feminino'");
        }

        return round($tmb, 2);
    }
}
