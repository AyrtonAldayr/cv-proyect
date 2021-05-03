package com.examen.full.stack.examenfullstack.response;

import com.examen.full.stack.examenfullstack.entity.Experience;
import com.examen.full.stack.examenfullstack.entity.Studied;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class InformationResponse {

    private String numDocument;

    private String typeDocument;

    private String fatherLastName;

    private String motherFirstName;

    private String firstName;

    private String secondName;

    private String otherNames;

    private String numberPhone;

    private String email;

    private List<Studied> studies;

    private List<Experience> experiences;
}
