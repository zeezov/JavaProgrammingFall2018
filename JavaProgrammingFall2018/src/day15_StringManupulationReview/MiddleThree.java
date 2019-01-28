package day15_StringManupulationReview;

import java.util.Scanner;

public class MiddleThree {
	public static void main(String[] args) {
		/*
		 * 1.Ask user to enter a word. If the word has odd number of characters and has
		 * 5 or more characters, print the middle three characters of the word. 
		 * Input: fifteen Output: fte
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a word ");
		String word = input.nextLine();
		
		int w1 = word.length();
		System.out.println(w1);
		
		if(w1 % 2 == 1 && w1 >= 5) {
			
			int startIndex = (w1 - 3) / 2;
			int endIndex = (w1 + 3) / 2;
			System.out.println(word.substring(startIndex, endIndex));
		} else {
			System.out.println("Your code is not Odd and does not contain 5 or more characters");
		}
		
		input.close();
	}

}
