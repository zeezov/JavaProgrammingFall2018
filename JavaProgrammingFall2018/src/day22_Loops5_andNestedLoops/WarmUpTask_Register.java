package day22_Loops5_andNestedLoops;

import java.util.Scanner;

public class WarmUpTask_Register {
	public static void main(String[] args) {

		/*
		 * It will ask user how many items he purchased. Then based on that number it
		 * will ask item name and price that many times. You need to gather all items in
		 * one String variable items separated by comma And calculate sum of each item
		 * price into variable totalPrice Then print out items and total price. Example:
		 * How many items are you purchasing? 2 What is item 1? Gloves How much is
		 * Gloves? 10.44 What is item 2? Hat How much is Hat? 13 ---------- Your items:
		 * Gloves, Hat Your total Price: $23.44
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("---WELCOME TO OUR STORE--- \n");

		System.out.println("How many items you have? ");
		int itemsCount = input.nextInt();

		// Declare variables for items and prices for them.
		String allItems = "";
		double totalPrice = 0;
		
		
	
		if (itemsCount == 0) {
			System.out.println("Have a good day");
			return;
		}

		for (int i = 1; i <= itemsCount; i++) {

			System.out.println("What is item number: " + i + "?");
			String item = input.next();
			

			System.out.println("How much is " + item + "?");
			double price = input.nextDouble();

			if (i == itemsCount) {
				allItems += item;
			} else {
				allItems += item + ", "; // aslo can say allItems = allItems + item + ", ";
			}
			totalPrice += price;

		}
		
		System.out.println("Your items: " + allItems);
		System.out.println("Your total price: $" + totalPrice);
		
		input.close();

	}

}
