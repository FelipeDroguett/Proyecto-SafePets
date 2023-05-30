package com.codingdojo.felipe.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.felipe.models.Pet;

@Repository
public interface PetRepository extends CrudRepository<Pet, Long>{

	List<Pet> findAll();
}
