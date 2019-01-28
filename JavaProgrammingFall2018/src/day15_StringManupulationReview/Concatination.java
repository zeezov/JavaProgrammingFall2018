package day15_StringManupulationReview;

import java.util.Scanner;

public class Concatination {
	public static void main(String[] args) {

		/*
		 * 1.Ask user to enter two words. Then add them together and print.
		 * Input:oneeight Output: oneeight
		 * 
		 * 2.Ask user to enter two words. Then add them together and print. But if the
		 * last letter of the first word and the first letter of the last word is the
		 * same, print that character once. Input: oneeight Output: oneight
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter first word");
		String frst = input.nextLine();

		System.out.println("Please enter second word");
		String scnd = input.nextLine();

		int length = frst.length();
		System.out.println(length);

		char last = frst.charAt(length - 1); // last char of first word

		System.out.println("last letter of the first word: " + last);

		char first = scnd.charAt(0); // first char of second word

		System.out.println("first letter of the second word: " + first);

		// compare if chars are equal
		if (last == first) {
			// print all of the words + socond word without first letter
			System.out.println(frst + scnd.substring(1));
		} else {
			System.out.println(frst.concat(scnd));
		}

		input.close();

	}

}
