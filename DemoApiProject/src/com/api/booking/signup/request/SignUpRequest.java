package com.api.booking.signup.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SignUpRequest {

	String firstName;
	String lastName;
	String userName;
	String password;
	String mailId;
	String mbleNumber;
	String location;
}
