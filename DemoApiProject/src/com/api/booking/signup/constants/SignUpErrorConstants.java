package com.api.booking.signup.constants;

public interface SignUpErrorConstants {

	// 1-mandatory
	// 2-dataType
	// 3-length
	// 4-API Business
	// 5-Business
	String DATAVALIDATION_ERROR_MESSAGE = "Data validation Failure";
	String BUSINESSVALIDATION_ERROR_MESSAGE = "Business validation Failure";
	String FNAME_MANDATORY_ERROR_CODE = "1100";
	String FNAME_MANDATORY_ERROR_MSG = "First Name is Mandatory";
	String LNAME_MANDATORY_ERROR_CODE = "1200";
	String LNAME_MANDATORY_ERROR_MSG = "Last Name is Mandatory";
	String UNAME_MANDATORY_ERROR_CODE = "1300";
	String UNAME_MANDATORY_ERROR_MSG = "User Name is Mandatory";
	String FNAME_DATATYPE_ERROR_CODE = "2100";
	String FNAME_DATATYPE_ERROR_MSG = "First Name must be Alphabets";
	String LNAME_DATATYPE_ERROR_CODE = "2200";
	String LNAME_DATATYPE_ERROR_MSG = "Last Name must be Alphabets";
	String UNAME_DATATYPE_ERROR_CODE = "2300";
	String UNAME_DATATYPE_ERROR_MSG = "User Name must be Alphabets";
	String FNAME_LENGTH_ERROR_CODE = "3100";
	String FNAME_LENGTH_ERROR_MSG = "Inavlid Length of First Name";
	String LNAME_LENGTH_ERROR_CODE = "3200";
	String LNAME_LENGTH_ERROR_MSG = "Inavlid Length of Last Name";
	String UNAME_LENGTH_ERROR_CODE = "3300";
	String UNAME_LENGTH_ERROR_MSG = "Inavlid Length of User Name";
	String PASSWORD_MANDATORY_ERROR_CODE = "1400";
	String PASSWORD_MANDATORY_ERROR_MSG = "Password is Mandatory";
	String PASSWORD_VALIDATION_ERROR_CODE = "2400";
	String PASSWORD_VALIDATION_ERROR_MSG = "Invalid type of Password";
	String EMAILID_MANDATORY_ERROR_CODE = "1500";
	String EMAILID_MANDATORY_ERROR_MSG = "Email id is Mandatory";
	String EMAILID_VALIDATION_ERROR_CODE = "2500";
	String EMAILID_VALIDATION_ERROR_MSG = "Invalid type of Email ID";
	String EMAILID_EXISTS_ERROR_CODE = "4100";
	String EMAILID_EXISTS_ERROR_MSG = "Email ID already exists";
	String SIGNUP_REGISTATION_FAILED_ERROR_CODE = "5100";
	String SIGNUP_REGISTATION_FAILED_ERROR_MSG = "SignUp Registration Failed";
}
