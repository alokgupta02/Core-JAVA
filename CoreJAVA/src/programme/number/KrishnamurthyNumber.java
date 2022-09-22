package programme.number;

/*A number is said to be Krishnamurthy Number 
 * if the sum of factorials of each digit is 
 * equal to the sum of the number itself.*/

public class KrishnamurthyNumber {

	static void findKrishnamurthy(int min, int max) {
		System.out.println("Krishnamurthy Number between " + min + " and " + max + " are : ");
		for (int a = 0; a < max; a++) {
			if (isKrishnamurthyNumber(a))
				System.out.print(a + " ");
		}
	}

	static boolean isKrishnamurthyNumber(int num) {
		int sum = 0, last = 0;
		int temp = num;
		do {
			last = temp % 10;
			sum += factor(last);
			temp = temp / 10;
		} while (temp > 0);

		if (sum == num)
			return true;
		// System.out.println("YES !");
		else {
			return false;
			// System.out.println("NO !");
		}

	}

	private static int factor(int last) {
		int sum = 1;

		for (int i = 0; i < last; i++) {
			sum += sum * i;
		}
		return sum;
	}

	public static void main(String[] args) {
		// isKrishnamurthyNumber(14);
		findKrishnamurthy(1, 50000);

	}

}
