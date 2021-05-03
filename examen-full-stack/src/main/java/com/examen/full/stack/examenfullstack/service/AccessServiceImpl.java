package com.examen.full.stack.examenfullstack.service;

import com.examen.full.stack.examenfullstack.builder.PermissionsBuilder;
import com.examen.full.stack.examenfullstack.builder.PersonInformationBuilder;
import com.examen.full.stack.examenfullstack.dto.AccessRole;
import com.examen.full.stack.examenfullstack.repository.AccessRoleRepository;
import com.examen.full.stack.examenfullstack.response.PermissionsResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class AccessServiceImpl implements AccessService {

    @Autowired
    AccessRoleRepository accessRol;

    private final PermissionsBuilder builder;

    @Override
    public ResponseEntity<?> validateAccess(String userAc, String password) {
        AccessRole access = accessRol.findByUserAccessAndPasswordAccess(userAc, password);
        Map<String, ?> map = new HashMap<>();
        if (access != null && userAc.equalsIgnoreCase(access.getUserAccess()) && password.equalsIgnoreCase(access.getPasswordAccess())) {
            return ResponseEntity.ok(builder.PermissionsResponseBuilder(access));
        } else {
            return new ResponseEntity<>("", HttpStatus.NOT_ACCEPTABLE);
        }

    }
}
