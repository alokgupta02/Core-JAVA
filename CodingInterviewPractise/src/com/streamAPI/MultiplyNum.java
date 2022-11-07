package com.streamAPI;

public class MultiplyNum {

	@FunctionalInterface
	interface Multiply {

		int multi(int a, int b);

	}

	public static void main(String[] args) {

		Multiply m = (a, b) -> a * b;
		System.out.println(m.multi(2, 3));

	}

}
