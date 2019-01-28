package day20_Loop3_forLoop;

import java.util.Random;
import java.util.Scanner;

public class GuessANumber3_LimitedTries {
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
			
			//only 5 chances to guess
			int iTries = 5;
			
			do {
				System.out.println("Guess the number");
				guessedNumber = input.nextInt();
				iTries--;
				if (guessedNumber == secretNumber) {
					System.out.println("Congrats! You got it");
				} else if (guessedNumber > secretNumber) {
					System.out.println("Less: \n# of tries " + iTries);
				} else {
					System.out.println("More: \n# of tries " + iTries);
				}
				
				if (iTries == 0) {
					System.out.println("You lost");
					System.out.println("Secret number is " + secretNumber);//to show random numer
					break;
				}
				
			} while (secretNumber != guessedNumber && iTries <= 5);
			
	}

}
