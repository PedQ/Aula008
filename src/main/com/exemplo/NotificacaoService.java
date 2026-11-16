package main.com.exemplo;
import java.util.regex.Pattern;

public class NotificacaoService {

    private static final String EMAIL_REGEX =
            "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

    private static final Pattern EMAIL_PATTERN =
            Pattern.compile(EMAIL_REGEX);

    public void enviarEmail(String email) {

        if (!validarEmail(email)) {
            throw new IllegalArgumentException(
                    "Formato de e-mail inválido: " + email
            );
        }

        System.out.println("E-mail enviado com sucesso para: " + email);
    }

    public boolean validarEmail(String email) {

        if (email == null || email.isBlank()) {
            return false;
        }

        return EMAIL_PATTERN.matcher(email).matches();
    }
}
