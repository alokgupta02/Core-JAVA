package com.practise;

import java.util.Scanner;


// find odd and even number in an array

public class OddEvenFinderArray {

	public static int size;
	public static int tmp;
	public static int arr[];
	public static int odd[];
	public static int even[];
	public static int oddCount = 0;
	public static int evenCount = 0;

	public static void findNumbers() {

		Scanner sc = new Scanner(System.in);

		// Take the size of the array from user
		System.out.print("Enter the size of the array : ");
		size = sc.nextInt();
		arr = new int[size];
		System.out.println("Size of the Array is : " + size);

		// set size
		arr = new int[size];
		odd = new int[size];
		even = new int[size];

		// Take values from user
		for (int m = 0; m < size; m++) {
			System.out.print("Enter the number : ");
			int a = sc.nextInt();
			arr[m] = a;
		}
		
		// print the values entered
		System.out.print("Values entered in an Array : ");
		for (int n : arr) {
			System.out.print(n + " ");
		}

		System.out.println();
		
		// determine odd/ even number
		for (int p = 0; p < size; p++) {
			if (arr[p] % 2 == 0) {
				even[evenCount] = arr[p];
				evenCount++;
			} else {
				odd[oddCount] = arr[p];
				oddCount++;
			}
		}
		
		// print odd number on screen
		System.out.print("Odd Number entered are : ");
		for (int z = 0; z < size; z++) {
			// donot print 0 values
			if(odd[z]==0) {
				break;
			}
			else {
				System.out.print(" " + odd[z]);
			}
		}

		//print even number on screen
		System.out.print("\n" + "Even Number entered are : ");
		for (int x = 0; x < size; x++) {
			// donot print 0 values
			if(even[x]==0) {
				break;
			}
			else {
				System.out.print(" " + even[x]);
			}
		}
		sc.close();
	}

	public static void main(String[] args) {
		findNumbers();
	}
}