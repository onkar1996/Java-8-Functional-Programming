package com.functional.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

	public static void main(String[] args) {

		int increment = increment(0);
		System.out.println(increment); // 1

		// Takes 1 Arguments and produces 1 Result
		Function<Integer, Integer> incrementFunc = (x1) -> (x1 + 1);
		Function<Integer, Integer> multiplyBy10 = (x1) -> (x1 * 10);

		System.out.println(incrementFunc.andThen(multiplyBy10).apply(2)); // 1

		// Takes 2 Arguments and produces 1 Result
		BiFunction<Integer, String, Integer> biFuncAdd = (x1, x2) -> x1 + Integer.parseInt(x2);
		System.out.println(biFuncAdd.apply(45, "100"));

	}

	static int increment(int number) {
		return ++number;
	}

}
