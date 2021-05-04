package com.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@SpringBootApplication
public class JavaFunctionalStyleApplication {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Jkohn"), new Person("sam"), new Person("tom"),
				new Person("James"), new Person("shamus"));

		// imperative approach
		List<Person> jstart = new ArrayList<>();
		for (Person person : people) {
			if (person.getName().startsWith("J")) {
				jstart.add(person);
			}
		}

		for (Person person : jstart) {
			System.out.println(person.getName());
		}

		// Functional programming - declarative
		Predicate<Person> predicate = person -> person.getName().startsWith("J");
		people.stream().filter(predicate).map(person -> person.getName()).forEach(System.out::println);

	}

	@AllArgsConstructor
	@Getter
	@ToString
	static class Person {
		private final String name;
	}

}
