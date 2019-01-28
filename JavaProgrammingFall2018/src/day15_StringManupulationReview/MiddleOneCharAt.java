package day15_StringManupulationReview;

import java.util.Scanner;

public class MiddleOneCharAt {
	public static void main(String[] args) {

		/*
		 * Middle one 1.Ask user to enter a word. If the word has odd number of
		 * characters and has 3 or more characters, print the character in the middle of
		 * the word. Input:eight Output: g Middle three
		 *  
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a word");
		String word = input.nextLine();

		// check if the word has odd number of characters.

		boolean isOdd = word.length() % 2 == 1;
		
		System.out.println("isOdd: " + isOdd);
		
		boolean has3orMore = word.length() >= 3;
		
		System.out.println("has 3 or more: " + has3orMore);
		
		if (isOdd && has3orMore) {
			//print the character in the middle of the word
			int length = word.length();
			System.out.println("length: " + length);
			int mid = length / 2;
			System.out.println("Mid letter: " + mid);//to see the number in the middle
			System.out.println(word.charAt(mid));//to see the actual letter in the middle
			
		}
		
		input.close();

	}

}
