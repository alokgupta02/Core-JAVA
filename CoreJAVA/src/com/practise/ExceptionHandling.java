package com.practise;

public class ExceptionHandling {

	public static void main(String[] args) {

		int a = 0;
		int arr[] = new int[5];

		//nested try-catch
		try {
			try {
				a = 10 / 0;
			} catch (ArithmeticException e) {
				//System.out.println(a);
				System.out.println("Exception: Cant divide by zero");
			}
			try {
				arr[5]=0;

			} catch (ArithmeticException e) {
				System.out.println("Exception:  Array is out of bound");
			}
		}
		
		// outer catch is called since it handled the corresponding exception
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Parent Exception occurs");
		}

		// rest of the code that will be executed
		System.out.println("Hello");
	}
}
