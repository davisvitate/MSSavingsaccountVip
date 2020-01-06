package com.microservice.counthvip.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;


@Configuration
public class WebClientConfig {

	@Bean
	@Qualifier("Movement")
	public WebClient registerWebClient() {
		return WebClient.create("http://localhost:8090/apimovement/movement/createM");
		
	}
	
	
	@Bean
	@Qualifier("Client")
	public WebClient registerWebClien() {
		return WebClient.create("http://localhost:8090/apiclient/client/createC");
		
	}
}
