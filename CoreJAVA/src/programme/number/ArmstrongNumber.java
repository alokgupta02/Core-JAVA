package programme.number;

public class ArmstrongNumber {

	public static void findArmstrongNumber(int min, int max) {
		System.out.println("Armstrong numbers between " + min + " and " + max + " are : ");
		for (int i = min; i <= max; i++) {
			if (isArmstrongNumber(i))
				System.out.print(i + " ");
		}
	}

	private static boolean isArmstrongNumber(int num) {
		int digit = 0, temp, last, sum = 0;
		temp = num;

		do {
			temp = temp / 10;
			digit++;
		} while (temp > 0);

		temp = num;
		do {
			last = temp % 10;
			temp = temp / 10;
			sum += (int) Math.pow(last, digit);
		} while (temp > 0);

		if (sum == num)
			return true;
		// System.out.println(num + " is a Armstrog Number");
		else {
			return false;
			// System.out.println(num + " is not a Armstrog Number");
		}
	}

	public static void main(String[] args) {
		// isArmstrongNumber(1634);
		findArmstrongNumber(12, 100000);
	}
}