package xyz.opaleiros.gradmehard.domain.exception;

public class EmailAlreadyExistsException extends BusinessException {
    public EmailAlreadyExistsException(String email) {
        super("E-mail já cadastrado: " + email, "EMAIL_ALREADY_EXISTS");
    }
}
