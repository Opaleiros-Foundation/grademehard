package org.opala.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import java.util.*;

@Entity
@Getter
@Setter
@Builder
public class Ranking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Tier tier;

    private String description;
    private String colorHex;

    @OneToMany(mappedBy = "ranking")
    private Set<Rating> ratings = new HashSet<>();

    public Ranking() {

    }

    public enum Tier {
        S("Excelente", "#FF0000"),
        A("Muito Bom", "#FF7F00"),
        B("Bom", "#FFFF00"),
        C("Regular", "#00FF00"),
        D("Ruim", "#0000FF"),
        E("Muito Ruim", "#4B0082"),
        F("Péssimo", "#9400D3");

        private final String description;
        private final String color;

        Tier(String description, String color) {
            this.description = description;
            this.color = color;
        }
        public String getDescription() {
            return description;
        }

        public String getColor() {
            return color;
        }
    }

    // Método para obter a cor do tier automaticamente
    public String getColorHex() {
        return this.tier != null ? this.tier.getColor() : this.colorHex;
    }
}