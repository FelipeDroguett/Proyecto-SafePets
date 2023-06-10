package com.codingdojo.felipe.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.codingdojo.felipe.models.Foundation;

@Repository
public interface FoundationRepository extends CrudRepository<Foundation, Long>{

	List<Foundation> findAll();
	
	Foundation findByEmail(String email);
	
	List<Foundation> findByDirectionIdIsNull();
	
	List<Foundation> findByFirstNameStartingWith(String nombre);
}
