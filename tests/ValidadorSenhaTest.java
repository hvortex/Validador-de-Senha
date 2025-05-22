import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorSenhaTest {

    @Test
    public void testSenhaSemLetraMaiuscula_DeveRetornarErro() {
        ResultadoValidacao resultado = ValidadorSenha.validarSenha("AAbc12345@#$!");
        assertFalse(resultado.isValida());
        assertTrue(resultado.getErros().contains("A senha deve conter pelo menos uma letra maiuscula"));
    }
}
