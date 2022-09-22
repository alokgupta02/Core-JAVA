package com.practise;

public class RuntimePolymorphism {

	static class Bank{
		void BankName(){
		System.out.println("Parent class");
		}
	}
	
	static class Bank1 extends Bank{
		void BankName() {
			System.out.println("SBI");
		}
	}
	
	static class Bank2 extends Bank{
		void BankName() {
			System.out.println("HDFC");
		}
	}
	
	public static void main(String[] args) {
		Bank a;
		a= new Bank1();
		a.BankName();
		a= new Bank2();
		a.BankName();
	}

}
