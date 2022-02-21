package com.sample.microservices.samplerest.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import com.sample.microservices.samplerest.registration.entities.RegistrationRequest;

@Component
public class RegistrationRequestFactory {
//	@Autowired
	private RegistrationRequest registrationRequest ; 
	@Autowired
	public RegistrationRequestFactory(@Nullable RegistrationRequest rr) {
		this.registrationRequest = rr ;
	}
	
}
