package programme.number;

import java.util.Arrays;

public class Combination {

	public static void main(String[] args) {

		String[] arr = { "a", "b", "c" };
		String temp = "";

		// swap first element
		System.out.println("Combination of Strings : " + Arrays.toString(arr));
		for (int i = 0; i <= arr.length - 1; i++) {
			temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			// swap 2nd & 3rd element
			for (int j = 1; j <= arr.length - 1; j++) {
				temp = arr[1];
				arr[1] = arr[j];
				arr[j] = temp;
				System.out.println(Arrays.toString(arr));
			}

			// backtrack changes
			int k = 1;
			temp = arr[k];
			arr[k] = arr[k + 1];
			arr[k + 1] = temp;

		}
	}
}