package com.java8;

import java.util.function.Function;

class FunctionImpl implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer t) {
		return t * t;
	}

}

/*Functional Interface can contain any number of Static and 
Default method but it should contain only one abstract method.*/

@FunctionalInterface
public interface FuntcionalInterfaceExample {

	void print(String msg);

	default void display() {
		System.out.println("Hello World");
	}

	static void greet() {
		System.out.println("Greetings User");
	}

	/*
	 * //traditional way to implement abstract method. public class User implements
	 * FuntcionalInterfaceExample{
	 * 
	 * 		@Override public void print(String msg) 
	 * 		{ 
	 * 			System.out.println("Welcome" +msg+"to JAVA 8 Example Series."); 
	 * 		} 
	 * }
	 */

	// implementing & calling abstract method using Lambda Expression
	public static void main(String[] args) {
		FuntcionalInterfaceExample obj = msg -> System.out.println("Welcome " + msg + " to JAVA 8 Example Series.");
		obj.print("Alok");
		obj.display();
		FuntcionalInterfaceExample.greet();
		
		Function<Integer,Integer> func = z -> z*z;
		System.out.println("Square is : "+func.apply(8));
	}
}