package com.examen.full.stack.examenfullstack.builder;

import com.examen.full.stack.examenfullstack.dto.PersonInformation;
import com.examen.full.stack.examenfullstack.response.InformationResponse;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Component
public class InformationBuilder {

    public InformationResponse informationResponseBuilder(PersonInformation person) {
        return InformationResponse.builder()
                .firstName(person.getFirstName())
                .secondName(person.getSecondName())
                .otherNames(person.getOtherNames())
                .fatherLastName(person.getFatherLastName())
                .motherFirstName(person.getMotherFirstName())
                .numDocument(person.getNumberDocument())
                .typeDocument(person.getTypeDocument())
                .numberPhone(person.getNumberPhone())
                .email(person.getEmail())
                .build();
    }
}
