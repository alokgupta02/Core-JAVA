package com.practise;

public class MyClass {

	int h, l, b;

	void volume() {
		System.out.println(h * l * b);
	}

	public static void main(String[] args) {
		MyClass obj1 = new MyClass();
		MyClass obj2 = new MyClass();

		obj1.h = 10;
		obj1.b = 10;
		obj1.l = 10;

		obj2.h = 5;
		obj2.b = 5;
		obj2.l = 5;

		obj1.volume();
		obj2.volume();

	}
}