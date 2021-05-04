package com.examen.full.stack.examenfullstack.controller;

import com.examen.full.stack.examenfullstack.entity.HeaderAccess;
import com.examen.full.stack.examenfullstack.service.AccessService;
import com.examen.full.stack.examenfullstack.util.HttpHeadersMapping;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/access")
@Slf4j
public class AccessController {

    @Autowired
    AccessService accessService;

    @CrossOrigin(value = "*")
    @GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> validateUserAndPass(
            @RequestHeader(value = "user") String userAccess,
            @RequestHeader(value = "password") String passAccess
    ) {

        return accessService.validateAccess(userAccess, passAccess);
    }
}
