package com.examen.full.stack.examenfullstack.dto;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
