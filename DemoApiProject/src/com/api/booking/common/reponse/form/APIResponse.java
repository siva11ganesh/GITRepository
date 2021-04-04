package com.api.booking.common.reponse.form;

public class APIResponse {
	Object responsedata;
	Error error;

	public Object getResponsedata() {
		return responsedata;
	}

	public void setResponsedata(Object responsedata) {
		this.responsedata = responsedata;
	}

	public Error getError() {
		return error;
	}

	public void setError(Error error) {
		this.error = error;
	}

	@Override
	public String toString() {
		return "APIResponse [responsedata=" + responsedata + ", error=" + error + "]";
	}
}
