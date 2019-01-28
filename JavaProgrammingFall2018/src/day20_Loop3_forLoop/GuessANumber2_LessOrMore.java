package day20_Loop3_forLoop;

import java.util.Random;
import java.util.Scanner;

public class GuessANumber2_LessOrMore {
	public static void main(String[] args) {
		
		/*
		 * Random is a class name
		 * The purpose of this class is to generate random numbers
		 */
		
		Scanner input = new Scanner (System.in);
		Random random = new Random();
			//System.out.println(random.nextInt(50));//will generate random numbers 0 to 49
			
			int secretNumber = random.nextInt(100);
			int guessedNumber;
			
			do {
				System.out.println("Guess the number");
				guessedNumber = input.nextInt();
				
				if (guessedNumber == secretNumber) {
					System.out.println("Congrats! You got it");
				} else if (guessedNumber > secretNumber) {
					System.out.println("Less");
				} else {
					System.out.println("More");
				}
				
			} while (secretNumber != guessedNumber);
			
	}

}
