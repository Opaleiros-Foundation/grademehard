package org.opala.repository;

import org.opala.domain.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface RatingRepository extends JpaRepository<Rating, UUID> {
    // Todas avaliações de uma pessoa
    List<Rating> findByPersonId(UUID personId);

    // Média de avaliações por pessoa
    @Query("SELECT AVG(r.score) FROM Rating r WHERE r.person.id = :personId")
    Double findAverageScoreByPersonId(@Param("personId") UUID personId);

    // Distribuição por tier
    @Query("SELECT r.ranking.tier, COUNT(r) FROM Rating r WHERE r.person.id = :personId GROUP BY r.ranking.tier")
    List<Object[]> findTierDistributionByPersonId(@Param("personId") UUID personId);
}