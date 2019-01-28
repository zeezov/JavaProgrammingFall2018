package day09_Conditionals3;

import java.util.Scanner;

public class TallCalculatorScanner {
	public static void main(String[] args) {
		
		/*
		 * 0-100 -> $5.00
		 * 101 - 500 -> $8.00
		 * 501 - 1000 -> $10.00
		 * more thant $1000 -> $12
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter how many miles?");
		
		int miles = input.nextInt();
		double cost = 0;
		
		if (miles > 0 && miles <= 100) {
			cost = 5.0;
		} else if (miles >= 101 && miles <= 500) {
			cost = 8.0;
		} else if (miles >= 501 && miles <= 1000) {
			cost = 10.0;
		} else if (miles > 1000) {
			cost = 12.0;
		} else {
			System.out.println("Not a valid entry");
		}
		
		System.out.println(cost);
		
		input.close();
		
		
		
	}

}
