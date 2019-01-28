package Monday_Project_10_1;

import java.util.Scanner;

public class Part2Two {
	public static void main(String[] args) {

		/*
		 * 2. Write a program to prompt the user to enter the numbers till the user
		 * wants (by asking user if he wants to continue) and at the end it should
		 * display the count of positive, negative and zeros entered.
		 */

		Scanner input = new Scanner(System.in);
		int positive = 0, negative = 0, zeros = 0;

		do {

			System.out.println("Please enter a number");
			int num = input.nextInt();
			System.out.println("Do you want to continue. Please type: Yes or No?");
			String answer = input.next().toLowerCase();
			while(!(answer.equals("yes")||answer.equals("no"))) {
                System.out.println("Wrong input,please re-enter \nwould you like to continue?");
                         answer=input.next().toLowerCase();
            }

			if (num > 0) {
				++positive;
			}
			if (num < 0) {
				++negative;
			}
			if (num == 0) {
				++zeros;
			}
			if (answer.equals("no") || answer.contains("n")) {
				break;
			} 
			
		} while (true);

		System.out.println("Positive number inputs: " + positive);
		System.out.println("Negative number inputs: " + negative);
		System.out.println("Number zero inputs: " + zeros);

		input.close();

	}

}
