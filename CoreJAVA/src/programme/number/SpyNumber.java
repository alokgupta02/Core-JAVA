package programme.number;

public class SpyNumber {

	public static void findSpyNumber(int min, int max) {
		System.out.print("Spy Numbers between " + min + " and " + max + " are : ");
		for (int i = min; i <= max; i++) {
			if (isSpyNumber(i))
				System.out.print(" " + i);
		}
	}

	public static boolean isSpyNumber(int num) {

		int temp;
		int sum = 0;
		int product = 1;

		do {
			temp = num % 10;
			num = num / 10;
			sum += temp;
			product *= temp;

		} while (num > 0);

		if (sum == product)
			return true;
		// System.out.println("Given Number is a Spy Number");

		else {
			return false;
			// System.out.println("Given Number is not a Spy Number");
		}

		// return true;

	}

	public static void main(String[] args) {

		// isSpyNumber(412);
		findSpyNumber(1, 500);

	}

}
