package com.practise;

public class UpcastingDowncasting {
	
	static class Animal{
		
		void name() {
			System.out.println("Animal class");
		}
		
		void meme()
		{
			System.out.println("meme parent");
		}
	}
	
	static class Dog extends Animal{
		void name() {
			System.out.println("Dog class");
		}
	}

	public static void main(String[] args) {
		
		//upcasting
		Animal a = new Dog();
		a.name();
		
		
		//downcasting
		Dog d = (Dog)a;
		d.meme();
	}

}
