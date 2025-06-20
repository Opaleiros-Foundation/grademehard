package org.opala.apllication.mapper;

import org.opala.apllication.dto.PersonDTO;
import org.opala.domain.Person;

public class PersonMapper {
    public PersonDTO toDTO (Person person){
        if (person == null) {
            return null;
        }
        return PersonDTO.builder()
                .id(person.getId())
                .name(person.getName())
                .commentary(person.getCommentary())
                .photo(person.getPhoto())
                .build();
    }
    public Person toEntity (PersonDTO personDTO){
        if (personDTO == null){
            return null;
        }
        return Person.builder()
                .id(personDTO.getId())
                .name(personDTO.getName())
                .commentary(personDTO.getCommentary())
                .photo(personDTO.getPhoto())
                .build();
    }
}
