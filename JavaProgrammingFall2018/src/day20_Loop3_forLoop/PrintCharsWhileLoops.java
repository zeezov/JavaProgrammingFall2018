package day20_Loop3_forLoop;

import java.util.Scanner;

public class PrintCharsWhileLoops {
	public static void main(String[] args) {

		/*
		 * 
		 * 2. Write a program that accepts a String word
		 * 
		 * and using while loop and charAt print each char in separate line.
		 * 
		 * Ex: Enter word:
		 *
		 * Pen
		 * 
		 * P
		 * 
		 * e
		 * 
		 * n
		 * 
		 */
		
		Scanner input = new Scanner (System.in);
			System.out.println("Enter a word");
		String word = input.next();
		
		int index = 0;
		
		while (index < word.length()) {
			System.out.println(word.charAt(index++));
			//index++;
		}
		//TODO : rewrite the code using substring method
		
	}

}
