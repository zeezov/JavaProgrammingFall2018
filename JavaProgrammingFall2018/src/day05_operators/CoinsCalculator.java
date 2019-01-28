package day05_operators;

import java.util.Scanner;

public class CoinsCalculator {
	public static void main (String[] args) {
		
		//2000 cents:
		//how many dollars:
		//how many quaters:
		// how many dimes
		//how many nickels				
		//How many pennies
		
//		int pennies = 250;
//		int dollars = pennies / 100;
//			System.out.println(dollars);
//		pennies %= 100; //50 remainder
//			System.out.println(pennies);
		
		//find out how much money you have if person brings only pennies
		Scanner keyboard = new Scanner(System.in);
			System.out.println("Enter count of pennies you have: ");
				int pennies = keyboard.nextInt();
				int dollars, quarters, dimes, nickels, cents;
				
				dollars = pennies / 100;
				pennies %= 100;
				
				quarters = pennies / 25;
				pennies %= 25;
				
				dimes = pennies / 10;
				pennies %= 10;
				
				nickels = pennies / 5;
				pennies %= 5;
				
				cents = pennies;
					System.out.println("Dollars $" + dollars);
					System.out.println("Quarters: " + quarters);
					System.out.println("Dimes: " + dimes);
					System.out.println("Nickels " + nickels);
					System.out.println("Cents " + cents);
					
					
	}

}
