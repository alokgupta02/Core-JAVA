package programme.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PrintDuplicate {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 2, 3, 3, 1, };
		Set<Integer> s1 = new HashSet<Integer>();

		System.out.print("Value in Array     : " + Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					s1.add(arr[j]);
				}
			}
		}
		System.out.println("\nDuplicate Elements : " + Arrays.toString(s1.toArray()));

	}

}
