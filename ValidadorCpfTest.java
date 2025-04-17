import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ValidadorCpfTest {

    @Test
    public void testCpfValido() {
        assertTrue(ValidadorCpf.validarTamanhoCpf("12345678901"));
    }

    @Test
    public void testCpfComMenosDigitos() {
        assertFalse(ValidadorCpf.validarTamanhoCpf("12345678"));
    }

    @Test
    public void testCpfComMaisDigitos() {
        assertFalse(ValidadorCpf.validarTamanhoCpf("123456789012"));
    }

    @Test
    public void testCpfNulo() {
        assertFalse(false);
    }
}

