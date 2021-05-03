package com.examen.full.stack.examenfullstack.service;


import com.examen.full.stack.examenfullstack.builder.InformationBuilder;
import com.examen.full.stack.examenfullstack.builder.PersonInformationBuilder;
import com.examen.full.stack.examenfullstack.dto.PersonInformation;
import com.examen.full.stack.examenfullstack.repository.PersonInformationRepository;
import com.examen.full.stack.examenfullstack.request.PersonCvRequest;
import com.examen.full.stack.examenfullstack.response.InformationResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CvServiceImpl implements CvService {

    @Autowired
    PersonInformationRepository personRepository;

    private final PersonInformationBuilder personBuilder;
    private final InformationBuilder informationBuilder;


    @Override
    public void createCvPerson(PersonCvRequest personCvRequest) {
        PersonInformation person = personRepository.findByNumberDocument(personCvRequest.getNumDocument());

        if (person != null) {
            personRepository.save(personBuilder.updatePersonDto(personCvRequest, person));
        } else {
            personRepository.save(personBuilder.createPersonDto(personCvRequest));
        }
    }

    @Override
    public ResponseEntity<InformationResponse> getInformationPerson(String numberDocument) {

        return new ResponseEntity<>(informationBuilder.informationResponseBuilder(personRepository.findByNumberDocument(numberDocument)), HttpStatus.OK);
    }
}
