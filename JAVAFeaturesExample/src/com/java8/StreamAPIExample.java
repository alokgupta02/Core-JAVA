package com.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
class Employee1 {

	private String firstName;
	private String lastName;
	private int salary;
	private List<String> projects;

}

//StreamAPI example from Daily Code Buffer Tutorial - YouTube 
public class StreamAPIExample {

	public static void main(String[] args) {

		List<Employee1> employee1s = new ArrayList<>();
		employee1s.add(new Employee1("Alok", "Gupta", 180, List.of("Target", "Statefarm", "ATL")));
		employee1s.add(new Employee1("Akanksha", "Sharma", 100, List.of("BWIN", "Statefarm", "ATL")));
		employee1s.add(new Employee1("Shivam", "Bela", 90, List.of("Target", "Orange", "JPMC")));

		// foreach
		System.out.println("Iterating Each object:\n");
		employee1s.stream().forEach(employee1 -> System.out.println(employee1));

		// map
		System.out.println("\nMap Method() ");
		List<Employee1> salaryIncreased = employee1s.stream().map(
				employee1 -> new Employee1(employee1.getFirstName(),
				employee1.getLastName(), employee1.getSalary() * 2, employee1.getProjects())).collect(Collectors.toList());

		System.out.println("\nAfter Revised Salary : \n");
		salaryIncreased.forEach(employee1 -> System.out.println(employee1));

		// filter
		System.out.println("\nApplying Filter Method() :\n");
		List<Employee1> filterEmployee1 = employee1s.stream().filter(employee1 -> employee1.getSalary() > 90)
				.map(employee1 -> new Employee1(employee1.getFirstName(), employee1.getLastName(), employee1.getSalary() * 2,
						employee1.getProjects()))
				.collect(Collectors.toList());

		System.out.println(filterEmployee1);

		// find first
		System.out.println("\nFind First() :\n");
		Employee1 firstEmployee1 = employee1s.stream().filter(employee1 -> employee1.getSalary() > 90)
				.map(employee1 -> new Employee1(employee1.getFirstName(), employee1.getLastName(), employee1.getSalary() * 2,
						employee1.getProjects()))
				.findFirst().orElse(null);

		System.out.println(firstEmployee1);

		// flat map
		System.out.println("\nFlat Map() :\n");
		String projects = employee1s.stream().map(employee1 -> employee1.getProjects())
				.flatMap(strings -> strings.stream()).collect(Collectors.joining(","));
		System.out.println("List of Projects : " + projects);

		// skip and limit
		System.out.println("\nSkipping and Liminting object to 1: \n");
		List<Employee1> skip = employee1s.stream().skip(1).limit(1).collect(Collectors.toList());
		System.out.println(skip);

		// finite data
		System.out.println("\nfinite data\n");
		Stream.generate(Math::random).limit(5).forEach(value -> System.out.println(value));

		// sorting
		System.out.println("\nSorted()\n");
		List<Employee1> sorted = employee1s.stream()
				.sorted((o1, o2) -> o1.getFirstName().compareToIgnoreCase(o2.getFirstName()))
				.collect(Collectors.toList());
		System.out.println(sorted);

		// min or max
		Employee1 maxSalary = employee1s.stream().max(Comparator.comparing(Employee1::getSalary))
				.orElseThrow(NoSuchElementException::new);
		System.out.println("\nMax Salary\n");
		System.out.println(maxSalary);

		// reduce
		Integer sumSalary = employee1s.stream().map(employee1 -> employee1.getSalary()).reduce(0, Integer::sum);
		System.out.println("\nreduce(): \n");
		System.out.println(sumSalary);

	}

}
