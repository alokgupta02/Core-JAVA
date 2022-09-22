package com.practise;

public class SuperKeyword {
	
	
	String Name = "alok";
	
	// constructor parent
	SuperKeyword(){
		System.out.println("CONSTRUCTOR INVOKED...");
	}
	
	void printName(){
		System.out.println("parent..");
	}
	
	void leSuper() {
		System.out.println("le Super method");
	}
	

	public class childSuper extends SuperKeyword{
		
		String Name = "Amit";
		
		childSuper(){
			// invoking parent constuctor
			super();
		}
		
		void printName() {
			// invoking parent variable
			System.out.println(super.Name);
			System.out.println(Name);
			//invoking parent method
			super.leSuper();
			
		}
	}
	public static void main(String[] args) {

		childSuper cs = new SuperKeyword().new childSuper();
		cs.printName();
	}

}
