package programme.number;

public class ReverseNumber {

	public static void reverseNumber(int number) {
		System.out.println("Original Numnber : " + number);
		int temp = number;
		int reverse = 0;

		do {
			temp = temp % 10;
			reverse = reverse * 10 + temp;
			number = number / 10;
			temp = number;
		} while (number > 0);
		System.out.println("Reverse Number   : " + reverse);
	}

	public static void main(String[] args) {
		//System("cls");
		reverseNumber(354163546);

	}

}
