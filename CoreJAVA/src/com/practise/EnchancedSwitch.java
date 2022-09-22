package com.practise;

public class EnchancedSwitch {

	public static void main(String[] args) {

		int a = 5;

		int b = switch (a) {
			// multiple line of code
			case 5, 6, 7 -> {
				System.out.println("case not met");
				System.out.println("huehuehue");
				yield 9;
			}
			// single line of code
			case 10 -> {
				System.out.println("case met");
				yield 9;
			}
			default -> throw new IllegalArgumentException("Unexpected value: " + a);
		};
		System.out.println("b : " + b);

		String str = """
							Text blocks support strings that
				     span two or more lines and preserve
				indentation. They reduce the
				            tedium associated with the
				   entry of long or complicated
				          strings into a program.
							""";

		System.out.println(str);
	}
}