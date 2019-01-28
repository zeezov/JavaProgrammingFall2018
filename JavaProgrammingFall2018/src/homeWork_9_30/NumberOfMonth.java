package homeWork_9_30;

import java.util.Scanner;

public class NumberOfMonth {
	public static void main(String[] args) {
		
		/*
		 * Write a Java program which repeatedly ask the user to enter the nuber of the month (1 to 12)
		 * If the use enters an incorrect number, Program terminates
		 */
		
		Scanner input = new Scanner (System.in);
		int num = 0;
			
		do {
			System.out.println("Please enter number of the month");
			num = input.nextInt();
			
			
		} while (num > 0 && num <= 12); 
			
		if (num > 0 || num < 13) {
			System.out.println("You entered incorect number");
		}
		
		input.close();
		
	}

}
