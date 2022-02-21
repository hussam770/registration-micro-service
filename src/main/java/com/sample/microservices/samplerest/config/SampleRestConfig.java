package com.sample.microservices.samplerest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.sample.microservices.samplerest.SampleRestApplication;
import com.sample.microservices.samplerest.registration.entities.RegistrationRequest;

@Configuration
@Import(SampleRestApplication.class)
public class SampleRestConfig {
	
	
	@Bean
	public RegistrationRequest registrationRequest() {
		//return new RegistrationRequest();
		return null ;
	}
}
