import java.util.ArrayList;
import java.util.List;

public class ValidadorSenha {

    public static ResultadoValidacao validar(String senha) {
        List<String> erros = new ArrayList<>();

        if (senha.length() < 8) {
            erros.add("A senha deve ter pelo menos 8 caracteres");
        }

<<<<<<< HEAD
        long quantidadeDigitos = senha.chars().filter(Character::isDigit).count();
        if (quantidadeDigitos < 2) {
            erros.add("A senha deve conter pelo menos 2 dígitos");
        }

        boolean contemMaiuscula = senha.chars().anyMatch(Character::isUpperCase);
        if (!contemMaiuscula) {
            erros.add("A senha deve conter pelo menos uma letra maiuscula");
        }

        boolean contemEspecial = senha.chars().anyMatch(
            c -> "!@#$%^&*()-_=+[]{}|;:'",.<>?/\\`~".indexOf(c) >= 0
        );
        if (!contemEspecial) {
=======
                long digitos = senha.chars().filter(Character::isDigit).count();
        if (digitos < 2) {
            erros.add("A senha deve conter pelo menos 2 dígitos");
        }

                if (senha.chars().noneMatch(Character::isUpperCase)) {
            erros.add("A senha deve conter pelo menos uma letra maiuscula");
        }

        if (senha.chars().noneMatch(c -> "!@#$%^&*()-_=+[]{}|;:'\",.<>?/\\`~".indexOf(c) >= 0)) {
>>>>>>> 3e486a9d831e35106537382f30d77b652e63568b
            erros.add("A senha deve conter pelo menos um caractere especial");
        }

        return new ResultadoValidacao(erros.isEmpty(), erros);
    }
}
