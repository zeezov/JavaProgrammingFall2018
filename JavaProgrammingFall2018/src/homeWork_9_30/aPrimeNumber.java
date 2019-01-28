package homeWork_9_30;

import java.util.Scanner;

public class aPrimeNumber {
	public static void main(String[] args) {
		
		/*
		 * Write a program which accepts a number from user and check if the number is prime or not
		 * A primce numbe is a number is divisiblae by itself and 1 only
		 */
		
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter a number");
		int num = input.nextInt();
		
		for (int i = 2; i < num; i++) {
			int remainder = num % i;
			if (remainder == 0) {
				System.out.println("Not Prime");
				System.out.println("It was divided by " + i);
				break;	
			} 
			
			
		}
	}

}
