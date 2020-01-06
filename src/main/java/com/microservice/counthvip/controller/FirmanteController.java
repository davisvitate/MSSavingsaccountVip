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

import com.microservice.counthvip.model.Firmante;
import com.microservice.counthvip.services.CountHvipServices;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/counthvip/firmante")	
public class FirmanteController {
	
	@Autowired
	private CountHvipServices service;
	
	@GetMapping
	public Mono<ResponseEntity<Flux<Firmante>>> listaFirmante(){
		return Mono.just(
				ResponseEntity.ok()
				.contentType(MediaType.APPLICATION_JSON_UTF8)
				.body(service.findAllFirmante())
				);
	}
	
	
	@RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Mono<Firmante> findById(@PathVariable("id") String id) {
        return service.findByIdFirmante(id);
    }
	
	
	@PostMapping
	public Mono<Firmante> create(@RequestBody Firmante monoFirmante){
		
			return service.saveFirmante(monoFirmante);						
	}
	
	
	@DeleteMapping("/{id}")
	public Mono<ResponseEntity<Void>> eliminar(@PathVariable String id){
		return service.findByIdFirmante(id).flatMap(p ->{
			return service.deleteFirmante(p).then(Mono.just(new ResponseEntity<Void>(HttpStatus.NO_CONTENT)));
		}).defaultIfEmpty(new ResponseEntity<Void>(HttpStatus.NOT_FOUND));
	}

}
