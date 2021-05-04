package com.functional;

import java.util.stream.Stream;

public class StreamIterating {

	public static void main(String[] args) {

		Stream.iterate(1, element -> element + 1).filter(element -> element % 5 == 0).limit(10)
				.forEach(System.out::println);
		
		
		Stream.iterate(1, value -> value+1).limit(100).forEach(System.out::println);

	}

}
