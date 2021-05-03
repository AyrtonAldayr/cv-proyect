package com.examen.full.stack.examenfullstack.repository;

import com.examen.full.stack.examenfullstack.dto.PersonInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonInformationRepository extends JpaRepository<PersonInformation,Integer> {

    PersonInformation findByNumberDocument(String numberDocument);
}
