package assignments;

import java.util.Scanner;

public class DaysInMonth {
	public static void main(String[] args) {

		/*
		 * Write a Java program to find the number of days in a month.
		 * 
		 * Assume February has 29 days.
		 * 
		 * Input: Input a month number: 2
		 * 
		 * Output : February has 29 days
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter number of the month");
		int num = input.nextInt();
		input.close();
		
//		if (num < 1 || num > 12) {
//			System.out.println("Incorrect entry. Please enter numbers between 1-12");
//		}
		
		switch (num) {
		case 1:
			System.out.println("It is January and it has 31 days");
			break;
		case 2:
			System.out.println("It is February and it has 29 day");
			break;
		case 3:
			System.out.println("It is March and it has 31 days");
			break;
		case 4:
			System.out.println("It is April and it has 30 days");
			break;
		case 5:
			System.out.println("It is May and it has 31 days");
			break;
		case 6:
			System.out.println("It is June and it has 30 days");
			break;
		case 7:
			System.out.println("It is July and it has 31 days");
			break;
		case 8:
			System.out.println("It is August and it has 31 days");
			break;
		case 9:
			System.out.println("It is September and it has 30 days");
			break;
		case 10:
			System.out.println("It is October and it has 31 days");
			break;
		case 11:
			System.out.println("It is Noverber and it has 30 days");
			break;
		case 12:
			System.out.println("It is December and it has 31 days");
			break;
		default:
			System.out.println("Incorrect entry. Please enter numbers between 1-12");

		}

	}

}
