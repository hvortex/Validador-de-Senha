import java.util.ArrayList;
import java.util.List;

public class ValidadorSenha {

    public static ResultadoValidacao validarSenha(String senha) {
        List<String> erros = new ArrayList<>();

        if (senha.length() < 8) {
            erros.add("A senha deve ter pelo menos 8 caracteres");
        }

                long digitos = senha.chars().filter(Character::isDigit).count();
        if (digitos < 2) {
            erros.add("A senha deve conter pelo menos 2 dígitos");
        }

                if (senha.chars().noneMatch(Character::isUpperCase)) {
            erros.add("A senha deve conter pelo menos uma letra maiuscula");
        }

        return new ResultadoValidacao(erros.isEmpty(), erros);
    }
}
