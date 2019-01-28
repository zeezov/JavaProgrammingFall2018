package day21_Loops4;

import java.util.Scanner;

public class Neighbours {
	public static void main(String[] args) {
		
		/*
		 * String word and you need to check for same character side by side
		 * if found say "baap - " character
		 * 
		 * exp:
		 * 	abccddefg
		 * 
		 * 	cc Baap - c
		 *  dd Baap - d
		 * 
		 */
		
		//TODO Make it again with substring
		
		Scanner input = new Scanner(System.in);
			System.out.println("Please enter a word");
			String word = input.next();
			input.close();
		
		for (int i = 0; i < word.length()-1; i++) {
			if (word.charAt(i) == word.charAt(i+1)) {
				System.out.println("Beep - " + word.charAt(i));
				}
			}
		
		
		
	}

}
