package com.sample.microservices.samplerest.registration.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.microservices.samplerest.common.exeptions.CustomException;
import com.sample.microservices.samplerest.registration.entities.LoginRequest;

@RestController
@RequestMapping(value = "/registration" , produces = MediaType.APPLICATION_JSON_VALUE  , consumes = MediaType.APPLICATION_JSON_VALUE)
public class LoginRest {	
	
	@PostMapping(value = "/login")
	//@ExceptionHandler(value = {Exception.class})
	public ResponseEntity<Object> loginAction(@RequestBody LoginRequest request) throws CustomException{
		if(request.getPassword()!= null)
			throw new CustomException();
		
		
		return ResponseEntity.ok("Success login");
	}

}
