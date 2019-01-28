package day21_Loops4;

import java.util.Scanner;

public class WarmUp2 {
	public static void main(String[] args) {
		
		/*
		 * 2. Accept a String and a character. Find out how many times that character
		 * appears in the string.
		 * Enter word:
		 * java
		 * Enter character:
		 * a
		 * 2
		 */
		
		Scanner input = new Scanner(System.in);
		 System.out.println("Please enter a word");
		 String word = input.next().toLowerCase();
		 //word = word.toLowerCase();
		 
		 System.out.println("Please enter single charecter");
		 char ch = input.next().toLowerCase().charAt(0);
		 
		 
		 int counter = 0;
		 input.close();
		 
		 for (int i = 0; i < word.length(); i++) {
			 //System.out.println(word.charAt(i));
		 if (word.charAt(i) == ch) {
			 counter++;
		 }
		 
		}
		 
		 System.out.println(counter);
	}

}
