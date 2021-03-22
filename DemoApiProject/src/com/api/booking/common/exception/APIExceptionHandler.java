package com.api.booking.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@ResponseStatus(HttpStatus.BAD_REQUEST)
@RestControllerAdvice
public class APIExceptionHandler extends RuntimeException {

//	@RequestMapping(produces="application/json")
//	@ExceptionHandler({com.fasterxml.jackson.databind.JsonMappingException.class,com.fasterxml.jackson.databind.exc.InvalidFormatException.class,java.lang.IllegalArgumentException})
	
}
