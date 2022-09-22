package com.practise;

import java.io.IOException;

/*Exception Handling with Method Overriding in Java

Some of the rules are listed below:

    Rule 1: If the superclass method does not declare an exception, 
    		subclass overridden method cannot declare the checked exception but it can declare unchecked exception.
    		
    Rule 2: If the superclass method declares an exception, 
    		subclass overridden method can declare same, subclass exception or no exception but cannot declare parent exception.
*/

public class ExceptionHandlingEx {

	public class Parent {

		//Parent class method doesnt declared exception
		/*
		 * void msg() { System.out.println("Parent Msg"); }
		 */
		
		
		void msg() throws Exception{
			System.out.println("Parent Msg");
		}
	}

	public class child extends Parent {

		// child class cannot declare parent exception of declared parent class
		//void msg() throws Exception {
		
		void msg() throws ArithmeticException {

		// gives compile time error since checked exception cannot be declared.
		//void msg() throws IOException {
		
			System.out.println("Child Msg");

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		child obj = new ExceptionHandlingEx().new child();
		obj.msg();

	}

}
