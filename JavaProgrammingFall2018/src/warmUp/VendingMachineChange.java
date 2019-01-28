package warmUp;

import java.util.Scanner;

/*
 * Build a program that give change at Vending Machine.
 * User only can pay with $1 and choose numbers like 25,35,45 etc.
 * Numbers can be between 25-100
 * if 95 entered output should be Nickels: 1
 * Output should count Quaters, Dimes, Nickels
 */


public class VendingMachineChange {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please select a number from 25 to 100");
		
		int number = input.nextInt();
		int quaters, dimes, nickels, pennies, change;
		
		change = 100 - number;
		
		quaters = change / 25;
		change %= 25; 
		
		dimes = change / 10;
		change %= 10;
		
		nickels = change / 5;
		change %= 5;
		
		pennies = change / 1;
		change %= 1;
		
		System.out.println("Quaters " + quaters + ": Dimes " + dimes + ": Nickels " + nickels + ": Pennies " + pennies);
	
		input.close();
	}
	

}
