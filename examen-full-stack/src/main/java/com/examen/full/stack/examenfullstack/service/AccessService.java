package com.examen.full.stack.examenfullstack.service;

import org.springframework.http.ResponseEntity;

public interface AccessService {

    public ResponseEntity<?> validateAccess(String userAc,String password);
}
