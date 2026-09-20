package xyz.opaleiros.gradmehard.application.dto;

public record CreateUserDTO(
        String name,
        String email,
        String password
) {
}
