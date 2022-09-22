package com.practise;

import java.awt.DisplayMode;

public class CallByExample {

	static int a;
	
	static void display(int b){
		a=100+b;
		System.out.println("value : "+a);
	}
	
	public static void main(String[] args) {
		display(40);

	}

}
