package com.examen.full.stack.examenfullstack.request;

import com.examen.full.stack.examenfullstack.dto.AcademicDegrees;
import com.examen.full.stack.examenfullstack.dto.WorkExperience;
import com.examen.full.stack.examenfullstack.entity.Experience;
import com.examen.full.stack.examenfullstack.entity.Studied;
import lombok.*;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PersonCvRequest implements Serializable {

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
