package programme.basic;

import java.util.HashSet;
import java.util.regex.Pattern;

// check if a string contains vowel
public class VowelFinder {

	public static int a, e, i, o, u = 0;

	public static void findVowel(String str) {
		HashSet<Character> nonvowelSet = new HashSet<Character>();
		HashSet<Character> vowelSet = new HashSet<Character>();

		if ((str.contains("a")) || (str.contains("e")) || (str.contains("i")) || (str.contains("o"))
				|| (str.contains("u"))) {

			System.out.println(str + " -> Word contains vowel");

			char[] charWord = str.toCharArray();

			for (char c : charWord) {
				switch (c) {
					case 'a' -> {
						a++;
						vowelSet.add(c);
						break;
					}
					case 'e' -> {
						e++;
						vowelSet.add(c);
						break;
					}
					case 'i' -> {
						i++;
						vowelSet.add(c);
						break;
					}
					case 'o' -> {
						o++;
						vowelSet.add(c);
						break;
					}
					case 'u' -> {
						u++;
						vowelSet.add(c);
						break;
					}
					default -> {
						if (Pattern.matches("[a-z]", "" + c)) {
							nonvowelSet.add(c);
						}
					}
				}
			}
			System.out.println("\n" + "vowel -> " + vowelSet + "\n");

			if (!(a == 0)) {
				System.out.println("a is repeated " + a + " times");
			}
			if (!(e == 0)) {
				System.out.println("e is repeated " + e + " times");
			}
			if (!(i == 0)) {
				System.out.println("i is repeated " + i + " times");
			}
			if (!(o == 0)) {
				System.out.println("o is repeated " + o + " times");
			}
			if (!(u == 0)) {
				System.out.println("u is repeated " + u + " times");
			}

			System.out.println("\n" + "non vowel -> " + nonvowelSet + "\n");

		} else {
			System.out.println(str + " -> Word doesnt contain vowel");
		}

	}

	public static void main(String[] args) {
		findVowel("hsasdlshlwasdsdsdwqewqerqwwaa");
	}

}