package org.opala.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "ranking") //
public class Ranking {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "rank_score")
    private Double rankValue;

    @ManyToMany(mappedBy = "rankings")
    private Set<Person> persons;
}