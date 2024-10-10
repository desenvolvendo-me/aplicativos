package saude_java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlunoTest {

    @Test
    public void testIMC() {
        Aluno aluno = new Aluno(70, 1.75, 30, "masculino", 90, 99);
        assertEquals(22.86, aluno.imc());
    }

    @Test
    public void testTMB() {
        Aluno aluno = new Aluno(70, 1.75, 30, "masculino", 90, 99);
        assertEquals(1695.36, aluno.tmb());
    }

    @Test
    public void testRCQ() {
        Aluno aluno = new Aluno(70, 1.75, 30, "masculino", 90, 99);
        assertEquals(0.91, aluno.rcq());
    }


    @Test
    public void testPG() {
        Aluno aluno = new Aluno(70, 1.75, 30, "masculino", 90, 99);
        assertEquals(18.13, aluno.pg());
    }
}
