package com.api.booking.common.util;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.api.booking.common.reponse.form.ErrorDetails;
import com.api.booking.common.reponse.form.Error;

public class CommonUtils {

	private CommonUtils() {
		throw new IllegalStateException("CommonUtils class");
	}

	public static Error setError(String errCode, String errMsg, String errDesc) {
		Error err = new Error();
		ErrorDetails errDetails = new ErrorDetails();
		errDetails.setErroCode(errCode);
		errDetails.setErrorDesc(errMsg);
		List<ErrorDetails> errList = new ArrayList<>(1);
		errList.add(errDetails);
		err.setErrorDescription(errDesc);
		err.setErrorDetails(errList);
		return err;
	}

	public static boolean isEmpty(String val) {
		return (val == null) || (val.trim().length() == 0);
	}

	public static boolean isEmptyInt(int val) {
		if (val == 0) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean isNumeric(String val) {
		if (val == null) {
			return false;
		}
		for (int i = val.length() - 1; i >= 0; i--) {
			if (!Character.isDigit(val.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	public static boolean isAlpha(String val) {
		if (val == null) {
			return false;
		}
		for (int i = val.length() - 1; i >= 0; i--) {
			if (!Character.isLetter(val.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	public static boolean isValidPassword(String value) {
		String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(value);
		return matcher.matches();
	}

	public static boolean isValidEmail(String email) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
				+ "A-Z]{2,7}$";

		Pattern pat = Pattern.compile(emailRegex);
		if (email == null)
			return false;
		return pat.matcher(email).matches();
	}
}
