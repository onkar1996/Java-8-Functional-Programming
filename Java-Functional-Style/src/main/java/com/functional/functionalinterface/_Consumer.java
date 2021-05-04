package com.functional.functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

	public static void main(String[] args) {

		// Normal java function
		Customer maria = new Customer("Maria", "99999");
		greetCustomer(maria);

		// Consumer Functional Interface , Accepts 1 Argument and returns nothing
		Consumer<Customer> greetConsumer = cust -> System.out.println(
				"hi " + cust.getCustomerName() + " Thanks for registering, number " + cust.getCustomerPhoneNumber());
		greetConsumer.accept(maria);

		// BiConsumer Functional Interface , Accepts 2 Arguments and returns nothing
		BiConsumer<Customer, Boolean> showPhoneNumber = (cust, show) -> System.out
				.println("hi " + cust.getCustomerName() + " Thanks for registering, number "
						+ (show ? cust.getCustomerPhoneNumber() : "******"));
		
		showPhoneNumber.accept(maria, false);

	}

	static void greetCustomer(Customer cust) {
		System.out.println(
				"hi " + cust.getCustomerName() + " Thanks for registering, number " + cust.getCustomerPhoneNumber());
	}

	static class Customer {
		private final String customerName;
		private final String customerPhoneNumber;

		public String getCustomerName() {
			return customerName;
		}

		public String getCustomerPhoneNumber() {
			return customerPhoneNumber;
		}

		public Customer(String customerName, String customerPhoneNumber) {
			super();
			this.customerName = customerName;
			this.customerPhoneNumber = customerPhoneNumber;
		}
	}

}
