package com.java8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodReferenceExample {

	public static int add(int a, int b) {
		return a + b;
	}

	public static void greet(String name) {
		System.out.println("Hello " + name);
	}

	public void greeta(String name) {
		System.out.println("Hello Greeta " + name);
	}

	@FunctionalInterface
	interface Exclusive {
		void name(String msg);
	}

	public static void main(String[] args) {

		// 1. Method Reference to a Static Method

		// using Lambda Expression
		BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> MethodReferenceExample.add(a, b);
		System.out.println(biFunction.apply(18, 5));

		// Using static method reference
		BiFunction<Integer, Integer, Integer> bifun = MethodReferenceExample::add;
		System.out.println(bifun.apply(19, 12));

		/*
		 * Consumer<String> con = MethodReferenceExample::greet; con.accept("Alok");
		 */

		// 2. Method Reference to a Instance Method of an object

		// lambda expression
		Exclusive ex = msg -> MethodReferenceExample.greet(msg);
		ex.name("Lambda");

		// without lambda, Using static method reference
		Exclusive ex1 = MethodReferenceExample::greet;
		ex1.name("Lambda1");

		// through creating object of class
		MethodReferenceExample meth = new MethodReferenceExample();
		Exclusive exclusive = meth::greeta;
		exclusive.name("lol");

		// 3. Calling Method of an arbitrary object

		// using lambda
		Function<String, String> func = (String msg) -> msg.toLowerCase();
		System.out.println(func.apply("LOWER CASE"));

		Function<String, String> func1 = String::toLowerCase;
		System.out.println(func1.apply("LOWER CASE"));

		// 4. Reference to a Constructor

		List<String> fruits = new ArrayList<String>();
		fruits.add("Orange");
		fruits.add("Pineapple");
		fruits.add("Mango");
		fruits.add("Grapes");

		// using lambda
		Function<List<String>, Set<String>> funcList = (fruitsList) -> new HashSet<>(fruitsList);
		System.out.println(funcList.apply(fruits));

		Function<List<String>, Set<String>> functionList = HashSet::new;
		System.out.println(functionList.apply(fruits));

	}
}