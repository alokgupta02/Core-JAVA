package searching;

public class LinearSearch {

	public static void linearSearch(int a[], int key) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key)
				System.out.println(key + " is found at index " + i);
		}

	}

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40, 50 };
		int key = 50;

		linearSearch(a, key);

	}

}
