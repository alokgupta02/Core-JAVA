package programme.array;

import java.util.Arrays;

public class SumOfElement {

	public static void main(String[] args) {

		int arr[] = { 32, 45, 12, 35, 73, 66 };

		System.out.print("Value in Array  : " + Arrays.toString(arr));

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {

			sum += arr[i];
		}

		System.out.println("\nSum : " + sum);

	}

}
