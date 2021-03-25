package com.api.booking.common.reponse.form;

public class ErrorDetails {

	String erroCode;
	String errorDesc;

	public String getErroCode() {
		return erroCode;
	}

	public void setErroCode(String erroCode) {
		this.erroCode = erroCode;
	}

	public String getErrorDesc() {
		return errorDesc;
	}

	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}

	@Override
	public String toString() {
		return "ErrorDetails [erroCode=" + erroCode + ", errorDesc=" + errorDesc + "]";
	}

}
