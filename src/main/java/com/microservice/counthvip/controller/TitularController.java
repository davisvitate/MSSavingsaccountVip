package com.microservice.counthvip.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.RestController;

import com.microservice.counthvip.model.Titular;
import com.microservice.counthvip.services.CountHvipServices;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/counthvip/titular")	
public class TitularController {
	
	@Autowired
	private CountHvipServices service;
	
	@GetMapping
	public Mono<ResponseEntity<Flux<Titular>>> listaTitular(){
		return Mono.just(
				ResponseEntity.ok()
				.contentType(MediaType.APPLICATION_JSON_UTF8)
				.body(service.findAllTitular())
				);
	}
	
	
	@RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Mono<Titular> findById(@PathVariable("id") String id) {
        return service.findByIdTitular(id);
    }
	
	
	@PostMapping
	public Mono<Titular> create(@RequestBody Titular monotitular){
		
			return service.saveTitular(monotitular);						
	}
	
	
	@DeleteMapping("/{id}")
	public Mono<ResponseEntity<Void>> eliminar(@PathVariable String id){
		return service.findByIdTitular(id).flatMap(p ->{
			return service.deleteTitular(p).then(Mono.just(new ResponseEntity<Void>(HttpStatus.NO_CONTENT)));
		}).defaultIfEmpty(new ResponseEntity<Void>(HttpStatus.NOT_FOUND));
	}

}
