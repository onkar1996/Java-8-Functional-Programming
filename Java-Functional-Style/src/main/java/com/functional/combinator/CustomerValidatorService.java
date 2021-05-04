package com.functional.combinator;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {

	private boolean isEmailValid(String email) {
		return email.contains("@");
	}

	private boolean isPhoneValid(String phone) {
		return phone.contains("91");
	}

	private boolean isAdult(LocalDate date) {
		return Period.between(date, LocalDate.now()).getYears() > 16;
	}
	
	public boolean isValid(Customer cust) {
		return isEmailValid(cust.getEmail()) && isPhoneValid(cust.getPhoneNumber()) && isAdult(cust.getDob());
	}

}
