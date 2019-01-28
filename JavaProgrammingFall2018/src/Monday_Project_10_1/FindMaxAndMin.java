package Monday_Project_10_1;

import java.util.Scanner;

public class FindMaxAndMin {
	public static void main(String[] args) {

		/*
		 * Write a program that prompts user to enter the numbers till the user wants
		 * (by asking if user wants to continue) and at the end the program should
		 * display the largest and smallest numbers entered. 
		 * Example
		 * 1: Enter the number
		 * 8 Do you want to continue y/n? n
		 *  Largest number: 8 Smallest number: 8
		 */

		Scanner input = new Scanner(System.in);

		int max = 9999999, min = 999999, num = 1;
		String ask = "";

		while (true) {

			System.out.println("Please enter number: ");
			num = input.nextInt();
			System.out.println("Do you want to continue? Yes / No");
			ask = input.next().toLowerCase();
			while (!(ask.equals("yes") || ask.equals("no"))) {
				System.out.println("Wrong Input. Please re enter Yes / No");
				ask = input.next().toLowerCase();
			}
			if (max == 0 && num > 0) {
				min = num;
			}
			if (num < min) {
				min = num;
			}
			if (num > min) {
				max = num;
			}
			if (ask.equals("no")) {
				break;
			}

		}

		System.out.println("Largest Number: " + max);
		System.out.println("Smallest Number: " + min);

		input.close();

	}

}
