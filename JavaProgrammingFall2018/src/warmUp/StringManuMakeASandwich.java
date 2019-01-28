package warmUp;

import java.util.Scanner;

public class StringManuMakeASandwich {
	public static void main(String[] args) {
		
		/*
		 * Make a sandwich
		 * Ask user to enter two words. 
		 * If the first word has even number of characters, 
		 * print the first half of the first word, 
		 * print the second word and print the second half of the first word.
		 * Input: banana apple
		 * Output: banappleana
		 */
		
		Scanner input = new Scanner(System.in);
			System.out.println("Please enter 2 words");
			String w1 = input.nextLine();
			String w2 = input.nextLine();
			input.close();
			
		int word1 = w1.length();
		
		if (word1 % 2 == 1) {
			
		System.out.println(w1.substring(word1 / 2));
		}
		
			
		
			
	}

}
