package com.functional.functionalinterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {

	public static void main(String[] args) {
		String phone1 = "07305045041";
		String phone2 = "074050450";

		// Declarative
		System.out.println(isPhoneNumberValid(phone1));
		System.out.println(isPhoneNumberValid(phone2));

		// Predicate is a 1 boolean valued function
		Predicate<String> isPhoneNumberValidPre = phoneNumber -> phoneNumber.startsWith("07")
				&& phoneNumber.length() == 11;
		System.out.println(isPhoneNumberValidPre.test(phone1));
		System.out.println(isPhoneNumberValidPre.test(phone2));

		// 2 Predicates at same time
		Predicate<String> containsNumber3 = phoneNumber -> phoneNumber.contains("3");
		System.out.println(isPhoneNumberValidPre.or(containsNumber3).test(phone1));

		// BiPredicate takes 2 Arguments to check boolean return
		BiPredicate<String, String> isBothMatch = (x1, x2) -> {
			return x1.length() == x2.length();
		};
		System.out.println(isBothMatch.test("abc", "xy"));

	}

	static boolean isPhoneNumberValid(String phoneNumber) {
		return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
	}

}
