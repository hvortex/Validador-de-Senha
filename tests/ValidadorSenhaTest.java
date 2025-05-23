import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorSenhaTest {

    @Test
<<<<<<< HEAD
    public void deveDetectarFaltaDeCaractereEspecial() {
        ResultadoValidacao resultado = ValidadorSenha.validar("Abc12345");
        assertFalse(resultado.isValida());
        assertTrue(resultado.getErros().contains("A senha deve conter pelo menos um caractere especial"));
=======
    public void testSenhaSemLetraMaiuscula_DeveRetornarErro() {
        ResultadoValidacao resultado = ValidadorSenha.validarSenha("AAbc12345@#$!");
        assertFalse(resultado.isValida());
        assertTrue(resultado.getErros().contains("A senha deve conter pelo menos uma letra maiuscula"));
>>>>>>> 3e486a9d831e35106537382f30d77b652e63568b
    }
}
