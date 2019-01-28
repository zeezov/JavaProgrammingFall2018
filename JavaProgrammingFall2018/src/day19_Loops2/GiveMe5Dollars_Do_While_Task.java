package day19_Loops2;

import java.util.Scanner;

public class GiveMe5Dollars_Do_While_Task {
	public static void main(String[] args) {

		/*
		 * Ask for $5 and keep asking for $5 untilyou get it or user enters it
		 */

		Scanner input = new Scanner(System.in);

		Integer amount = 0;
		Integer tries = 3; // it should give chance to give $5 max 3 times

		do {
			System.out.println("Give me $5");
			amount = input.nextInt();
			tries--;
			System.out.println("Number of tries left: " + tries);
			if (tries == 0) {
				break;
			}
		} while (amount != 5);

		if (amount == 5) {

			System.out.println("Thank you!");
		} else if (tries == 0) {

			System.out.println("You are out of tries!");

		}
		
		input.close();
	}
}
