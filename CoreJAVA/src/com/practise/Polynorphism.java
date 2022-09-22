package com.practise;

public class Polynorphism {
	
	static int multi(int a, int b) {
		return a*b;
	}
	
	class Adder extends Polynorphism{
		
		// method overloading
		static int sum(int a, int b){
			return a+b;
		}
		
		static double sum(double a, double b, double c){
			return a+b+c;
		}
		
		// method overriding
		static int multi(int a, int b) {
			return a*a;
		}
		
	}

	public static void main(String[] args) {
		
		System.out.println("Method 1: "+Adder.sum(11,11));
		System.out.println("Method 2: "+Adder.sum(11.4,11.2,11.8));
		System.out.println("Method Overriding: "+Adder.multi(4, 6));
	}

}
