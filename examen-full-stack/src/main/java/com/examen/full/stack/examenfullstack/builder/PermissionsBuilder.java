package com.examen.full.stack.examenfullstack.builder;

import com.examen.full.stack.examenfullstack.dto.AccessRole;
import com.examen.full.stack.examenfullstack.response.PermissionsResponse;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Component
public class PermissionsBuilder {

    public PermissionsResponse PermissionsResponseBuilder(AccessRole access) {
        return PermissionsResponse.builder()
                .readingAccess(access.getReadingAccess())
                .writingAccess(access.getWritingAccess())
                .build();
    }
}
