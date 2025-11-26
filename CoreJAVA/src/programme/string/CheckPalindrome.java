package programme.string;

public class CheckPalindrome {

	public static void checkPalindrome(String string1) {
		boolean flag = true;
		for (int i = 0; i < string1.length() / 2; i++) {
			if (string1.charAt(i) != string1.charAt(string1.length() - i - 1)) {
				flag = false;
				break;
			}
		}

		if (flag)
			System.out.println("Given string is palindrome");
		else
			System.out.println("Given string is not a palindrome");

	}

	public static void main(String[] args) {
		String string1 = "sammas";
		checkPalindrome(string1);
	}

}
