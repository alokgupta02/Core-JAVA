package programme.string;

public class DivideStrings {

	public static void main(String[] args) {

		String str = "abcdabcdabcd";
		String st = "";
		int n = 4;
		int first = 0;

		if (!(str.length() % n == 0)) {
			System.out.println("String is not divisible");
		} else {
			for (int last = n; last <= str.length(); last = last + n) {
				st = str.substring(first, last);
				System.out.println(st);
				first = first + n;
			}
		}
	}
}