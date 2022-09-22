package programme.basic;

import java.util.Scanner;

/*take 5 subject marks from the user
return average and sum*/

/*validate
 only int allowed; no string or decimal value
 number cannot be greater then 100 or less then 0
 in case of wrong input, prompt again
 */

public class AverageMarks {
	static boolean pass;
	static int i = 1;
	static int sum = 0;
	static int number = 0;
	static double avg;

	static void checkNumber(String num) {

		if (num.matches("\\D*")) {
			pass = false;
			System.out.println("Type numeric value only!");
		} else {
			number = Integer.parseInt(num);
			if (number < 0 || number > 100) {
				pass = false;
				System.out.println("Number cannot be greater then 100 or less then 0. Try Again!");
			} else {
				pass = true;
				++i;
				sum += number; 
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		pass = true;

		if (pass) {
			do {
				System.out.print("Enter marks for subject " + i + " : ");
				String num = sc.next();
				checkNumber(num);
				//System.out.println("pass: " + pass);
				//System.out.println("attempt: "+i);

			} while (i <= 5);

		}

		System.out.println("Sum :" + sum);
		avg = sum / --i;

		System.out.println("Average: " + avg);
	}

}
