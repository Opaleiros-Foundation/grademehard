package xyz.opaleiros.gradmehard.application.usecase.card;

import xyz.opaleiros.gradmehard.infrastructure.persistence.entity.CardJpaEntity;

public interface CardFindByIdUseCase {
    CardJpaEntity findById(String uuid);
}
