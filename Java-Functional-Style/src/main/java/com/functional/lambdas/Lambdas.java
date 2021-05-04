package com.functional.lambdas;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {

	public static void main(String[] args) {

		// No primitive types are allowed as we cannot assign null
		// We have to use Object types
		BiFunction<String, Integer, String> upperCase = (name, age) -> {
			System.out.println(age);
			return name.toUpperCase();
		};

		Function<String, String> lowerCase = String::toLowerCase;

		System.out.println(upperCase.apply("Onkar", 20));

		System.out.println(lowerCase.apply("Onkar"));

	}

}
