package com.examen.full.stack.examenfullstack.response;

import lombok.*;

import javax.persistence.Column;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class PermissionsResponse {

    private Boolean readingAccess;

    private Boolean writingAccess;

}
