package programme.number;

public class PalindromeNumber {
	/*
	 * A palindrome number is a number that is same after reverse. For example 545,
	 * 151, 34543, 343, 171, 48984.
	 */

	public static void findPalindromeNumber(int min, int max) {
		System.out.println("Palindrome numbers between " + min + " and " + max + " are : ");
		for (int i = min; i <= max; i++) {
			if (isPalindrome(i))
				System.out.print(i + " ");
		}
	}

	public static boolean isPalindrome(int num) {
		int temp = num;
		int number;
		int reverse = 0;
		do {
			number = temp % 10;
			temp = temp / 10;
			reverse = reverse * 10 + number;

		} while (temp > 0);

		if (reverse == num)
			return true;
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		// isPalindrome(545);
		findPalindromeNumber(10, 500);

	}

}
