package Monday_Project_10_1;

import java.util.Scanner;

public class Part2One {
	public static void main(String[] args) {
		
		/*
		 * 1. Write a program that prompts the user to input a positive integer. 
		 * It should then print the multiplication table of that number.
		 */
		
		//While Loop
		
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter a number");
		
		int num = input.nextInt();
		int num2 = 0;
		
		while (num2 < 10 ) {
			num2++;
			System.out.println(num + " x " + num2 + " = " + num2 * num);
		}
		
		System.out.println("");
		System.out.println("=======================================");
		System.out.println();
		
		//For Loop
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + i * num);
		}
		
		input.close();
		
	}

}
