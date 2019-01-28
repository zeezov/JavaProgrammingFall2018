package day12_classobject_strings;

import java.util.Scanner;

public class GetBeverage {
	public static void main(String[] args) {
		
		/*
		 * tea - $3
		 * coffee - $4
		 * water - $2
		 * juice - 5
		 * 
		 * String drink
		 * double price
		 * 
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please chose your drink");
		
		String drink = input.nextLine();
		double price = 0.0;
		
		
		switch (drink) {
		case "Tea":
			price = 3;
			break;
		case "Coffee":
			price = 4;
			break;
		case "Water":
			price = 2;
			break;
		case "Juice":
			price = 5;
			break;
		default: 
			System.out.println("Invalid entery. You can only order Tea, Coffee, Water and Juice");
			break;
			

		}
		
		
		System.out.println("Your cost for " + drink + " is: $" + price);
		
	} 

	
 
}
