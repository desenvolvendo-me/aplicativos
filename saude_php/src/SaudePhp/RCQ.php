<?php

namespace SaudePhp;

class RCQ
{
    /**
     * Calcula a razão cintura-quadril (RCQ).
     *
     * @param float $cintura
     * @param float $quadril
     *
     * @return float
     *
     * @throws \InvalidArgumentException
     */
    public static function calcular(float $cintura, float $quadril): float
    {
        if ($quadril <= 0) {
            throw new \InvalidArgumentException("Quadril deve ser maior que zero");
        }

        $rcq = $cintura / $quadril;
        return round($rcq, 2);
    }

    /**
     * Classifica a razão cintura-quadril (RCQ) com base no sexo.
     *
     * @param float  $rcq
     * @param string $sexo
     *
     * @return string
     *
     * @throws \InvalidArgumentException
     */
    public static function classificacao(float $rcq, string $sexo): string
    {
        if ($sexo === 'masculino') {
            return $rcq > 0.9 ? "Risco aumentado" : "Baixo risco";
        } elseif ($sexo === 'feminino') {
            return $rcq > 0.85 ? "Risco aumentado" : "Baixo risco";
        } else {
            throw new \InvalidArgumentException("Sexo deve ser 'masculino' ou 'feminino'");
        }
    }
}
