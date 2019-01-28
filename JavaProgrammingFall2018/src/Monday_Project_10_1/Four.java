package Monday_Project_10_1;

public class Four {
	public static void main(String[] args) {

		/*
		 * 4.Write for and while loops so that they print the square of each odd number
		 * from numbers between 1 and 20.
		 * 
		 * Expected Output: 1 9 25 49 81 121 169 225 289 361
		 */
		
		//while loop
		int num = 1;
		
		while (num <= 20) {
			if (num % 2 != 0) {
				System.out.print(num * num + " ");
			}
			num++;
		}
		
		System.out.println(" ");
		System.out.println("=========================");
		
		//for loop
		for (int i = 1; i <= 20; i++) {
			if (i % 2 != 0) {
			System.out.print(i * i + " ");
			}
		}
		
		
		
		
	}

}
