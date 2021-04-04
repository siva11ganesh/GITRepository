package com.api.booking.signup.service;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.booking.common.reponse.form.Error;
import com.api.booking.signup.request.SignUpRequest;
import com.api.booking.signup.validation.service.SignUpValidationService;

import ch.qos.logback.classic.Logger;

@Service("signupValidation")
public class SignUpServiceValidation {

	final Logger log = (Logger) LoggerFactory.getLogger(SignUpServiceValidation.class);
	@Autowired
	SignUpValidationService validateSignUpService;

	public Error validateFName(SignUpRequest request, Error err) {
		if (((err = validateSignUpService.validateFNameMandatory(request.getFirstName(), err)) == null)
				&& ((err = validateSignUpService.validateFNameDataType(request.getFirstName(), err)) == null)
				&& ((err = validateSignUpService.validateFNameLength(request.getFirstName(), err)) == null)) {
			err = null;
		}
		return err;
	}

	public Error validateLName(SignUpRequest request, Error err) {
		if (((err = validateSignUpService.validateFNameMandatory(request.getLastName(), err)) == null)
				&& ((err = validateSignUpService.validateFNameDataType(request.getLastName(), err)) == null)
				&& ((err = validateSignUpService.validateFNameLength(request.getLastName(), err)) == null)) {
			err = null;
		}
		return err;
	}

	public Error validateUName(SignUpRequest request, Error err) {
		if (((err = validateSignUpService.validateFNameMandatory(request.getUserName(), err)) == null)
				&& ((err = validateSignUpService.validateFNameDataType(request.getUserName(), err)) == null)
				&& ((err = validateSignUpService.validateFNameLength(request.getUserName(), err)) == null)) {
			err = null;
		}
		return err;
	}

	public Error validPassword(SignUpRequest request, Error err) {
		if (((err = validateSignUpService.validatePasswordMandatory(request.getPassword(), err)) == null)
				&& ((err = validateSignUpService.isvalidPassword(request.getPassword(), err)) == null)) {
			err = null;
		}
		return err;
	}

	public Error validEmail(SignUpRequest request, Error err) {
		if (((err = validateSignUpService.validateEmailMandatory(request.getMailId(), err)) == null)
				&& ((err = validateSignUpService.isvalidEmail(request.getMailId(), err)) == null)) {
			err = null;
		}
		return err;
	}

	public Error validateSignUpRequest(SignUpRequest request, Error err) {
		try {
			if (((err = validateFName(request, err)) == null) && ((err = validateLName(request, err)) == null)
					&& ((err = validateUName(request, err)) == null) && ((err = validPassword(request, err)) == null)
					&& ((err = validEmail(request, err)) == null)) {
				err = null;
			}
		} catch (Exception e) {
			log.debug("Exception occured while validating request::" + e);
			log.error("Exception occured while validating request::", e);
		}
		return err;
	}
}
