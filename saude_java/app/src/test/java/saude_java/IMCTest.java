package saude_java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IMCTest {
    
    @Test
    public void testCalcularIMC() {
        assertEquals(24.49, IMC.calcular(75, 1.75));
        assertEquals(29.39, IMC.calcular(90, 1.75));
    }
    
    @Test
    public void testClassificacaoIMC() {
        assertEquals("Peso normal", IMC.classificacao(24.69));
        assertEquals("Sobrepeso", IMC.classificacao(29.41));
    }
    
    @Test
    public void testAlturaInvalida() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            IMC.calcular(75, 0);
        });
        assertEquals("Altura deve ser maior que zero", exception.getMessage());
    }
}
