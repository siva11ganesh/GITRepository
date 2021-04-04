package com.api.booking.signup.validation.service.impl;

import org.springframework.stereotype.Service;

import com.api.booking.common.reponse.form.Error;
import com.api.booking.common.util.CommonUtils;
import com.api.booking.signup.constants.SignUpConstants;
import com.api.booking.signup.constants.SignUpErrorConstants;
import com.api.booking.signup.validation.service.SignUpValidationService;

@Service("validateSignUpService")
public class SignUpValidationServiceImpl implements SignUpValidationService {

	@Override
	public Error validateFNameMandatory(String fName, Error err) {
		if (CommonUtils.isEmpty(fName)) {
			err = CommonUtils.setError(SignUpErrorConstants.FNAME_MANDATORY_ERROR_CODE,
					SignUpErrorConstants.FNAME_MANDATORY_ERROR_MSG, SignUpErrorConstants.DATAVALIDATION_ERROR_MESSAGE);
		}
		return err;
	}

	@Override
	public Error validateLNameMandatory(String lName, Error err) {
		if (CommonUtils.isEmpty(lName)) {
			err = CommonUtils.setError(SignUpErrorConstants.LNAME_MANDATORY_ERROR_CODE,
					SignUpErrorConstants.LNAME_MANDATORY_ERROR_MSG, SignUpErrorConstants.DATAVALIDATION_ERROR_MESSAGE);
		}
		return err;
	}

	@Override
	public Error validateUNameMandatory(String uName, Error err) {
		if (CommonUtils.isEmpty(uName)) {
			err = CommonUtils.setError(SignUpErrorConstants.UNAME_MANDATORY_ERROR_CODE,
					SignUpErrorConstants.UNAME_MANDATORY_ERROR_MSG, SignUpErrorConstants.DATAVALIDATION_ERROR_MESSAGE);
		}
		return err;
	}

	@Override
	public Error validateFNameDataType(String fName, Error err) {
		if (CommonUtils.isAlpha(fName)) {
			err = CommonUtils.setError(SignUpErrorConstants.FNAME_DATATYPE_ERROR_CODE,
					SignUpErrorConstants.FNAME_DATATYPE_ERROR_MSG, SignUpErrorConstants.DATAVALIDATION_ERROR_MESSAGE);
		}
		return err;
	}

	@Override
	public Error validateLNameDataType(String lName, Error err) {
		if (CommonUtils.isAlpha(lName)) {
			err = CommonUtils.setError(SignUpErrorConstants.LNAME_DATATYPE_ERROR_CODE,
					SignUpErrorConstants.LNAME_DATATYPE_ERROR_MSG, SignUpErrorConstants.DATAVALIDATION_ERROR_MESSAGE);
		}
		return err;
	}

	@Override
	public Error validateUNameDataType(String uName, Error err) {
		if (CommonUtils.isAlpha(uName)) {
			err = CommonUtils.setError(SignUpErrorConstants.UNAME_DATATYPE_ERROR_CODE,
					SignUpErrorConstants.UNAME_DATATYPE_ERROR_MSG, SignUpErrorConstants.DATAVALIDATION_ERROR_MESSAGE);
		}
		return err;
	}

	@Override
	public Error validateFNameLength(String fName, Error err) {
		if (fName.length() >= SignUpConstants.FNAME_LENGTH) {
			err = CommonUtils.setError(SignUpErrorConstants.FNAME_LENGTH_ERROR_CODE,
					SignUpErrorConstants.FNAME_LENGTH_ERROR_MSG, SignUpErrorConstants.DATAVALIDATION_ERROR_MESSAGE);
		}
		return err;
	}

	@Override
	public Error validateLNameLength(String lName, Error err) {
		if (lName.length() >= SignUpConstants.LNAME_LENGTH) {
			err = CommonUtils.setError(SignUpErrorConstants.FNAME_LENGTH_ERROR_CODE,
					SignUpErrorConstants.FNAME_LENGTH_ERROR_MSG, SignUpErrorConstants.DATAVALIDATION_ERROR_MESSAGE);
		}
		return err;
	}

	@Override
	public Error validateUNameLength(String uName, Error err) {
		if (uName.length() >= SignUpConstants.UNAME_LENGTH) {
			err = CommonUtils.setError(SignUpErrorConstants.FNAME_LENGTH_ERROR_CODE,
					SignUpErrorConstants.FNAME_LENGTH_ERROR_MSG, SignUpErrorConstants.DATAVALIDATION_ERROR_MESSAGE);
		}
		return err;
	}

	@Override
	public Error validatePasswordMandatory(String password, Error err) {
		if (CommonUtils.isEmpty(password)) {
			err = CommonUtils.setError(SignUpErrorConstants.PASSWORD_MANDATORY_ERROR_CODE,
					SignUpErrorConstants.PASSWORD_MANDATORY_ERROR_MSG,
					SignUpErrorConstants.DATAVALIDATION_ERROR_MESSAGE);
		}
		return err;
	}

	@Override
	public Error isvalidPassword(String password, Error err) {
		if (CommonUtils.isValidPassword(password)) {
			err = CommonUtils.setError(SignUpErrorConstants.PASSWORD_VALIDATION_ERROR_CODE,
					SignUpErrorConstants.PASSWORD_VALIDATION_ERROR_MSG,
					SignUpErrorConstants.DATAVALIDATION_ERROR_MESSAGE);
		}
		return err;
	}

	@Override
	public Error validateEmailMandatory(String email, Error err) {
		if (CommonUtils.isEmpty(email)) {
			err = CommonUtils.setError(SignUpErrorConstants.EMAILID_MANDATORY_ERROR_CODE,
					SignUpErrorConstants.EMAILID_MANDATORY_ERROR_MSG,
					SignUpErrorConstants.DATAVALIDATION_ERROR_MESSAGE);
		}
		return err;
	}

	@Override
	public Error isvalidEmail(String email, Error err) {
		if (CommonUtils.isValidEmail(email)) {
			err = CommonUtils.setError(SignUpErrorConstants.EMAILID_VALIDATION_ERROR_CODE,
					SignUpErrorConstants.EMAILID_VALIDATION_ERROR_MSG,
					SignUpErrorConstants.DATAVALIDATION_ERROR_MESSAGE);
		}
		return err;
	}

}
