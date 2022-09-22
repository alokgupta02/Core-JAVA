package programme.array;

import java.util.Arrays;

public class RotateLeftRight {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int n = 2;

		System.out.print("Before Rotation   : " + Arrays.toString(arr));

		rotateRight(arr, n);
		rotateLeft(arr, n);

	}

	private static void rotateRight(int[] arr, int n) {

		int arr_len = arr.length;
		int temp[] = new int[arr_len];
		int temp_count;
		int rightIncident = arr_len - n;

		// shift to the left
		for (temp_count = 0; rightIncident < arr_len; temp_count++) {
			temp[temp_count] = arr[rightIncident];
			rightIncident++;
		}

		// add to the last
		for (int x = 0; temp_count < arr_len; x++) {
			temp[temp_count] = arr[x];
			temp_count++;
		}

		System.out.print("\nRight Rotation    : " + Arrays.toString(temp));

	}

	private static void rotateLeft(int[] arr, int n) {

		int arr_len = arr.length;
		int temp[] = new int[arr_len];
		int temp_count;
		int leftIncident = n;

		// shift to the left
		for (temp_count = 0; leftIncident < arr_len; temp_count++) {
			temp[temp_count] = arr[leftIncident];
			leftIncident++;
		}

		// add to the last
		for (int x = 0; temp_count < arr_len; x++) {
			temp[temp_count] = arr[x];
			temp_count++;
		}

		System.out.print("\nLeft Rotation     : " + Arrays.toString(temp));

	}
}