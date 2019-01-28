package Monday_Project_10_1;

public class Seven {
	public static void main(String[] args) {

		/*
		 * 7.Write for and while loops so that they add up the even numbers between 1
		 * and 20 and prints it
		 * 
		 * Expected Output: 110
		 */
		
		// While Loop
		
		int num = 1;
		int sum = 0;

		while (num <= 20) {
			if(num % 2 == 0) {
				sum = sum + num;
				//System.out.print(sum);
			}
			num++;
		}
		System.out.println(sum);
			
		System.out.println("=========================");

		// for loop
		
		int sum2 = 0;
		
		for (int i = 1; i <= 20; i++) {
			if(i % 2 == 0) {
			sum2 += i;
		}
	}
		System.out.print(sum2);
		
	}

}
