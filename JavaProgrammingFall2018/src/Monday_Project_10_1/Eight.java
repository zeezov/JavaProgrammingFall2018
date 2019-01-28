package Monday_Project_10_1;

public class Eight {
	public static void main(String[] args) {

		/*
		 * 8.Write for and while loops so that they go through the odd integers (from 1
		 * to 19), keeping track of the sum of these integers at each stage, and
		 * printing the sum at each stage.
		 * 
		 * Expected Output: 1 4 9 16 25 36 49 64 81 100
		 */

		// while loop
		int num = 1;
		int sum = 0;

		while (num <= 19) {
			if (num % 2 == 1) {
				sum += num;
				System.out.print(sum + " ");
			}
			num++;
		}
		
		System.out.println(" ");
		System.out.println("=========================");

		// for loop
		
		int sum2 = 0;
		
		for (int i = 1; i <= 19; i++) {
			if (i % 2 == 1) {
				sum2 += i;
				System.out.print(sum2 + " ");
			}
		}

	}

}
