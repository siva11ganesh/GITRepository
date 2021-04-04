package com.api.booking.signup.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.booking.common.reponse.form.APIResponse;
import com.api.booking.common.reponse.form.Error;
import com.api.booking.signup.request.SignUpRequest;
import com.api.booking.signup.service.SignUpService;

import ch.qos.logback.classic.Logger;
import io.swagger.annotations.Api;

@RestController
@Api(description = "Customer Registration")
@ConditionalOnExpression("${signup.enabled:true}")
public class SignUpController {

	final Logger log = (Logger) LoggerFactory.getLogger(SignUpController.class);

	@Autowired
	SignUpService signUpService;

	@PostMapping(path = "${signup.URL}", produces = "application/json", consumes = "application/json")
	public APIResponse handleSignUpRequest(@RequestBody SignUpRequest request, HttpServletRequest req) {
		APIResponse response = null;
		Error error = null;
		response = signUpService.handleRequest(request, req, error);
		return response;
	}
}
