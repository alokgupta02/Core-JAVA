package com.practise;

import java.util.Scanner;

// Rearrange array in DESC/AESC order
public class DESCArray {

	public static int arr[];
	public static int size;
	public static int tmp;

	public static void rearrange() {

		Scanner sc = new Scanner(System.in);
		// Take the size of the array from user
		System.out.print("Enter the size of the array : ");
		size = sc.nextInt();

		arr = new int[size];

		System.out.println("Size of the Array is : " + size);

		for (int m = 0; m < size; m++) {
			// Take the value of array from user
			System.out.print("Enter the number : ");
			int a = sc.nextInt();
			arr[m] = a;
		}

		System.out.println("Array BEFORE re-arranging in DESC order..");
		for (int n : arr) {
			System.out.print(n + " ");
		}

		// Arrays.sort(arr);

		// sort logic 14 65 55 16
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				} else {
				}
			}
		}

		System.out.println("\n" + "Array AFTER re-arranging in DESC order..");
		for (int p : arr) {
			System.out.print(p + " ");
		}

		sc.close();
	}

	public static void main(String[] args) {
		rearrange();
	}
}