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
class Employee {

	private String firstName;
	private String lastName;
	private int salary;
	private List<String> projects;

}

//StreamAPI example from Daily Code Buffer Tutorial - YouTube 
public class StreamAPIExample {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Alok", "Gupta", 180, List.of("Target", "Statefarm", "ATL")));
		employees.add(new Employee("Akanksha", "Sharma", 100, List.of("BWIN", "Statefarm", "ATL")));
		employees.add(new Employee("Shivam", "Bela", 90, List.of("Target", "Orange", "JPMC")));

		// foreach
		System.out.println("Iterating Each object:\n");
		employees.stream().forEach(employee -> System.out.println(employee));

		// map
		System.out.println("\nMap Method() ");
		List<Employee> salaryIncreased = employees.stream().map(employee -> new Employee(employee.getFirstName(),
				employee.getLastName(), employee.getSalary() * 2, employee.getProjects())).collect(Collectors.toList());

		System.out.println("\nAfter Revised Salary : \n");
		salaryIncreased.forEach(employee -> System.out.println(employee));

		// filter
		System.out.println("\nApplying Filter Method() :\n");
		List<Employee> filterEmployee = employees.stream().filter(employee -> employee.getSalary() > 90)
				.map(employee -> new Employee(employee.getFirstName(), employee.getLastName(), employee.getSalary() * 2,
						employee.getProjects()))
				.collect(Collectors.toList());

		System.out.println(filterEmployee);

		// find first
		System.out.println("\nFind First() :\n");
		Employee firstEmployee = employees.stream().filter(employee -> employee.getSalary() > 90)
				.map(employee -> new Employee(employee.getFirstName(), employee.getLastName(), employee.getSalary() * 2,
						employee.getProjects()))
				.findFirst().orElse(null);

		System.out.println(firstEmployee);

		// flat map
		System.out.println("\nFlat Map() :\n");
		String projects = employees.stream().map(employee -> employee.getProjects())
				.flatMap(strings -> strings.stream()).collect(Collectors.joining(","));
		System.out.println("List of Projects : " + projects);

		// skip and limit
		System.out.println("\nSkipping and Liminting object to 1: \n");
		List<Employee> skip = employees.stream().skip(1).limit(1).collect(Collectors.toList());
		System.out.println(skip);

		// finite data
		System.out.println("\nfinite data\n");
		Stream.generate(Math::random).limit(5).forEach(value -> System.out.println(value));

		// sorting
		System.out.println("\nSorted()\n");
		List<Employee> sorted = employees.stream()
				.sorted((o1, o2) -> o1.getFirstName().compareToIgnoreCase(o2.getFirstName()))
				.collect(Collectors.toList());
		System.out.println(sorted);

		// min or max
		Employee maxSalary = employees.stream().max(Comparator.comparing(Employee::getSalary))
				.orElseThrow(NoSuchElementException::new);
		System.out.println("\nMax Salary\n");
		System.out.println(maxSalary);

		// reduce
		Integer sumSalary = employees.stream().map(employee -> employee.getSalary()).reduce(0, Integer::sum);
		System.out.println("\nreduce(): \n");
		System.out.println(sumSalary);

	}

}
