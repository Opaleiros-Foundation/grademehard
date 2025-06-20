package org.opala.apllication.mapper;

import org.opala.apllication.dto.RankingDTO;
import org.opala.domain.Ranking;

public class RankingMapper {
    public Ranking toEntity(RankingDTO rankingDTO) {
        if (rankingDTO == null) {
            return null;
        }
        return Ranking.builder()
                .id(rankingDTO.getId())
                .tier(rankingDTO.getTier())
                .description(rankingDTO.getDescription())
                .build();
    }
    public RankingDTO toDto (Ranking ranking){
        if (ranking == null){
            return null;
        }
        return RankingDTO.builder()
                .id(ranking.getId())
                .tier(ranking.getTier())
                .description(ranking.getDescription())
                .build();
    }
}
