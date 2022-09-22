package programme.string;

public class CheckPalindrome {

	// method 1
	public static void checkPalindrome(String string1) {

		char ch = 'a';
		String string2 = "";

		for (int i = string1.length() - 1; i >= 0; i--) {
			ch = string1.charAt(i);
			string2 += ch;
		}

		if (string1.equalsIgnoreCase(string2))
			System.out.println("Strings are Palindrome");
		else {
			System.out.println("String are not Palindrome");
		}

	}

	public static void main(String[] args) {

		String string1 = "sammas";
		boolean flag = true;

		// checkPalindrome(string1);

		// method 2
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

}
