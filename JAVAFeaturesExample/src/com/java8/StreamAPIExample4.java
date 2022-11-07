package com.java8;

import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIExample4 {

	static List<String> listName = List.of("Suraj", "Surya", "Alok", "Ram");
	static List<Integer> listNo = List.of(55, 86, 34, 12, 75, 8);

	public static void main(String[] args) {

		List n = listName.stream().filter(e -> e.startsWith("Su")).collect(Collectors.toList());
		System.out.println("Name starts with Su = " + n);

		List<Integer> m = listNo.stream().filter(s -> (s > 50)).collect(Collectors.toList());
		System.out.println("Number greater then 50 = " + m);

		/*
		 * List<Integer> m = listNo.stream().
		 * System.out.println("Number greater then 50 = " + m);
		 */

	}

}
