import java.util.ArrayList;
import java.util.List;

public class ValidadorSenha {

    public static ResultadoValidacao validar(String senha) {
        List<String> erros = new ArrayList<>();

        if (senha.length() < 8) {
            erros.add("A senha deve ter pelo menos 8 caracteres");
        }

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
            erros.add("A senha deve conter pelo menos um caractere especial");
        }

        return new ResultadoValidacao(erros.isEmpty(), erros);
    }
}
