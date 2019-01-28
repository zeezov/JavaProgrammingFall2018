package homeWork_9_30;

import java.util.Scanner;


public class MultiplicationTable {
	public static void main(String[] args) {
		
		/*
		 * Write a program which accpets an integer (N) and prints its first 10 multiple. 
		 * Each muiltiple should be printed on the new line in the form: Nx i = result
		 */
		
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter a number");
		int num = input.nextInt();
		input.close();
		
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + num * i);
		}
		
		
		
	}
	

}
