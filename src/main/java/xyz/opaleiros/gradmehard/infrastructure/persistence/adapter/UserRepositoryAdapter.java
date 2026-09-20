package xyz.opaleiros.gradmehard.infrastructure.persistence.adapter;

import org.springframework.stereotype.Repository;
import xyz.opaleiros.gradmehard.domain.entity.User;
import xyz.opaleiros.gradmehard.domain.repository.UserRepository;
import xyz.opaleiros.gradmehard.infrastructure.persistence.entity.UserJpaEntity;
import xyz.opaleiros.gradmehard.infrastructure.persistence.mapper.UserPersistenceMapper;
import xyz.opaleiros.gradmehard.infrastructure.persistence.repository.JpaUserRepository;

import java.util.Optional;

@Repository
public class UserRepositoryAdapter
        implements UserRepository {

    private final JpaUserRepository repository;

    public UserRepositoryAdapter(
            JpaUserRepository repository
    ) {
        this.repository = repository;
    }

    @Override
    public User save(User user) {

        UserJpaEntity entity =
                UserPersistenceMapper.toJpa(user);

        UserJpaEntity saved =
                repository.save(entity);

        return UserPersistenceMapper.toDomain(
                saved
        );
    }

    @Override
    public Optional<User> findByEmail(
            String email
    ) {

        return repository
                .findByEmail(email)
                .map(UserPersistenceMapper::toDomain);
    }
}