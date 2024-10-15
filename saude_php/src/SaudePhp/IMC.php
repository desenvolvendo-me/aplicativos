<?php

namespace SaudePhp;

class IMC
{
    public static function calcular(float $peso, float $altura): float
    {
        if ($altura <= 0) {
            throw new \InvalidArgumentException("Altura deve ser maior que zero");
        }

        $imc = $peso / ($altura ** 2);
        return round($imc, 2);
    }

    public static function classificacao(float $imc): string
    {
        switch (true) {
            case $imc < 18.5:
                return "Abaixo do peso";
            case $imc >= 18.5 && $imc <= 24.9:
                return "Peso normal";
            case $imc >= 25 && $imc <= 29.9:
                return "Sobrepeso";
            case $imc >= 30 && $imc <= 34.9:
                return "Obesidade Grau 1";
            case $imc >= 35 && $imc <= 39.9:
                return "Obesidade Grau 2";
            default:
                return "Obesidade Grau 3 (mórbida)";
        }
    }
}
