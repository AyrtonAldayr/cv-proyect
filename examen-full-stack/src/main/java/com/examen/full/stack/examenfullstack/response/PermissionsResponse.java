package com.examen.full.stack.examenfullstack.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class PermissionsResponse {

    private Boolean readingAccess;

    private Boolean writingAccess;

}
