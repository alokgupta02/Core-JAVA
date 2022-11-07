package com.streamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IntListStreamFunc {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 27, 87, 10, 20, 25, 87, 80, 80);
		Set<Integer> set = new HashSet<>();

		// Count numbers
		System.out.println("Total count : " + list.stream().count());

		// Max number
		System.out.println("Max number : " + list.stream().max(Integer::compare).get());

		// Min Number
		System.out.println("Min number : " + list.stream().min(Integer::compare).get());

		// sum
		System.out.println("Sum : " + list.stream().mapToInt(Integer::intValue).sum());

		// Find First Element
		System.out.print("First Element : ");
		list.stream().findFirst().ifPresent(System.out::println);

		// Even Number
		System.out.println("Even Number : ");
		list.stream().filter(n -> n % 2 == 0).collect(Collectors.toSet()).forEach(x -> System.out.println(x));

		// Even Number
		System.out.println("Odd Number : ");
		list.stream().filter(n -> n % 3 == 0).collect(Collectors.toSet()).forEach(x -> System.out.println(x));

		// Find Duplicate Numbers
		System.out.println("Duplicate Numbers : ");
		list.stream().filter(x -> !set.add(x)).collect(Collectors.toSet()).forEach(x -> System.out.println(x));

		// sorted AESC
		System.out.println("Sorted in AESC: ");
		list.stream().sorted().forEach(System.out::println);

		// sorted DESC
		System.out.println("Sorted in DESC: ");
		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

		// skip
		System.out.println("SKIP - 2");
		System.out.println("Total Count : " + list.stream().count());
		System.out.println("Count after skip : " + list.stream().skip(2).count());

		// Limit
		System.out.println("Limit ");
		list.stream().limit(3).forEach(System.out::println);

		String str = "mc bc mc bkl bkl mc mc bkc";
		List<String> strList = Arrays.asList(str.split(" "));

		Map<String, Long> map = strList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);

		str = "ab bb cc ab bc bc bb aa ab";

		List<String> strlist = Arrays.asList(str.split(" "));

		Map<String, Long> map1 = strlist.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map1);
	}

}
