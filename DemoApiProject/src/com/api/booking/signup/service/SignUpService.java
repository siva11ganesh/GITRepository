package com.api.booking.signup.service;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.booking.common.reponse.form.APIResponse;
import com.api.booking.common.reponse.form.Error;
import com.api.booking.signup.constants.SignUpConstants;
import com.api.booking.signup.request.SignUpRequest;
import com.api.booking.signup.response.SignUpResponse;

import ch.qos.logback.classic.Logger;

@Service("signUpService")
public class SignUpService {

	final Logger log = (Logger) LoggerFactory.getLogger(SignUpService.class);

	@Autowired
	SignUpServiceValidation signupValidation;

	public APIResponse handleRequest(Object t, HttpServletRequest req, Error err) {
		APIResponse response = new APIResponse();
		try {
			if ((err = signupValidation.validateSignUpRequest(((SignUpRequest) t), err)) == null) {
				err = null;
			}
			prepareResponse(((SignUpRequest) t), err, response);
		} catch (Exception e) {
			log.debug("Exception occured while handling request::" + e);
			log.error("Exception occured while handling request::", e);
		}
		return response;
	}

	public APIResponse prepareResponse(SignUpRequest req, Error err, APIResponse resp) {
		try {
			SignUpResponse response = new SignUpResponse();
			if (err == null) {
				response.setRegistrationStatus(SignUpConstants.REGISTRATION_STAT);
				resp.setResponsedata(response);
			} else {
				resp.setError(err);
			}
		} catch (Exception e) {
			log.debug("Exception occured while preparing response::" + e);
			log.error("Exception occured while preparing response::", e);
		}
		return resp;
	}
}
