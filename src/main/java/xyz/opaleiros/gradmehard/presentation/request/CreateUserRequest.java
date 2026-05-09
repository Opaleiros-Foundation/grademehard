package xyz.opaleiros.gradmehard.presentation.request;

public record CreateUserRequest(
        String name,
        String email,
        String password
) {
}
