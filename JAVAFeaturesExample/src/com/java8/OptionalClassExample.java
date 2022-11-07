package com.java8;

import java.util.Optional;

public class OptionalClassExample {

	public static void main(String[] args) {

		String name = "abc";

		Optional<String> opt = Optional.of(name);
		System.out.println(opt.isPresent());

		Optional<String> opt1 = Optional.ofNullable(name);
		System.out.println(opt1.get());

		if (opt1.isPresent()) {
			System.out.println(opt1.get());
		} else {
			System.out.println("value is not present");
		}

		/*
		 * if(name != null && !name.isBlank()) { System.out.println(name); } else {
		 * System.out.println("No Data"); }
		 */
	}

}
