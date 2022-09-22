package programme.array;

import java.util.Arrays;

public class LargestSmallestElement {

	public static void main(String[] args) {

		int arr[] = { 32, 45, 12, 35, 73, 66 };

		System.out.print("Value in Array  : " + Arrays.toString(arr));

		int max = arr[0];
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max)
				max = arr[i];

			if (arr[i] < min)
				min = arr[i];
		}
		System.out.println("\nLargest Number  : " + max);
		System.out.println("Smallest Number : " + min);
	}

}
