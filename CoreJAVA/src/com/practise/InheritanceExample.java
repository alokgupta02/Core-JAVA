package com.practise;

public class InheritanceExample {
	
	int weight = 50;
	
	void printWeight(){
		System.out.println("Weight : "+weight);
	}
	
	public class Subclass extends InheritanceExample {
		
		int code = 98;
		
		void printCode(){
			System.out.println("Code : "+code);
		}

		
		
	}

	public static void main(String[] args) {
		Subclass sc = new InheritanceExample(). new Subclass();
		InheritanceExample ie  = new InheritanceExample();
		ie=sc;
		

	}

}
