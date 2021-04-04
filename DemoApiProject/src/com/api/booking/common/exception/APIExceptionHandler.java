package com.api.booking.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.api.booking.common.constants.APIErrorConstants;
import com.api.booking.common.reponse.form.APIResponse;
import com.api.booking.common.util.CommonUtils;

@SuppressWarnings("serial")
@ResponseStatus(HttpStatus.BAD_REQUEST)
@RestControllerAdvice
public class APIExceptionHandler extends RuntimeException {

	@RequestMapping(produces = "application/json")
	@ExceptionHandler({ com.fasterxml.jackson.databind.JsonMappingException.class,
			com.fasterxml.jackson.databind.exc.InvalidFormatException.class, java.lang.IllegalArgumentException.class })

	public APIResponse handleJsonRequest(Exception e) {
		APIResponse response = new APIResponse();
		response.setError(CommonUtils.setError(APIErrorConstants.EXCEPTION_ERROR_CODE,
				APIErrorConstants.EXCEPTION_ERROR_MSG, APIErrorConstants.EXCEPTION_ERROR_DESC));
		return response;
	}
}
