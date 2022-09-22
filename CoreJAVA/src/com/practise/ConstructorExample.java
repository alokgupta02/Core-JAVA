/**
 * 
 */
package com.practise;

/**
 * @author Alok Gupta
 *
 */
public class ConstructorExample {

	/**
	 * @param args
	 */
	String abc;
	String name;
	int num;

	// overriding default constructor
	ConstructorExample() {
		abc="abc";
		System.out.println("Hi..");
		System.out.println(abc);
	}

	// paremeterized constructor
	ConstructorExample(String naam, int n) {
		this.name = naam;
		this.num = n;
	}

	boolean equalTo(ConstructorExample a) {
		if (a.name == name && a.num == num)
			return true;
		else
			return false;
	}

	void display() {
		System.out.println("Name: " + name + " Age: " + num);

	}

	public static void main(String[] args) {

		//ConstructorExample c = new ConstructorExample("alok", 33);
		ConstructorExample c1 = new ConstructorExample();
		//c.display();
		
		//passing object as parameter
		ConstructorExample obj1 = new ConstructorExample("abc", 10);
		ConstructorExample obj2 = new ConstructorExample("abc", 1);

		System.out.println("Checking equal.. " + obj1.equalTo(obj2));

	}

}
