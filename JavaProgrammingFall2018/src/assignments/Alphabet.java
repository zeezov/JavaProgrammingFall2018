package assignments;

import java.util.Scanner;


public class Alphabet {
	public static void main(String[] args) {

		/*
		 * Write a Java program that takes the user to provide a single character from
		 * the alphabet. Print Vowel or Consonant, depending on the user input. If the
		 * user input is not a letter (between a and z or A and Z), or is a string of
		 * length > 1, print an error message.
		 * 
		 * Input: Input an alphabet: b 
		 * Output : Input letter is Consonant
		 */
		
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter a letter");
		String letter = input.next().toLowerCase();
		input.close();
				
		if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")) { 
			System.out.println("Vowel");
		} else if (letter.length() > 1) {
			System.out.println("Error");
		} else {
			System.out.println("Consonant");
		}
		
		// aksjflksjfldsfjdslfdjks
		
		
	}

}
