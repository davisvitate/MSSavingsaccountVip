package com.microservice.counthvip.services;


import java.util.Map;

import com.microservice.counthvip.model.ClientPerson;
import com.microservice.counthvip.model.CountHvip;
import com.microservice.counthvip.model.Firmante;
import com.microservice.counthvip.model.Movement;
import com.microservice.counthvip.model.Titular;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CountHvipServices {

	public Flux<CountHvip> findAll(); 
	
	public Mono<CountHvip> findById(String id);
	
	public Mono<CountHvip> save(CountHvip counth);
	
	public Mono<Void> delete(CountHvip counth);
	
	public Flux<CountHvip> findByDniClient(String dni);
	
	public Mono<Map<String, Object>> getMoney(String dni);
	
	
	public Flux<ClientPerson> findAllClientPerson();
	
	public Mono<ClientPerson> findClientPersonById(String id);
	
	public Flux<ClientPerson> findClientPersonByDni(String dni);
	
	public Flux<ClientPerson> findClientPersonByName(String Name);
	
	public Flux<ClientPerson> findClientPersonByLastname(String lastname);
	
	public Mono<ClientPerson> saveClientPerson(ClientPerson clientperson);
	
	public Mono<Void> deleteClientPerson(String idCliente);
	

	public Flux<Titular> findAllTitular();

	public Mono<Titular> findByIdTitular(String id);

	public Mono<Titular> saveTitular(Titular titular);

	public Mono<Void> deleteTitular(Titular titular);
	

	public Flux<Firmante> findAllFirmante();

	public Mono<Firmante> findByIdFirmante(String id);

	public Mono<Firmante> saveFirmante(Firmante firmante);

	public Mono<Void> deleteFirmante(Firmante firmante);
	

	public Flux<Movement> findAllMove();

	public Mono<Movement> findByIdMove(String id);

	public Mono<Movement> saveMove(Movement move);

	public Mono<Void> deleteMove(Movement move);

}
