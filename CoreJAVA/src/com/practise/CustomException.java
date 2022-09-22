package com.practise;

public class CustomException {

	static void validate(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new CustomException().new InvalidAgeException("Age is not valid");
		} else {
			System.out.println("Age is valid");
		}
	}

	public class InvalidAgeException extends Exception {

		// create constructor
		public InvalidAgeException(String str) {
			// calling the constructor of parent Exception
			super(str);
		}

	}

	public static void main(String[] args) {
		try {
			validate(13);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
		System.out.println("Re enter correct Age");

	}

}
