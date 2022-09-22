package sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		int array[] = { 12, 5, 75, 33, 31, 66, 3 };

		System.out.println("*********** INSERTION SORT ***********");
		System.out.print("Value in Array  : " + Arrays.toString(array));

		for (int j = 1; j < array.length; j++) {
			int key = array[j];
			int i = j - 1;
			while ((i > -1) && (array[i] > key)) {
				array[i + 1] = array[i];
				i--;
			}
			array[i + 1] = key;

		}
		System.out.print("\nAscending Sort  : " + Arrays.toString(array));

	}
}
