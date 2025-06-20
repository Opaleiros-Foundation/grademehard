package org.opala.apllication.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Builder
public class PersonDTO {
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    private String commentary;
    private byte[] photo;
}
