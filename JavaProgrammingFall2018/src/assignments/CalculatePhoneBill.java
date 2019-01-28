package assignments;

import java.util.Scanner;

public class CalculatePhoneBill {
	public static void main(String[] args) {

		/*
		 * Level: Easy/Med
		 * 
		 * 
		 * Write a Java program CalculatePhoneBill to calculate the monthly telephone
		 * bills as per the following rule: Ask user to enter number of calls. Minimum
		 * $200 for up to 100 calls. Plus $0.60 per call for next 50 calls. Plus $0.50
		 * per call for next 50 calls. Plus $0.40 per call for any call beyond 200
		 * calls.
		 * 
		 * Examples: Enter number of calls: 88 Your bill is $200.0
		 * 
		 * Enter number of calls: 120 Your bill is $212.0
		 * 
		 * Enter number of calls: 185 Your bills is $247.5
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter number of calls");
		int numCalls = input.nextInt();

		double phoneBill = 0;

		if (numCalls <= 100) {
			phoneBill = 200;
		} else if (numCalls > 100 && numCalls <= 150) {
			phoneBill = (numCalls - 100) * 0.6 + 200;
		} else if (numCalls > 150 && numCalls <= 200) {
			phoneBill = (numCalls - 150) * 0.5 + 230;
		} else if (numCalls > 200) {
			phoneBill = (numCalls - 200) * 0.4 + 255;
		}

		System.out.println("Your bill for this month is: " + phoneBill);

		input.close();

	}

}
