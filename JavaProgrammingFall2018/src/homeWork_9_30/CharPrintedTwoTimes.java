package homeWork_9_30;

import java.util.Scanner;

public class CharPrintedTwoTimes {
	public static void main(String[] args) {
		
		/*
		 * Write a Java program which accepts a string from use and print the string
		 * such that each character in the string is printed two times.
		 */
		
		Scanner input = new Scanner(System.in);
			System.out.println("Please enter a word");
			String word = input.next();
			input.close();
			
		String result = "";
			
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			result = result + c + c;//why i cant use short hand operator here
		}
		
		System.out.println(result);
		
	}

}
