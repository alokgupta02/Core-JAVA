package com.practise;

//throw vs throws exception example

public class ThrowVsThrowsException {
	
	public int a, b, c=10; 
	
	public int divide() throws ArithmeticException {
		return c = a/b;
		
	}
	
	public void arr() {
		if (c==0) {
		throw new ArrayIndexOutOfBoundsException("Error occured : C is Zero");
		}
		else {
		System.out.println("Value of C is : "+c);
		}

		
	}

	public static void main(String[] args) {
		ThrowVsThrowsException  obj = new ThrowVsThrowsException();
		
		try{
			obj.divide();
		}
		catch(ArithmeticException e){
			System.out.println("Error Occured in Divison");
			
		}
		obj.arr();
		
		

	}

}
