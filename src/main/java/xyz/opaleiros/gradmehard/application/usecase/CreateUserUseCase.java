package xyz.opaleiros.gradmehard.application.usecase;

import org.springframework.stereotype.Service;
import xyz.opaleiros.gradmehard.application.dto.CreateUserDTO;
import xyz.opaleiros.gradmehard.domain.entity.User;
import xyz.opaleiros.gradmehard.domain.repository.UserRepository;

import java.util.UUID;

@Service
public class CreateUserUseCase {

    private final UserRepository repository;

    public CreateUserUseCase(
            UserRepository repository
    ) {
        this.repository = repository;
    }

    public User execute(CreateUserDTO dto) {

        User user = new User(
                UUID.randomUUID().toString(),
                dto.name(),
                dto.email(),
                dto.password()
        );

        return repository.save(user);
    }
}
