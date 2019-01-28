package day09_Conditionals3;

import java.util.Scanner;

public class RushHourScanner {
	public static void main(String[] args) {
		
		//NESTED IF EXAMPLE
		
				/* Normal Hours:
				 * 0-100 -> $5.00
				 * 101 - 500 -> $8.00
				 * 501 - 1000 -> $10.00
				 * more thant $1000 -> $12
				 * 
				 * RUSH HOURS:
				 * 0-100 -> $10.00
				 * 101 - 500 -> $16.00
				 * 501 - 1000 -> $20.00
				 * more thant $1000 -> $24
				 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter true or false");
		
		boolean tf = input.nextBoolean();
		System.out.println("Please enter how many miles?");
		
		
		int miles = input.nextInt();
		double cost = 0;
		
		if (miles > 0 && miles <= 100) {
			if (tf) {
				cost = 10;
			} else {
				cost =5;
			}
		} else if (miles >= 101 && miles <= 500) {
			if(tf) {
				cost = 16;
			} else {
				cost = 8;
			}
		} else if (miles >= 501 && miles <= 1000) {
			if (tf) {
				cost = 20;
			} else {
				cost = 10;
			}
		} else if (miles > 1000) {
			if(tf) {
				cost = 24;
			} else {
				cost = 12;
			}
			
		} else {
			System.out.println("Invalid entry");
		}
		
		System.out.println(cost);
		
		input.close();
		
	}

}
