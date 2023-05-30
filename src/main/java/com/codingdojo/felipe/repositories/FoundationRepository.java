package com.codingdojo.felipe.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.felipe.models.Foundation;

@Repository
public interface FoundationRepository extends CrudRepository<Foundation, Long>{

	Foundation findByEmail(String email);
}
