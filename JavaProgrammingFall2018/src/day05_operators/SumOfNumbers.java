package day05_operators;

import java.util.Scanner;

public class SumOfNumbers {
	public static void main(String[] args) {
		/*
		 * Write a programm that asks user to enter 3 numbers from keyboard
		 * and calculates the sum of those numbers then whow result
		 *
		 */
		Scanner scan = new Scanner(System.in);
			System.out.println("Please enter your first numbers");
				int number1 = scan.nextInt();
			
			System.out.println("Please enter your second numbers");
				int number2 = scan.nextInt();
			
			System.out.println("Please enter your third numbers");
				int number3 = scan.nextInt();
			
			int grandTotal = number1 + number2 + number3;
			
			System.out.println("Your total is $" + grandTotal);
			
	scan.close();


		
		
	}

}
