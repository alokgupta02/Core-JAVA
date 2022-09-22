package com.practise;

public class Abstract {
	
	static abstract class Parent{
		
		void hi() {
			System.out.println("Hi..");
		}
		
		abstract void bye();
	}
	
	static abstract class Child extends Parent{

		@Override
		void bye() {
			System.out.println("Bye..");
		}
		
		abstract void talk();
		
		
	}
	static class Child2 extends Child{

		@Override
		void talk() {
			System.out.println("How are You?");
		}
		 
	 }
	public static void main(String[] args) {
		
		Child2 c = new Child2();
		c.hi();
		c.talk();
		c.bye();
	}

}
