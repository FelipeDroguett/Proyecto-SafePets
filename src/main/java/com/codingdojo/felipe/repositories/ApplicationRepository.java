package com.codingdojo.felipe.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.felipe.models.Application;

@Repository
public interface ApplicationRepository extends CrudRepository<Application, Long>{

	Application findByEmail(String email);
}
