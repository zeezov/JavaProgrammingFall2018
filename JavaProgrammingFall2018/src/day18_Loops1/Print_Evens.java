package day18_Loops1;

public class Print_Evens {
	public static void main(String[] args) {
		
		/* 
		 * Using if condition within while loop;
		 * start variable nuber with 1 and loop until 100
		 * check if number is even
		 * if it is even print the number
		 * 
		 */
		
		int number = 1;
		
		while (number <= 100) {
			if (number % 2 == 0) {
				System.out.println(number);
			}
			number++;
		}
		
	}

}
