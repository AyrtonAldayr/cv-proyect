package com.examen.full.stack.examenfullstack.entity;

import lombok.*;

import javax.persistence.Column;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Studied {


    private String academicDegree;


    private String studyCenter;


    private String nameOfTheRace;


    private String studyStartDate;


    private String studyEndDate;
}
