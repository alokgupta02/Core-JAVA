package programme.array;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountFrequency {

	public static void countFrequency(int arr[]) {
		System.out.print("Array Values : " + Arrays.toString(arr) + "\n");

		LinkedHashMap<Integer, Integer> countFreq = new LinkedHashMap<Integer, Integer>();

		for (int i : arr) {
			if (countFreq.containsKey(i)) {
				countFreq.put(i, countFreq.get(i) + 1);
			} else {
				countFreq.put(i, 1);
			}
		}

		for (Map.Entry<Integer, Integer> m : countFreq.entrySet()) {
			System.out.println(m.getKey() + "     |     " + m.getValue());
		}

	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 1, 5 };

		countFrequency(a);
	}
}