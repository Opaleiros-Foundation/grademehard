package xyz.opaleiros.gradmehard.domain.repository;

import xyz.opaleiros.gradmehard.domain.entity.User;
import java.util.Optional;

public interface UserRepository {

    User save(User user);

    Optional<User> findByEmail(String email);
}
