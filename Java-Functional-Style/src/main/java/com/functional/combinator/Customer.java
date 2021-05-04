package com.functional.combinator;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Customer {
	private String name;
	private String email;
	private String phoneNumber;
	private LocalDate dob;
}
