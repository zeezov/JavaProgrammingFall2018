package day20_Loop3_forLoop;

import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
	public static void main(String[] args) {
		
		/*
		 * Random is a class name
		 * The purpose of this class is to generate random numbers
		 */
		
		Scanner input = new Scanner (System.in);
		Random random = new Random();
			//System.out.println(random.nextInt(50));//will generate random numbers 0 to 49
			
			int secretNumber = random.nextInt(10);
			int guessedNumber;
			
			do {
				System.out.println("Guess the number");
				guessedNumber = input.nextInt();
				
				if (guessedNumber == secretNumber) {
					System.out.println("Congrats! You got it");
				} else {
					System.out.println("Try again");
				}
				
			} while (secretNumber != guessedNumber);
			
	}

}
