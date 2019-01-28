package Monday_Project_10_1;

public class Six {
	public static void main(String[] args) {

		/*
		 * 6.Write for and while loops so that they add numbers between 1 and 20 and
		 * display the sum
		 */

		// while loop
		int num = 0;
		int sum = 0;

		while (num < 20) {
			num++;
			sum = sum + num;
		}
		
		System.out.print(sum);
		
		System.out.println(" ");
		System.out.println("=========================");

		// for loop
		
		int sum2 = 0;
		
		for (int i = 1; i <= 20; i++) {
			sum2 += i;
		}
		System.out.print(sum2);

	}

}
