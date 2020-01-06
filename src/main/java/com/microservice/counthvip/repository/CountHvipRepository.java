package com.microservice.counthvip.repository;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.microservice.counthvip.model.CountHvip;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CountHvipRepository extends ReactiveMongoRepository<CountHvip, String> {
	
	@Query("{ 'num': ?0 }")
    Flux<CountHvip> findByNumCount(final String num);
	
	@Query("{ 'clientperson.dni': ?0 }")
    Flux<CountHvip> findByDniClient(final String dni);
	
	@Query("{ 'clientperson.dni': ?0 }")
    Mono<CountHvip> findByDniMono(final String dni);

}
