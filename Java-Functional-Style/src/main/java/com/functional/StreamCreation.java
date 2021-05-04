package com.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreation {

	/*
	 * There are several ways to create a stream. All of the examples below will
	 * create an identical Stream object.
	 */

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();

		// create stream from existing list using arrays.stream()
		Stream<Integer> streamNums = nums.stream();

		// create stream from existing list using Stream.of()
		Stream<List<Integer>> streamNums1 = Stream.of(nums);

		// create stream from valuesF
		Stream<Integer> streamNums2 = Stream.of(1, 2, 3);

	}

}
