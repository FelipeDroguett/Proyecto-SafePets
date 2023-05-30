package com.codingdojo.felipe.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.felipe.models.Direction;

@Repository
public interface DirectionRepository extends CrudRepository<Direction, Long>{

	List<Direction> findAll();
}
