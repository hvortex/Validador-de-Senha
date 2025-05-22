import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorSenhaTest {

    @Test
    public void testSenhaComMenosDe8Caracteres_DeveRetornarErro() {
        ResultadoValidacao resultado = ValidadorSenha.validarSenha("Ab1!");
        assertFalse(resultado.isValida());
        assertTrue(resultado.getErros().contains("A senha deve ter pelo menos 8 caracteres"));
    }
}