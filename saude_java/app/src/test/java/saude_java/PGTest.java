package saude_java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PGTest {

    @Test
    public void testCalcularPercentualMasculino() {
        double imc = 24.69;
        int idade = 30;
        String sexo = "masculino";
        assertEquals(20.33, PG.calcular(imc, idade, sexo));
    }

    @Test
    public void testCalcularPercentualFeminino() {
        double imc = 24.69;
        int idade = 30;
        String sexo = "feminino";
        assertEquals(31.13, PG.calcular(imc, idade, sexo));
    }

    @Test
    public void testSexoInvalido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            PG.calcular(24.69, 30, "outro");
        });
        assertEquals("Sexo deve ser 'masculino' ou 'feminino'", exception.getMessage());
    }
}
