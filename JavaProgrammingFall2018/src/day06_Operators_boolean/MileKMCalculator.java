package day06_Operators_boolean;

import java.util.Scanner;

public class MileKMCalculator {
	public static void main(String[] args) {
		/*
		 * Create a program taht accepts value
		 * in miles and converts to kilometers
		 */
		
		Scanner scan = new Scanner(System.in);
			
		System.out.println("Enter the miles ");
			double miles = scan.nextDouble();
			
		double kilometers = miles * 1.60934;
			System.out.println(miles + " miles is " + kilometers + "km");
		
	}

}
