package warmUp;

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
		
		int w1 = word.length();
		System.out.println(w1);
		
		int mid = w1 / 2;
		
		if (w1 % 2 == 1 && w1 >= 3) {
			
			System.out.println(word.charAt(mid));
		} else {
			System.out.println("Invalid. Your word has to be odd and more than 3");
		}
		
		input.close();
	}

}
