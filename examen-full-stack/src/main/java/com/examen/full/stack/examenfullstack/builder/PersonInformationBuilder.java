package com.examen.full.stack.examenfullstack.builder;


import com.examen.full.stack.examenfullstack.dto.PersonInformation;
import com.examen.full.stack.examenfullstack.request.PersonCvRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@NoArgsConstructor
@Component
public class PersonInformationBuilder {

    public PersonInformation createPersonDto(PersonCvRequest request) {

        return PersonInformation.builder()
                .typeDocument(request.getTypeDocument())
                .numberDocument(request.getNumDocument())
                .fatherLastName(request.getFatherLastName())
                .motherFirstName(request.getFirstName())
                .firstName(request.getFirstName())
                .secondName(request.getSecondName())
                .otherNames(request.getOtherNames())
                .numberPhone(request.getNumberPhone())
                .email(request.getEmail())
                .userCreation("App")
                .dateCreation(LocalDateTime.now())
                .build();
    }

    public PersonInformation updatePersonDto(PersonCvRequest request, PersonInformation information) {
        PersonInformation person = information;
        person.setFatherLastName(request.getFatherLastName());
        person.setMotherFirstName(request.getMotherFirstName());
        person.setFirstName(request.getFirstName());
        person.setSecondName(request.getSecondName());
        person.setOtherNames(request.getOtherNames());
        person.setEmail(request.getEmail());
        person.setNumberDocument(request.getNumDocument());
        person.setTypeDocument(request.getTypeDocument());
        person.setNumberPhone(request.getNumberPhone());
        person.setUserModification("UPDATE");
        person.setDateModification(LocalDateTime.now());

        return person;
    }
}
