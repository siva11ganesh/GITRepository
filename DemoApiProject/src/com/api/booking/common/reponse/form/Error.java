package com.api.booking.common.reponse.form;

import java.util.List;

public class Error {

	String errorDescription;
	List<ErrorDetails> errorDetails;

	public String getErrorDescription() {
		return errorDescription;
	}

	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

	public List<ErrorDetails> getErrorDetails() {
		return errorDetails;
	}

	public void setErrorDetails(List<ErrorDetails> errorDetails) {
		this.errorDetails = errorDetails;
	}

	@Override
	public String toString() {
		return "Error [errorDescription=" + errorDescription + ", errorDetails=" + errorDetails + "]";
	}

}
