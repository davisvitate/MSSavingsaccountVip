package com.microservice.counthvip.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.microservice.counthvip.model.Titular;



public interface TitularRepository extends ReactiveMongoRepository<Titular, String>{

}
