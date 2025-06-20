package org.opala.apllication.mapper;

import org.opala.domain.Rating;
import org.opala.apllication.dto.RatingDTO;
public class RatingMapper {
    public  RatingDTO toDTO(Rating rating) {
        if (rating == null) {
            return null;
        }
        return RatingDTO.builder()
                .rankingId(rating.getId())
                .score(rating.getScore())
                .comment(rating.getComment())
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
                .build();
    }
}
