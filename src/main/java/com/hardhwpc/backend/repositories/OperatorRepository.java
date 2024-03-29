package com.hardhwpc.backend.repositories;

import com.hardhwpc.backend.entities.Operator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OperatorRepository extends JpaRepository<Operator, Integer> {
    List<Operator> findByFirstName(String firstName);
    List<Operator> findByLastName(String lastName);
    List<Operator> findByCode(String code);

}
