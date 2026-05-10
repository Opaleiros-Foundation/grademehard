package xyz.opaleiros.gradmehard.infrastructure.persistence.mapper;

import xyz.opaleiros.gradmehard.domain.entity.User;
import xyz.opaleiros.gradmehard.infrastructure.persistence.entity.UserJpaEntity;

public class UserPersistenceMapper {

    public static User toDomain(
            UserJpaEntity entity
    ) {
        return new User(
                entity.getId(),
                entity.getName(),
                entity.getEmail(),
                entity.getPassword()
        );
    }

    public static UserJpaEntity toJpa(
            User user
    ) {
        return new UserJpaEntity(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getPassword()
        );
    }
}