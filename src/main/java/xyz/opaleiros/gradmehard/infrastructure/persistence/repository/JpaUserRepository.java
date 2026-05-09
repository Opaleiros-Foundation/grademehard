package xyz.opaleiros.gradmehard.infrastructure.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.opaleiros.gradmehard.infrastructure.persistence.entity.UserJpaEntity;

import java.util.Optional;

public interface JpaUserRepository
        extends JpaRepository<UserJpaEntity, String> {

    Optional<UserJpaEntity> findByEmail(
            String email
    );
}
