package com.codingdojo.felipe.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.felipe.models.Alliance;

@Repository
public interface AllianceRepository extends CrudRepository<Alliance, Long>{

	Alliance findByEmail(String email);
}
