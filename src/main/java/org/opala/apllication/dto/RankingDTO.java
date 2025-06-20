package org.opala.apllication.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.opala.domain.Ranking;

import java.util.UUID;

@Getter
@Setter
@Builder
public class RankingDTO {
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private Integer score;
    private String description;
    Ranking.Tier tier;
}
