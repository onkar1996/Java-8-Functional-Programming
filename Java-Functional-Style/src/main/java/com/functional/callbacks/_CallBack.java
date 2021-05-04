package com.functional.callbacks;

import java.util.Optional;
import java.util.function.Consumer;

public class _CallBack {

	public static void main(String[] args) {
		
		hello("Onkar", "heer", value -> System.out.println("lastname not provided for " + value));

		hello2("Onkar", null, () -> System.out.println("lastname not provided for "));

	}

	static void hello(String firstName, String lastName, Consumer<String> callback) {

		System.out.println(firstName);

		if (Optional.ofNullable(lastName).isPresent()) {
			System.out.println(lastName);
		} else {
			callback.accept(firstName);
		}

	}
	
	static void hello2(String firstName, String lastName, Runnable callback) {

		System.out.println(firstName);

		if (Optional.ofNullable(lastName).isPresent()) {
			System.out.println(lastName);
		} else {
			callback.run();;
		}

	}

}
