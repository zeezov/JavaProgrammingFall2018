package day23_Loops6;

import java.util.Scanner;

public class AreaCode {
	public static void main(String[] args) {

		/*
		 * Program AreaCode to accepts phone number in one of two formats: 
		 * (202)3334444
		 * or 2023334444.
		 * 
		 * Extract area code using substring and use switch case to find out what state
		 * it is and assign city name to state variable.(no loop needed).Print state
		 * name.
		 */
		
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter your phone number");
		String num = input.next();
		input.close();
		
		if (num.startsWith("(")) {
			num = num.substring(1, 4);
		} else {
			num = num.substring(0, 3);
		}
		
		String firstThree = num;
		
		switch (firstThree) {
		
		case "202":
			System.out.println("Washington DC");
			break;
		case "703":
			System.out.println("Virginia");
			break;
		case "209":
			System.out.println("California");
		case "312":
			System.out.println("Illinois");
			break;
		case "347":
			System.out.println("New York");
			break;
		default:
			System.out.println("Not in database");
		
		}
		
	}

}
