package day31_Methods02;

import java.util.*;

public class Calculator {
	public static void main(String[] args) {

		/*
		 * Add following methods: 1. add -> 2 double arguments/parameters/inputs add
		 * numbers and prints the result. 2. substract -> double
		 * arguments/parameters/inputs substracts numbers and prints the result. 3.
		 * multiply -> double arguments/parameters/inputs multiply numbers and prints
		 * the result. 4. divide -> double arguments/parameters/inputs divide numbers
		 * and prints the result.
		 */

//		double n1 = 0;
//		double n2 = 0;
//		
//		Add(2,2);
//		Subtract(3,2);
//		Multiply(3,3);
//		Divide(0,5);

		// add scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 2 numbers: ");
		Double n1 = input.nextDouble();
		Double n2 = input.nextDouble();

		System.out.println(
				"Choose operation: \n" + "1 - add \n" + "2 - subtract \n" + "3 - multiply \n" + "4 - divide \n");

		/*
		 * for add 1 for subtract 2 for multiply 3 for divide 4
		 */

		// You can also you this if you want to use '+', '-', etc..
		
		/*
		 * System.out.println("Enter 2 numbers, and the operator between them: ");
		 * n1=input.nextDouble(); 
		 * char op=input.next().charAt(0); 
		 * n2=input.nextDouble();
		 * 
		 * switch(op) { 
		 * case '+': add(n1,n2); 
		 * break; 
		 * case '-': 
		 * substract(n1,n2); 
		 * break;
		 * case '*': 
		 * multiply(n1,n2); 
		 * break; 
		 * case '/': 
		 * divide(n1,n2); 
		 * break; 
		 * default:
		 * System.out.println("wrong entry!");
		 */

		int operation = input.nextInt();

		switch (operation) {
		case 1:
			Add(n1, n2);
			break;
		case 2:
			Subtract(n1, n2);
			break;
		case 3:
			Multiply(n1, n2);
			break;
		case 4:
			Divide(n1, n2);
			break;
		default:
			System.out.println("Error");
		}

	}

	public static void Add(double num, double num2) {
		System.out.println(num + num2);
	}

	public static void Subtract(double num, double num2) {
		System.out.println(num - num2);
	}

	public static void Multiply(double num, double num2) {
		System.out.println(num * num2);
	}

	public static void Divide(double num, double num2) {

		if (num2 == 0) {
			System.out.println("Cannot divide by Zero");
		} else {
			System.out.println(num / num2);
		}
	}

}
