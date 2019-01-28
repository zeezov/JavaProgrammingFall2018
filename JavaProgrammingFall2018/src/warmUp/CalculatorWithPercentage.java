package warmUp;

import java.util.Scanner;
/*
 * Build a program that asks user to enter unit price and quantity
 * and depending on that calculates %
 * if 100 - 120 qty 10% discount
 * if over 120 qty 15% discount
 * if less than 100 qty no discount
 * 
 */

public class CalculatorWithPercentage {
	public static void main (String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter units price");
		
		double unitPrice = input.nextInt();
		System.out.println("Please enter quantity");
		int quantity = input.nextInt();
		double grandTotal = unitPrice * quantity;
		double dis1 = grandTotal - (grandTotal * 0.10);
		double dis2 = grandTotal - (grandTotal * 0.15);
		
		
		
		
		if (quantity >= 100 && quantity <= 120) {
			System.out.println("Your total is " + grandTotal + " with 10% disount it is " + dis1 + " You saved " +
								(grandTotal - dis1));
		} else if (quantity > 120) {
			System.out.println("Your total is " + grandTotal + " with 15% discount it is " + dis2 + " You saved " +
								(grandTotal - dis2));
		} else {
			System.out.println("Your total is " + grandTotal + " You have no discounts");
		}
		
		input.close();
		
		
		
	}

}
