package programme.string;

public class CountCharacters {

	public static void count(String str) {

		System.out.println("String : " + str);
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ')
				count++;
		}

		System.out.println("Character Contains " + count);
	}

	public static void main(String[] args) {

		String str = "Die Another Day";

		count(str);

	}

}
