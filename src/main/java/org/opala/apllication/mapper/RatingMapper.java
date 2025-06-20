package org.opala.apllication.mapper;

import org.opala.domain.Person;
import org.opala.domain.Ranking;
import org.opala.domain.Rating;
import org.opala.apllication.dto.RatingDTO;



public class RatingMapper {
    public  RatingDTO toDTO(Rating rating) {
        if (rating == null) {
            return null;
        }
        return RatingDTO.builder()
                .ratingId(rating.getId())
                .score(rating.getScore())
                .comment(rating.getComment())
                .personId(rating.getPersonId().getId())
                .rankingId(rating.getRankingId().getId())
                .build();
    }
    public Rating toEntity(RatingDTO ratingDTO) {
        if (ratingDTO == null) {
            return null;
        }
        return Rating.builder()
                .id(ratingDTO.getRankingId())
                .score(ratingDTO.getScore())
                .comment(ratingDTO.getComment())
                .rankingId(Ranking.builder().id(ratingDTO.getRankingId()).build())
                .personId(Person.builder().id(ratingDTO.getPersonId()).build())
                .build();
    }
}
