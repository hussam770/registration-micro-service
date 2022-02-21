package com.sample.microservices.samplerest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.sample.microservices.samplerest.config.SampleRestConfig;
import com.sample.microservices.samplerest.factory.RegistrationRequestFactory;

@SpringBootTest
@ContextConfiguration(classes=SampleRestConfig.class)
class SampleRestApplicationTests {
	
	@Autowired 
	private RegistrationRequestFactory rf ;   

	@Test
	void contextLoads() {
		
		assertNotNull(rf);
	}

}
