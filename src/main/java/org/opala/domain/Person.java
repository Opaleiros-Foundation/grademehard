package org.opala.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@Setter
public class Person {
    @Id
    @GeneratedValue
    private UUID id;

    @Lob
    private byte[] photo;

    @Column
    private String commentary;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "person_ranking",
            joinColumns = @JoinColumn(name = "person_id"),
            inverseJoinColumns = @JoinColumn(name = "ranking_id")
    )
    private Set<Ranking> rankings;
}