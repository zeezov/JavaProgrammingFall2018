package day10_conditionals4;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		
		/*
		 * Leap year (February 29 days)
		 * if an year is 1) divisable 400 or
		 * 2) divisable of 4 but not divisable of 100 then its a leap year
		 * regular years -> 365
		 * leap years -> 366
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter what year?");
		
		int year = input.nextInt();
	
		if (year % 400 == 0) {
			System.out.println("It is a leap year");
		} else if (year % 4 == 0 && year % 100 != 0) {
			System.out.println("It is a leap year");
		} else {
			System.out.println("Not a leap year");
		}
		
		//another way to do it in one sentance
		
		//if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			
		//}
		
	}

}
