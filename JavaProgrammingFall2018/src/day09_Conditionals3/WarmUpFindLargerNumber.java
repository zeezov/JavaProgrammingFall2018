package day09_Conditionals3;

import java.util.Scanner;

public class WarmUpFindLargerNumber {
	public static void main(String[] args) {
		//1. You have 2 variable num1, num2
		//assign value of larger one into variable max
		//print value of Max -> "Max: number"
		
		System.out.println("I find larger number");
		Scanner scan = new Scanner(System.in);
		
		int num1, num2, max;
		
		System.out.println("Enter 2 numbers");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		if (num1 > num2) {
			max = num1;
		} else {
			max = num2;
		}
		
		System.out.println("Max: " + max);
		
		/*
		 * 2. You have 3 variables num1, num2, num3
		 * assign value of largest one into variable max
		 * print value of max -> "Max: number"
		 */
		System.out.println(" ");
		
		
		System.out.println("Please enter 3 numbers");
		
		int n1, n2, n3, mx;
		
		n1 = scan.nextInt();
		n2 = scan.nextInt();
		n3 = scan.nextInt();
		
		if (n1 >= n2 && n1 >= n3) {
			mx = n1;
		} else if (n2 >= n1 && n2 >= n3) {
			mx = n2;
		} else {
			mx = n3;
		} 
			
		
		System.out.println("Max numb is: " + mx );
		
		scan.close();
		
		}
		
		
	}


