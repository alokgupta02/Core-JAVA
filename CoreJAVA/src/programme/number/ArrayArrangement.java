package programme.number;

import java.util.Scanner;

// arrange odd even number alternatively 
public class ArrayArrangement {
	public static int size;
	public static int arr[] = { 21, 0, 651, 441, 31, 551 };

	public static int even[] = new int[5];
	public static int odd[] = new int[5];
	public static int evenCount, oddCount = 0;

	public static void arrangeArray() {

		size = arr.length;
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * // Take the size of the array from user
		 * System.out.print("Enter the size of the array : "); size = sc.nextInt(); arr
		 * = new int[size]; System.out.println("Size of the Array is : " + size);
		 * 
		 * // set size //arr = new int[size];4
		 * 
		 * //odd = new int[size]; //even = new int[size];
		 * 
		 * // Take values from user for (int m = 0; m < size; m++) {
		 * System.out.print("Enter the number : "); int a = sc.nextInt(); arr[m] = a; }
		 */

		// print the values entered
		System.out.print("Values in array BEFORE arranging : ");
		for (int a : arr) {
			System.out.print(" " + a);
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i]== 0) {
				System.out.println("\n"+ i + arr[i]);
			} else {
				if (arr[i] % 2 == 0) {
					even[evenCount] = arr[i];
					evenCount++;
				} else {
					odd[oddCount] = arr[i];
					oddCount++;
				}
			}
		}

		oddCount = 0;
		evenCount = 0;

		System.out.print("\n" + "ODD : ");
		for (int c : odd) {
			System.out.print(" " + c);
		}

		System.out.print("\n" + "EVEN : ");
		for (int b : even) {
			System.out.print(" " + b);
		}

		for (int n = 0; n <= arr.length; n++) {
			if (n % 2 == 0) {

				if (odd[oddCount] == 0) {
					System.out.println("ZERO DETECTED!");
					if (arr.length == size) {
						break;
					}
					arr[n] = even[evenCount];
					System.out.println("--------------------" + arr[n]);
					evenCount++;
				} else {
					arr[n] = odd[oddCount];
					System.out.println("+++++++++++++++++++++++++" + arr[n]);

				}
				oddCount++;
			} else {
				arr[n] = even[evenCount];
				System.out.println("--------------------" + arr[n]);
				evenCount++;

			}
		}

		/*
		 * for (int n = 0; n <= arr.length; n++) { if (n % 2 == 0) {
		 * 
		 * if (odd[oddCount] == 0) { System.out.println("ZERO DETECTED!"); if
		 * (arr.length == size) { break; } arr[n] = even[evenCount];
		 * System.out.println("--------------------" + arr[n]); evenCount++; } else {
		 * arr[n] = odd[oddCount]; System.out.println("+++++++++++++++++++++++++" +
		 * arr[n]);
		 * 
		 * } oddCount++; } else { arr[n] = even[evenCount];
		 * System.out.println("--------------------" + arr[n]); evenCount++;
		 * 
		 * } }
		 */

		System.out.print("\n" + "Values in array AFTER arranging : ");
		for (int d : arr) {
			System.out.print(" " + d);
		}

	}

	public static void main(String[] args) {
		arrangeArray();
	}

}
