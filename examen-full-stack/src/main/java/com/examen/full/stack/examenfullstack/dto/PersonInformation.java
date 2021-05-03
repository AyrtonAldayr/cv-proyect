package com.examen.full.stack.examenfullstack.dto;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "PersonalInformation")
public class PersonInformation{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPersonalInformation")
    private Integer idPersonalInformation;

    @Column(name = "typeDocument")
    private String typeDocument;

    @Column(name = "numberDocument")
    private String numberDocument;

    @Column(name = "fatherLastName")
    private String fatherLastName;

    @Column(name = "motherFirstName")
    private String motherFirstName;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "secondName")
    private String secondName;

    @Column(name = "otherNames")
    private String otherNames;

    @Column(name = "numberPhone")
    private String numberPhone;

    @Column(name = "email")
    private String email;

    @Column(name = "userCreation")
    private String userCreation;

    @Column(name = "dateCreation")
    private LocalDateTime dateCreation;

    @Column(name = "userModification")
    private String userModification;

    @Column(name = "dateModification")
    private LocalDateTime dateModification;
}
