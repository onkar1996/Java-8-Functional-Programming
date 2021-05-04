package com.functional.functionalinterface;

import java.util.function.Supplier;

public class _Supplier {

	public static void main(String[] args) {

		System.out.println(getDBConnectionUrl());

		// It just supplies the results or just returns result using get method
		Supplier<String> getDBConnectionSupplier = () -> "jdbc://localhost:5432/users";
		System.out.println(getDBConnectionSupplier.get());

	}

	static String getDBConnectionUrl() {
		return "jdbc://localhost:5432/users";
	}

}
