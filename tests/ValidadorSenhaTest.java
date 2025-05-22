import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorSenhaTest {

    @Test
    public void testSenhaComMenosDe2Digitos_DeveRetornarErro() {
        ResultadoValidacao resultado = ValidadorSenha.validarSenha("Abcdefg!");
        assertFalse(resultado.isValida());
        assertTrue(resultado.getErros().contains("A senha deve conter pelo menos 2 dígitos"));
    }
}