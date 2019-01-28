package day32_MethodWithReturn01;

import java.util.*;

public class GuessTheNumber {
	public static void main(String[] args) {
		
		playGuessNumCompOnly();
		playGuessNumWithNum(5);
	}
	
	// PlayGuessNumCompOnly()
	// PlayGuessNumWithLimit(int limit)
	// PlayGuessNumCompVSMe(int secretNum)
	
	public static void playGuessNumCompOnly() {
		Random random = new Random();
		int secretNumber = random.nextInt(21);
		
		int counter = 0;
		
		do {
			counter++;
			System.out.println("Guess the secret number: ");
			int guessNumber = random.nextInt(21);
			System.out.println("Guessed number : " + guessNumber + " Tries: " + counter);
			// check if secret number matches guessNumber
			if (guessNumber == secretNumber) {
				System.out.println("You won! Guessed the Secrtet Number! Secret number was " + secretNumber);
				break;
			} else {
				System.out.println("Wrong! Try again.");
			}
			
		} while (true);
		
		System.out.println();
		System.out.println("============================================================");
		System.out.println();
	}
	
	
	public static void playGuessNumWithNum(int limit) {
		
		Random random = new Random();
		int secretNumber = random.nextInt(21);
		
		int counter = 0;
		
		do {
			counter++;
			System.out.println("Guess the secret number: ");
			int guessNumber = random.nextInt(21);
			System.out.println("Guessed number : " + guessNumber + " Tries: " + counter);
			// check if secret number matches guessNumber
			if (guessNumber == secretNumber) {
				System.out.println("You won! Guessed the Secrtet Number! Secret number was " + secretNumber);
				break;
			} else {
				System.out.println("Wrong! Try again.");
			}
			
			if (limit == counter) {
				System.out.println("You lost");
				break;
			}
			
		} while (true);
	}
	

}
