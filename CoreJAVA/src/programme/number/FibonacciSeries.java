package programme.number;

public class FibonacciSeries {

	public static void findFibonacci(int max) throws InterruptedException {
		int p = 0;
		int n = 1;

		for (int sum = 0; sum < max; sum = p + n) {
			System.out.print(sum + " ");
			p = n;
			n = sum;
			Thread.sleep(300);
		}
	}

	public static void main(String[] args) {
		try {
			findFibonacci(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}