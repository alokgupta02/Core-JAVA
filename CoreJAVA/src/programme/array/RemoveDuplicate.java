package programme.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	/*
	 * remove duplicate from Array
	 * 
	 * input = {1,2,3,2,1} output = {1,2,3}
	 * 
	 * 
	 */

	// Method 1 : Removing duplicates from a sorted array

	public static void removeDuplicate(Integer arr[]) {

		Arrays.sort(arr);

		System.out.print("\nSorted Values   : " + Arrays.toString(arr));

		Integer temp[] = new Integer[arr.length];
		int j = 0;

		System.out.println();

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[arr.length - 1];
		System.out.print("After Removal   : " + Arrays.toString(temp));
	}

	// Method 2 : Remove duplicates from array using LinkedHashSet

	public static void removeDuplicate1(Integer arr[]) {
		Set<Integer> s1 = new HashSet<Integer>();
		for (int a : arr) {
			s1.add(a);
		}
		System.out.println("\nAfter Removal   : " + Arrays.toString(s1.toArray()));
	}

	public static void main(String[] args) {

		Integer arr[] = { 1, 3, 2, 3, 2, 1, 1 };

		System.out.print("Original Values : " + Arrays.toString(arr));

		// removeDuplicate(arr);
		// removeDuplicate1(arr);

		// Method 3 : Removing duplicates using Streams

		List<Integer> myList = Arrays.asList(arr).stream().distinct().collect(Collectors.toList());
		System.out.println("\nAfter Removal   : " + myList);

	}
}
