package assignments;

import java.util.Scanner;

public class CommisionCalculator {
	public static void main(String[] args) {
		
		/*
		 * Commission Calculator:
		 * 
		 * Write a program which evaluates employee performance. 
		 * Create a class and a main method.
		 * Create following variable. 
		 * You decide the types of the variables.
		 *  1.Create a target variable which represents the amount that each salesperson needs to meet everyday.
		 *  Initialize with any number you like.
		 *  2.Create a bonus variable which represents the bonus amount that each salesperson will get. 
		 *  Initialize with 0.
		 *  3.Create a performance variable which representsthe performance level of a sales person. 
		 *  Initializewith a blank value.
		 *  4.Create your Sales variable which is equal to daily sales made by a salesperson. 
		 *  Initialize the your Sales with a user input. 
		 *  If the daily sales is 2 times more than the target, 
		 *  	performanceis equal to “Excellent”and bonus is 1000. 
		 *  If the daily sales is 1.5 times more than the target, 
		 *  	performance is equal to “Fine” and bonus is 500. 
		 *  If the daily sales is equal to or smaller than the target, 
		 *  	performance is equal to “Satisfactory” and bonus is 100.
		 *  At the end print the performance and the bonus. 
		 *  If sales is equal to 0, print “You’re fired”.
		 * 
		 */
		
		Scanner input = new Scanner(System.in);
			System.out.println("Please enter your sales amount");
			int sales = input.nextInt();
			input.close();
		
		int target = 1000;
		int bonus = 0;
		String performance = " ";
		
		if (sales == 0) {
		System.out.println("You are fired");
			return;
		} else if (sales < 0) {
			System.out.println("Wrong Entry");
			return;
		} else if (sales >= target * 2) {
			performance = "Excellent";
			bonus = 1000;
		} else if (sales >= target * 1.5 && sales <= target * 2) {
			performance = "Fine";
			bonus = 500;
		} else if (sales >= target) {
			performance = "Satisfactory";
			bonus = 100;
		} else if (sales < target) {
			performance = "Bad";
			bonus = 0;
			System.out.println("You dont qualify for any bonuses");
		}
		
		System.out.println("");
		System.out.println("Your sales are: $" + sales);
		System.out.println("Your performance is: " + performance);
		System.out.println("Your bonus will be: $" + bonus);
		
		
		
	}

}
