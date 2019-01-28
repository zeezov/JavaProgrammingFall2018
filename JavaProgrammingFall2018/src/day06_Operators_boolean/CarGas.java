package day06_Operators_boolean;

import java.util.Scanner;

public class CarGas {
	public static void main (String[] args) {
		/*
		 * Write a program that asks user to enter current car odometer miles
		 * and previous car odometer miles. Also number of gallons that was put.
		 *  and price per gallon
		 * 
		 * calculate MPG -> miles per gallon value
		 * calculate total fuel expense
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter current odometer miles: ");
			double currOdo = input.nextDouble();
		
		System.out.println("Please enter old odometer miles: ");
			double oldOdo = input.nextDouble();
		
		System.out.println("Enter gallons");
			double gallons = input.nextDouble();
		
		System.out.println("Price per gallon: ");
			double pricePerGallon = input.nextDouble();
		
		double mpg = (currOdo - oldOdo) / gallons;
			System.out.println("MPG Value: " + mpg);
		
		double totalCost = pricePerGallon * gallons;
			System.out.println("Your total cost is $" + totalCost);
		
		
		input.close();
		
		
		
		
		
	}


}
