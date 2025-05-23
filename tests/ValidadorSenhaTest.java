import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorSenhaTest {

    @Test
    public void deveDetectarFaltaDeCaractereEspecial() {
        ResultadoValidacao resultado = ValidadorSenha.validar("Abc12345");
        assertFalse(resultado.isValida());
        assertTrue(resultado.getErros().contains("A senha deve conter pelo menos um caractere especial"));
    }
}