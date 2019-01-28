package homeWork_9_30;

import java.util.Scanner;

public class ThreeNumbersPrintLargest {
	public static void main(String[] args) {
		
		/*
		 * Write a Java program that reads in 3 numbers from the user in a loop (one at a time)
		 * And print largest number and the summation of all numbers
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 3 numbers");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		//int sum = num1+num2+num3;
		input.close();
		
		if (num1 > num2) {
			System.out.println(num1);
		} else if (num2 > num3) {
			System.out.println(num2);
		} else {
			System.out.println(num3);
		}
		
		System.out.println("Total " + (num1 + num2 + num3));
		
		
		
	}

}
