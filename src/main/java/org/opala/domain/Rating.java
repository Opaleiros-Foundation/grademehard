package org.opala.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@Builder
public class Rating {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_id")
    private Person personId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ranking_id")
    private Ranking rankingId;

    private Integer score; //  1-5 estrelas
    private String comment;
    private LocalDateTime createdAt;


    public Rating() {

    }
}