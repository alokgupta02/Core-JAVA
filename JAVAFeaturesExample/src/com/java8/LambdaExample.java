package com.java8;

interface Shape {
	void draw();
}

interface TwoNum {
	int num(int a, int b);
}

interface Name {
	public String author(String msg);
}

public class LambdaExample {

	public static void main(String[] args) {
		
		Shape s1 = () -> System.out.println("Shape1 draw() method");
		// s.draw();

		// Shape s2 = () -> System.out.println("Shape draw() method");

		//TwoNum add = (a, b) -> (a + b);
		// System.out.println("Addition is : " +add.num(10, 5));

		// mentioning data type
		TwoNum sub = (int a, int b) -> (a - b);
		System.out.println("Subtraction is : " + sub.num(10, 5));

		// with return statement
		TwoNum multi = (a, b) -> {
			return a * b;
		};
		System.out.println("Multiplication is : " + multi.num(10, 5));

		// Lambda expression without return keyword
		TwoNum div = (a, b) -> (a / b);
		System.out.println("Division is : " + div.num(10, 5));

		// omitting function parentheses
		Name n = gsm -> {
			return "Author name is " + gsm;
		};
		System.out.println(n.author("Alok Gupta"));

		// passing object that contains lambda expression as a method parameter
		print(s1);
		//passing lambda expression as parameter
		print(() -> System.out.println("Shape2 draw() method"));
		addition((a, b) -> (a + b));

	}

	static void print(Shape shape) {
		shape.draw();
	}

	static void addition(TwoNum tw) {
		System.out.println("Addition is : " + tw.num(5, 6));
	}
}