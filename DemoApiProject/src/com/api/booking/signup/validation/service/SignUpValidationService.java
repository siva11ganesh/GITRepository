package com.api.booking.signup.validation.service;

import com.api.booking.common.reponse.form.Error;

public interface SignUpValidationService {

	public Error validateFNameMandatory(String fName, Error err);

	public Error validateLNameMandatory(String lName, Error err);

	public Error validateUNameMandatory(String uName, Error err);

	public Error validateFNameDataType(String fName, Error err);

	public Error validateLNameDataType(String lName, Error err);

	public Error validateUNameDataType(String uName, Error err);

	public Error validateFNameLength(String fName, Error err);

	public Error validateLNameLength(String lName, Error err);

	public Error validateUNameLength(String uName, Error err);

	public Error validatePasswordMandatory(String password, Error err);

	public Error isvalidPassword(String password, Error err);

	public Error validateEmailMandatory(String email, Error err);

	public Error isvalidEmail(String email, Error err);

}
