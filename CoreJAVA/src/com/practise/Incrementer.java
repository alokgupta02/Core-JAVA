package com.practise;

public class Incrementer {
	
	static void increment(int max, int incr) throws InterruptedException {
		
		for (int a = 0; a <= max; a += incr) {
			System.out.println(a);
			Thread.sleep(1000);
		}
		
	}

	public static void main(String[] args) {
		try {
			increment(30, 2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

	}

}