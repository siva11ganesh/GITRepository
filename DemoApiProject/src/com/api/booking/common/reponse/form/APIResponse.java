package com.api.booking.common.reponse.form;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class APIResponse {
	Object responsedata;
	Error error;
}
