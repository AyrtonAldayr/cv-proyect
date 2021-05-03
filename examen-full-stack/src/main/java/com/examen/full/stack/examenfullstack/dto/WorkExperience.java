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
@Table(name = "WorkExperience")
public class WorkExperience {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idWorkExperience")
    private Integer idWorkExperience;

    @Column(name = "idPersonalInformation")
    private Integer idPersonalInformation;

    @Column(name = "companyName")
    private String companyName;

    @Column(name = "position")
    private String position;

    @Column(name = "descriptionPosition")
    private String descriptionPosition;

    @Column(name = "contractStartDate")
    private String contractStartDate;

    @Column(name = "contractEndDate")
    private String contractEndDate;

    @Column(name = "userCreation")
    private String userCreation;

    @Column(name = "dateCreation")
    private LocalDateTime dateCreation;

    @Column(name = "userModification")
    private String userModification;

    @Column(name = "dateModification")
    private LocalDateTime dateModification;
}
