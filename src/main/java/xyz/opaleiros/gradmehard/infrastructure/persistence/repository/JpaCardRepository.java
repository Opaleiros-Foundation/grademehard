package xyz.opaleiros.gradmehard.infrastructure.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.opaleiros.gradmehard.infrastructure.persistence.entity.CardJpaEntity;

public interface JpaCardRepository extends JpaRepository<CardJpaEntity, String> {
}
