package day20_Loop3_forLoop;

import java.util.Scanner;

public class WarmUpTasks {
	public static void main(String[] args) {

		/*
		 * 1. Ask user to enter 2 numbers for variables start and end:
		 * 
		 * if start is less than end: loop from start position to end position
		 * 
		 * and print "Step " + number.
		 * 
		 * If start is more than end: loop backwards from end to start
		 * 
		 * and print "Step "+ number.
		 * 
		 * Ex:
		 * 
		 * Enter 2 numbers:
		 * 
		 * 5 10
		 * 
		 * Step 5
		 * 
		 * Step 6
		 * 
		 * .....
		 * 
		 * Enter 2 numbers:
		 * 
		 * 20 3
		 * 
		 * Step 20
		 * 
		 * Step 19
		 * 
		 */
		
		//Task #1

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter two numbers");
		
		int start = input.nextInt();
		int end = input.nextInt();
		input.close();
		
		if (start < end) {
			while (start <= end) {
				//looping forward
				System.out.println("Step " + start);
				start++;
			}
		} else if (start > end) {
			//looping backwords
			while (start >= end) {
				System.out.println("Step " + start);
				start--;
			}
		}
		
//		while (start < end) {
//			
//			System.out.println("Step " + start);
//			start++;
//		} while (start > end) {
//			System.out.println(("Step" + start));
//			start--;
//		}

		
	}

}
