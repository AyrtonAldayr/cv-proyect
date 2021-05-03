package com.examen.full.stack.examenfullstack.repository;

import com.examen.full.stack.examenfullstack.dto.AccessRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccessRoleRepository extends JpaRepository<AccessRole,Integer> {

    AccessRole findByUserAccessAndPasswordAccess(String u,String p);
}
