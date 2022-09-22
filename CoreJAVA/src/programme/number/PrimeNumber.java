package programme.number;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

	public static List<Integer> primeRange = new ArrayList<Integer>();

	// find prime numbers between the range
	public static void findPrimeNumber(int min, int max) {
		List<Integer> primeNum = null;
		for (int i = min; i <= max; i++) {
			primeNum = checkPrimeNumber(i);

		}
		System.out.println("Prime number between " + min + " and " + max + " is -> " + primeNum);
	}

	// find whether a single number is prime or not
	public static List<Integer> checkPrimeNumber(int number) {
		int n = number;
		boolean isPrime = false;

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				isPrime = true;
				break;
			}
		}

		if (!isPrime) {
			System.out.println(number + " is a prime number.");
			primeRange.add(n);
		}

		else {
			System.out.println(number + " is not a prime number.");
		}
		return primeRange;
	}

	public static void main(String[] args) {
		// checkPrimeNumber(30);
		findPrimeNumber(4, 14);
	}
}