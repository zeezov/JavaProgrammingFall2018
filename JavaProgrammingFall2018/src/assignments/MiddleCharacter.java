package assignments;

import java.util.Scanner;

public class MiddleCharacter {
	public static void main(String[] args) {

		/*
		 * Write a Java method to display the middle character of a string. Go to the
		 * editor a) If the length of the string is even there will be two middle
		 * characters. b) If the length of the string is odd there will be one middle
		 * character.
		 * 
		 * Input: Input a string: elephant Output:
		 * 
		 * The middle character in the string: ph
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a word");
		String word = input.next();
		input.close();
		
		int word1 = word.length();
		
		if (word1 % 2== 1) {
			int mid = word1 / 2;
			System.out.println(word.charAt(mid));
		} else if (word1 % 2 == 0) {
			int mid1 = word1 / 2;
			System.out.println(word.substring(mid1 - 1, mid1 + 1));
		}
		
	}

}
