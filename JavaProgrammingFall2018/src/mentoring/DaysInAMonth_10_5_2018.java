package mentoring;

import java.util.*;

public class DaysInAMonth_10_5_2018 {
	public static void main(String[] args) {

		/*
		 * Ask user to enter a number of the month ask user to enter the year
		 * 
		 * PRINT OUT: the month's name AND how many day it has
		 * 
		 * HINT: check for LEAP YEARS (years that has 29 days for February)
		 * 
		 * EXAMPLE: input number of month: 2 input year: 2016
		 * 
		 * EXPECTED OUTPUT: February of 2016 has 29 days
		 * 
		 */
		Scanner input = new Scanner(System.in);

		// ask for the month and the year numbers
		System.out.println("Input the day for the month: ");
		int month = input.nextInt();

		// check for negative cases, make user input write numbers
		while (month > 12 || month < 1) {
			System.out.println("Hey user. Please check your input and try again: ");
			month = input.nextInt();
		}

		System.out.println("Of what year? ");
		int year = input.nextInt();

		// create extra variable that will change based on which month and year
		int daysInTheMonth = 0;
		String nameOfTheMonth = "";

		switch (month) {
			case 1: nameOfTheMonth = "January"; break;
			case 2: nameOfTheMonth = "February"; break;
			case 3: nameOfTheMonth = "March"; break;
			case 4: nameOfTheMonth = "April"; break;
			case 5: nameOfTheMonth = "May"; break;
			case 6: nameOfTheMonth = "June"; break;
			case 7: nameOfTheMonth = "July"; break;
			case 8: nameOfTheMonth = "August"; break;
			case 9: nameOfTheMonth = "September"; break;
			case 10: nameOfTheMonth = "October"; break;
			case 11: nameOfTheMonth = "November"; break;
			case 12: nameOfTheMonth = "December"; break;
		}
		
		switch (month) {
			case 1: 
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: 
				daysInTheMonth = 31; 
				break;
		
			case 4:
			case 6:
			case 9:
			case 11:
				daysInTheMonth = 30;
				break;
		
			case 2:
				if ( (year % 400 == 0) || (year % 4 == 0   &&   year % 100 != 0)) {
					daysInTheMonth = 29;
				}else {
					daysInTheMonth = 28;
				}
				break;
		
		}

// EXPECTED OUTPUT: February of 2016 has 29 days		
		System.out.println( nameOfTheMonth + " of " + year + " has " + daysInTheMonth + " days.");
		
// write a TERNARY within the output
// it will say 'the month of year had number of days' IF it is in past
// it will say 'the month of year is going to have number of days' IF it is in future
		
	}
}
	
	

