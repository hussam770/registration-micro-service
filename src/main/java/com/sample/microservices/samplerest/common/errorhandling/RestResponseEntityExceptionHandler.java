package com.sample.microservices.samplerest.common.errorhandling;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.sample.microservices.samplerest.common.exeptions.CustomException;

@RestControllerAdvice
public class RestResponseEntityExceptionHandler 
  extends ResponseEntityExceptionHandler {

    @ExceptionHandler
    protected String handleCustomException(CustomException e) {
    	System.out.println("handleCustomException >>>>>>>>>>>>>>>>>>>>>>>>>");
    	return e.getMessage();
    }
}