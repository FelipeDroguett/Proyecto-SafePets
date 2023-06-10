package com.codingdojo.felipe.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.felipe.models.Alliance;

@Repository
public interface AllianceRepository extends CrudRepository<Alliance, Long>{

	Alliance findByEmail(String email);
	
	List<Alliance> findAll();
	
	List<Alliance> findByDirectionIdIsNull();
	
	List<Alliance> findByFirstNameStartingWith(String nombre);
}
