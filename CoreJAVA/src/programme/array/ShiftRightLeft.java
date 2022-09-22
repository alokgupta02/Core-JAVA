package programme.array;

import java.util.Arrays;

public class ShiftRightLeft {

	public static void main(String[] args) {

		int arrRight[] = { 1, 2, 4, 5, 6, 0 };
		int arrLeft[] = { 0, 1, 2, 4, 5, 6 };
		int pos = 2;
		int val = 3;

		shiftRight(arrRight, pos, val);
		shiftLeft(arrLeft, pos, val);

	}

	private static void shiftRight(int[] arrRight, int pos, int val) {

		System.out.print("Before Shift   : " + Arrays.toString(arrRight));

		for (int i = arrRight.length - 1; i >= pos; i--) {
			if (i == pos) {
				arrRight[i] = val;
			} else {
				arrRight[i] = arrRight[i - 1];
			}
		}

		System.out.print("\nRight Shift    : " + Arrays.toString(arrRight));
	}

	private static void shiftLeft(int[] arrLeft, int pos, int val) {

		System.out.print("\nBefore Shift   : " + Arrays.toString(arrLeft));

		for (int i = 0; i <= pos; i++) {
			if (i == pos) {
				arrLeft[i] = val;
			} else {
				arrLeft[i] = arrLeft[i + 1];
			}
		}

		System.out.print("\nLeft Shift     : " + Arrays.toString(arrLeft));
	}

}
