<?php

namespace SaudePhp;

class PG
{
    /**
     * Calcula o percentual de gordura corporal com base no IMC, idade e sexo.
     *
     * @param float  $imc
     * @param int    $idade
     * @param string $sexo
     *
     * @return float
     *
     * @throws \InvalidArgumentException
     */
    public static function calcular(float $imc, int $idade, string $sexo): float
    {
        if (!in_array($sexo, ['masculino', 'feminino'])) {
            throw new \InvalidArgumentException("Sexo deve ser 'masculino' ou 'feminino'");
        }

        $sexoFator = $sexo === 'masculino' ? 1 : 0;
        $percentual = (1.20 * $imc) + (0.23 * $idade) - (10.8 * $sexoFator) - 5.4;

        return round($percentual, 2);
    }
}
