package com.examen.full.stack.examenfullstack.entity;

import lombok.*;

import javax.persistence.Column;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Experience {


    private String companyName;

    private String position;

    private String descriptionPosition;

    private String contractStartDate;

    private String contractEndDate;
}
