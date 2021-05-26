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
@Table(name = "AccessRole")
public class AccessRole {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idAccessRole")
    private Integer idAccessRole;

    @Column(name = "idPersonalInformation")
    private Integer idPersonalInformation;

    @Column(name = "rol")
    private String rol;

    @Column(name = "userAccess")
    private String userAccess;

    @Column(name = "passwordAccess")
    private String passwordAccess;

    @Column(name = "readingAccess")
    private Boolean readingAccess;

    @Column(name = "writingAccess")
    private Boolean writingAccess;

    @Column(name = "userCreation")
    private String userCreation;

    @Column(name = "dateCreation")
    private LocalDateTime dateCreation;

    @Column(name = "userModification")
    private String userModification;

    @Column(name = "dateModification")
    private LocalDateTime dateModification;
}
