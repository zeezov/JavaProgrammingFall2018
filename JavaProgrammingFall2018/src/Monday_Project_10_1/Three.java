package Monday_Project_10_1;

public class Three {
	public static void main(String[] args) {

		/*
		 * 3.Write for and while loops so that they print those numbers between 1 and 20
		 * and divisible by 3.
		 * 
		 * Expected Output: 3 6 9 12 15 18
		 */

		// while loop
		int num = 1;

		while (num <= 20) {
			if (num % 3 == 0) {
				System.out.print(num + " ");
			}
			num++;
		}
		System.out.println(" ");
		System.out.println("=========================");

		// for loop
		for (int i = 1; i <= 20; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}

	}

}
