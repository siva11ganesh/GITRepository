package com.api.booking.common.util;

import java.util.ArrayList;
import java.util.List;

import com.api.booking.common.reponse.form.ErrorDetails;
import com.api.booking.common.reponse.form.Error;

public class CommonUtils {

	public static Error setError(String errCode, String errMsg, String errDesc) {
		Error err = new Error();
		ErrorDetails errDetails = new ErrorDetails();
		errDetails.setErroCode(errCode);
		errDetails.setErrorDesc(errMsg);
		List<ErrorDetails> errList = new ArrayList<ErrorDetails>(1);
		errList.add(errDetails);
		err.setErrorDescription(errDesc);
		err.setErrorDetails(errList);
		return err;
	}
}
