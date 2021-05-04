package com.functional.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

public class _Stream {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Jkohn"), new Person("sam"), new Person("sam"),
				new Person("James"), new Person("shamus"));

		// Functional programming - declarative

		people.stream().map(person -> person.name).collect(Collectors.toSet()).forEach(System.out::println);

		System.out.println(people.stream().map(person -> person.getName()).distinct().collect(Collectors.toList()));

	}

	@AllArgsConstructor
	@Getter
	@ToString
	static class Person {
		private final String name;
	}

}
