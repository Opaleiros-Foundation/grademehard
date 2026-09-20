package xyz.opaleiros.gradmehard.domain.exception;

public class UserNotFoundException extends BusinessException {
    public UserNotFoundException(String id) {
        super("Usuário não encontrado com ID: " + id, "USER_NOT_FOUND");
    }
}