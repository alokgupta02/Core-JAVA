package programme.string;

import java.util.Arrays;

public class checkAnagram {

	public static void anagramCheck(String s1, String s2) {

		String str1 = s1.toLowerCase();
		String str2 = s2.toLowerCase();

		if (str1.length() != str2.length()) {
			System.out.println("Lenghts are not matching");
		} else {

			char[] arr1 = str1.toCharArray();
			char[] arr2 = str2.toCharArray();

			Arrays.sort(arr1);
			Arrays.sort(arr2);

			if (Arrays.equals(arr1, arr2)) {
				System.out.println("String are Anagram");
			} else {
				System.out.println("String are not Anagram");
			}
		}
	}

	public static void main(String[] args) {

		String s1 = "asasasasasa";
		String s2 = "asasasayssa";

		anagramCheck(s1, s2);

	}

}
