package Monday_Project_10_1;

public class Two {
	public static void main(String[] args) {

		/*
		 * 2.Write for and while loops so that they print only the even numbers between
		 * 1 and 20.
		 * 
		 * Expected Output: 2 4 6 8 10 12 14 16 18 20
		 */

		//while loop
		int num = 1;

		while (num <= 20) {
			if (num % 2 == 0) {
			System.out.print(num + " ");
			}
			num++;
		}
		System.out.println(" ");
		System.out.println("=========================");

		// for loop
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
			System.out.print(i + " ");
			}
		}

	}

}
