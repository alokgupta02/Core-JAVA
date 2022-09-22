package programme.number;

public class SunnyNumber {

	public static void findSunnyNumber(int min, int max) {
		System.out.println("Sunny Number between " + min + " and " + max + " are : ");
		for (int a = min; a < max; a++) {
			if (isSunnyNumber(a))
				System.out.print(a + " ");
		}
	}

	private static boolean isSunnyNumber(int num) {
		double p;
		num = num + 1;
		p = Math.sqrt(num);
		if (p - Math.floor(p) == 0)
			return true;
		else
			return false;

	}

	public static void main(String[] args) {
		// isSunnyNumber(80);
		findSunnyNumber(1, 500);

	}

}
