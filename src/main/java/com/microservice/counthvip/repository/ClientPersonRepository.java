package com.microservice.counthvip.repository;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.microservice.counthvip.model.ClientPerson;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ClientPersonRepository  extends ReactiveMongoRepository<ClientPerson, String>{
	
	@Query("{ 'name': ?0 }")
    Flux<ClientPerson> findByNamee(final String name);
	
	@Query("{ 'lastname': ?0 }")
    Flux<ClientPerson> findByLastnamee(final String lastname);
	
	@Query("{ 'dni': ?0 }")
    Flux<ClientPerson> findByDni(final String dni);
	
	@Query("{ '_id': ?0 }")
    Mono<ClientPerson> findByIDA(final String id);

}
