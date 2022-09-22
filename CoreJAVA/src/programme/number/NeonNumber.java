package programme.number;

public class NeonNumber {

	public static void findNeon(int min, int max) {

		System.out.print("Neon numbers between " + min + " and " + max + " are : ");

		for (int a = min; a < max; a++) {
			if (isNeonNumber(a))
				System.out.print(a + " ");
		}
	}

	public static boolean isNeonNumber(int num) {
		int sqNum = num * num;
		int sum = 0;
		int temp = 0;

		do {
			temp = sqNum % 10;
			sum += temp;
			sqNum = sqNum / 10;
		} while (sqNum > 0);

		if (sum == num)
			return true;
		// System.out.println("Yes, " + num + " is a Neon Number");
		else {
			return false;
			// System.out.println("No, " + num + " is not a Neon Number");
		}
	}

	public static void main(String[] args) {
		// isNeonNumber(8);
		findNeon(0, 999000000);
	}
}
