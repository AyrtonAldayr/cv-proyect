package com.examen.full.stack.examenfullstack.dto;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "AcademicDegrees")
public class AcademicDegrees {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idWorkExperience")
    private Integer idAcademicDegrees;

    @Column(name = "idPersonalInformation")
    private Integer idPersonalInformation;

    @Column(name = "academicDegree")
    private String academicDegree;

    @Column(name = "studyCenter")
    private String studyCenter;

    @Column(name = "nameOfTheRace")
    private String nameOfTheRace;

    @Column(name = "studyStartDate")
    private String studyStartDate;

    @Column(name = "studyEndDate")
    private String studyEndDate;

    @Column(name = "userCreation")
    private String userCreation;

    @Column(name = "dateCreation")
    private LocalDateTime dateCreation;

    @Column(name = "userModification")
    private String userModification;

    @Column(name = "dateModification")
    private LocalDateTime dateModification;
}
