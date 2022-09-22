package programme.array;

public class CopyArray {

	// Program to copy all elements of one array into another array

	public static void copyIntArray(int value[]) {
		int copy[] = new int[value.length];

		for (int i = 0; i < value.length; i++) {
			copy[i] = value[i];
		}

		System.out.print("Values in Array[] : ");
		for (int a = 0; a < value.length; a++) {
			System.out.print(value[a] + ", ");
		}

		System.out.print("\nValues in Copy[]  : ");
		for (int a = 0; a < copy.length; a++) {
			System.out.print(copy[a] + ", ");
		}
	}

	public static void copyStringArray(String value[]) {

		String copy[] = new String[value.length];

		for (int i = 0; i < value.length; i++) {
			copy[i] = value[i];
		}

		System.out.print("\nValues in Array[] : ");
		for (int a = 0; a < value.length; a++) {
			System.out.print(value[a] + ", ");
		}

		System.out.print("\nValues in Copy[]  : ");
		for (int a = 0; a < copy.length; a++) {
			System.out.print(copy[a] + ", ");
		}
	}

	public static void main(String[] args) {
		int value[] = { 1, 4, 5, 4, 3, 26, 7, 8 };
		String str[] = { "abba", "ad", "efdd", "sds" };
		copyIntArray(value);
		copyStringArray(str);

	}

}
