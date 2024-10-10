package saude_java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RCQTest {

    @Test
    public void testCalcularRCQ() {
        assertEquals(0.91, RCQ.calcular(90, 99));
        assertEquals(0.85, RCQ.calcular(85, 100));
    }

    @Test
    public void testClassificacaoMasculino() {
        double rcq = 0.91;
        String sexo = "masculino";
        assertEquals("Risco aumentado", RCQ.classificacao(rcq, sexo));
    }

    @Test
    public void testClassificacaoFeminino() {
        double rcq = 0.85;
        String sexo = "feminino";
        assertEquals("Baixo risco", RCQ.classificacao(rcq, sexo));
    }

    @Test
    public void testQuadrilInvalido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            RCQ.calcular(90, 0);
        });
        assertEquals("Quadril deve ser maior que zero", exception.getMessage());
    }

    @Test
    public void testSexoInvalido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            RCQ.classificacao(0.91, "outro");
        });
        assertEquals("Sexo deve ser 'masculino' ou 'feminino'", exception.getMessage());
    }
}
