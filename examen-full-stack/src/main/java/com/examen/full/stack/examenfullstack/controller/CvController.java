package com.examen.full.stack.examenfullstack.controller;

import com.examen.full.stack.examenfullstack.request.PersonCvRequest;
import com.examen.full.stack.examenfullstack.response.InformationResponse;
import com.examen.full.stack.examenfullstack.service.CvService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;

@Controller
@RequestMapping(path="/cv")
@Slf4j
public class CvController {

    @Autowired
    CvService cvService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> createPersonCv(
            @RequestBody PersonCvRequest personCvRequest
    ){
        cvService.createCvPerson(personCvRequest);
        return new ResponseEntity<>("", CREATED);
    }

    @GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE,value = "/{document}")
    public ResponseEntity<InformationResponse> getInformationPerson(
            @PathVariable("document") String document
    ){
        return cvService.getInformationPerson(document);
    }
}
