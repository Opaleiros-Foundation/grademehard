package org.opala.apllication.dto;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Max;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Builder
public class RatingDTO {
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID ratingId;
    @Min(1) @Max(5)
    private Integer score;
    private String comment;
    private UUID personId;
    private UUID rankingId;


}
