package com.microservice.counthvip.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.microservice.counthvip.model.Movement;



public interface MoveRepository extends ReactiveMongoRepository<Movement, String> {
	
	

}
