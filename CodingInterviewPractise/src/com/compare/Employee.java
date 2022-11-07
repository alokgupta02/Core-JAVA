package com.compare;

public class Employee implements Comparable<Employee> {

	int age;
	String name;
	String city;
	int salary;

	public Employee(int age, String name, String city, int salary) {
		super();
		this.age = age;
		this.name = name;
		this.city = city;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", city=" + city + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return this.age - o.age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
