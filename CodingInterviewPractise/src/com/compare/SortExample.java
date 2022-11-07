package com.compare;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortExample {

	public static void main(String[] args) {

		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(23, "Alok", "Delhi", 12000));
		emp.add(new Employee(13, "Amit", "Chennai", 10500));
		emp.add(new Employee(34, "Abhishek", "Varanasi", 15000));
		emp.add(new Employee(33, "Priyanka", "Varanasi", 20000));

		System.out.println(emp);
		// Collections.sort(emp);
		// System.out.println(emp);

		// Collections.sort(emp, new AgeComparator());
		// Collections.sort(emp, new CityComparator());
		// Collections.sort(emp, new NameComparator());
		// System.out.println(emp);

		// Using JAVA8
		// emp.stream().sorted().forEach(System.out::println);
		// emp.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		List<Employee> sort = emp.stream().sorted((o1, o2) -> o2.getAge() - o1.getAge()).collect(Collectors.toList());
		System.out.println(sort);

		// find salary less than 15k
		// emp.stream().filter(x -> x.salary < 15000).map(x ->
		// x.name).forEach(System.out::println);

		// add salary
		// emp.stream().filter(x -> x.salary < 15000).map(x -> (x.salary +
		// 5000)).forEach(System.out::println);

		// print distinct city
		// emp.stream().map(x -> x.city).distinct().forEach(System.out::println);

	}

}
