package programme.number;

public class AutomorphicNumber {

	/*
	 * A number is called an automorphic number if and only if the square of the
	 * given number ends with the same number itself. For example, 25, 76 are
	 * automorphic numbers because their square is 625 and 5776, respectively and
	 * the last two digits of the square represent the number itself.
	 */

	public static void automorphicRange(double min, double max) {

		System.out.println("Automorphic numbers between " + min + " and " + max + " are : ");

		for (double i = min; i < max; i++) {
			if (isAutomorphic(i))
				System.out.print(i + ",");
		}
	}

	private static boolean isAutomorphic(double i) {

		double sqNum = i * i;

		if (String.valueOf(sqNum).endsWith(String.valueOf(i)))
			return true;
		// System.out.println("Yes! " + i + " is an Automorphic Number");
		else {
			return false;
			// System.out.println("No! " + i + " is not an Automorphic Number");
		}
	}

	public static void main(String[] args) {
		automorphicRange(1, 9000);
		// isAutomorphic(22);
	}
}