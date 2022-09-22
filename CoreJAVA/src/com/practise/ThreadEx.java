package com.practise;

public class ThreadEx {

	/*
	 * There are two ways to create a thread:
	 * 
	 * By extending Thread class By implementing Runnable interface.
	 */

	// implementing a thread by extending Thread class
	class Thread1 extends Thread {

		public void run() {

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("Thread 1");

		}
	}

	// implementing a thread by implementing Runnable interface.
	class Thread2 implements Runnable {
		public void run() {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread 2");

		}
	}

	class Thread3 extends Thread {

		public void run() {
			System.out.println("Thread 3");
		}
	}

	class Thread4 extends Thread {

		public void run() {
			System.out.println("Thread 4");
		}
	}

	public static void main(String[] args) {
		Thread1 t1 = new ThreadEx().new Thread1();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		/*
		 * If you are not extending the Thread class, your class object would not be
		 * treated as a thread object. So you need to explicitly create the Thread class
		 * object. We are passing the object of your class that implements Runnable so
		 * that your class run() method may execute.
		 */
		Thread2 t2 = new ThreadEx().new Thread2();
		Thread t = new Thread(t2);
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Thread3 t3 = new ThreadEx().new Thread3();
		t3.start();

		Thread4 t4 = new ThreadEx().new Thread4();
		t4.start();

	}

}
