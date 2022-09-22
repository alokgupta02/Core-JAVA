package sorting;

import java.util.Arrays;

/* Types of Sort
 * 
 * Selection sort.
 * Bubble sort.
 * Insertion sort.
 * Merge sort.
 * Quick sort.
 * Heap sort.
 * 
 * */

public class SelectionSort {

	public static void main(String[] args) {

		int arr[] = { 12, 5, 32, 35, 73, 66, 3 };
		int temp = 0;
		System.out.println("*********** SELECTION SORT ***********");
		System.out.print("Value in Array  : " + Arrays.toString(arr));

		// Aescending Order
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.print("\nAscending Sort  : " + Arrays.toString(arr));

		// Descending Order
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print("\nDescending Sort : " + Arrays.toString(arr));

	}

}
