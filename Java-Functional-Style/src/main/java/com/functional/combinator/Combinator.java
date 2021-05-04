package com.functional.combinator;

import java.time.LocalDate;

public class Combinator {

	public static void main(String[] args) {

		Customer cust = new Customer("Alice", "alice@gmail.com", "91736467", LocalDate.of(2015, 12, 12));

//		System.out.println(new CustomerValidatorService().isValid(cust));

		// if valid We can store customer in db

		// Using Cobinator pattern
		ValidationResult result = CustomerRegistrationValidator.isEmailValid()
				.and(CustomerRegistrationValidator.isPhoneValid().and(CustomerRegistrationValidator.isAdult()))
				.apply(cust);
		
		System.out.println(result);

	}

}
