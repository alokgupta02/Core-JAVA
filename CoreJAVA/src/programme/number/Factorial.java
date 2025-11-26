package programme.number;

public class Factorial {

	static int r = 1;

	public static void factorial(int n) {

		for (int i = 1; i <= n; i++) {
			r = r * i;
			System.out.println(r);

		}
		System.out.println(r);
	}

	public static void main(String[] args) {
		factorial(5);
	}
}
