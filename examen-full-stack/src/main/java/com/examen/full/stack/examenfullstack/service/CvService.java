package com.examen.full.stack.examenfullstack.service;

import com.examen.full.stack.examenfullstack.repository.PersonInformationRepository;
import com.examen.full.stack.examenfullstack.request.PersonCvRequest;
import com.examen.full.stack.examenfullstack.response.InformationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


public interface CvService {

    public void createCvPerson(PersonCvRequest personCvRequest);

    public ResponseEntity<InformationResponse> getInformationPerson(String numberDocument);
}
