package xyz.opaleiros.gradmehard.domain.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import xyz.opaleiros.gradmehard.infrastructure.persistence.entity.CardJpaEntity;

public interface CardRepository {
    void save(CardJpaEntity cardJpaEntity);
   CardJpaEntity findById(String uuid);
    Page<CardJpaEntity> findAllPageable(Pageable pageable);
    void updateOverall(String uuid, Double overall);
    void delete(String uuid);

}
