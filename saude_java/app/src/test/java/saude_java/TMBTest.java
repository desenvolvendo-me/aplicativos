package saude_java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TMBTest {

    @Test
    public void testCalcularTMBMasculino() {
        assertEquals(1695.36, TMB.calcular(70, 175, 30, "masculino"));
    }

    @Test
    public void testCalcularTMBFeminino() {
        assertEquals(1505.1, TMB.calcular(70, 175, 30, "feminino"));
    }

    @Test
    public void testSexoInvalido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            TMB.calcular(70, 175, 30, "outro");
        });
        assertEquals("Sexo deve ser 'masculino' ou 'feminino'", exception.getMessage());
    }
}
