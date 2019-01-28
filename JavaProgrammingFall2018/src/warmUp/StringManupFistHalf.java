package warmUp;

import java.util.Scanner;

public class StringManupFistHalf {
	public static void main (String[] args) {
		
		/*
		 * First halfAsk user to enter a word. 
		 * If the first word has evennumber of characters, print the first half of the word.
		 * Input:banana
		 * Output: ban
		 */
		
		Scanner input = new Scanner (System.in);
			System.out.println("Please enter any word");
			String word = input.nextLine();
			input.close();
			
		System.out.println(word.substring(0,3));
		
		
		
	}

}
