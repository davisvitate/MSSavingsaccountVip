package com.microservice.counthvip.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.microservice.counthvip.model.Firmante;


public interface FirmanteRepository extends ReactiveMongoRepository<Firmante, String>{

}
