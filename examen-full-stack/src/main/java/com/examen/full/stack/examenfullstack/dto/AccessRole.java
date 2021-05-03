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
