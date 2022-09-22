package com.practise;

public class InterfaceClass {
	
	public interface id{
		void Name();
		void Age();	
		void citys();
		int a = 33;
	}
	
	public interface city{
		void citys();
	}
	
	
	public interface address extends city{
		void state();
		
	}
	
	static class id1 implements id, city{
		
		@Override
		public void Name() {
			System.out.println("Name is Alok");
			
		}

		@Override
		public void Age() {
			System.out.println("Age is :"+a);
		}

	
		public void citys() {
			System.out.println("City: LKO");
			
		}
		
		public void display() {
			System.out.println("Displaying Data...");
		}
	}
	
	static class AddId implements address{

		@Override
		public void citys() {
			System.out.println("Default City");
			
		}

		@Override
		public void state() {
			System.out.println("Default State");
			
		}
		
	}
	
	abstract class A implements address{
		public void city() {
			System.out.println("City: Pune");
		}
	}
	
	class B extends A{

		@Override
		public void state() {
		}

		@Override
		public void citys() {
		}
		
	}
	
	public static void main(String[] args) {
		id1 ab = new id1();
		//id obj1 = new id1(); 
		
		ab.Age();
		ab.Name();
		ab.citys();
		
		AddId ai = new AddId();
		ai.citys();
		ai.state();	

	}

}