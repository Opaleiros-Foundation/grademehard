package xyz.opaleiros.gradmehard.application.usecase.card;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import xyz.opaleiros.gradmehard.domain.entity.Card;
import xyz.opaleiros.gradmehard.infrastructure.persistence.entity.CardJpaEntity;

public interface CardFindAllPageableUseCase {
    Page<CardJpaEntity> findAll(Pageable pageable);
}
