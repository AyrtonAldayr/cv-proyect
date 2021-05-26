package com.examen.full.stack.examenfullstack.response;

import java.util.List;

import com.examen.full.stack.examenfullstack.entity.Experience;
import com.examen.full.stack.examenfullstack.entity.Studied;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
