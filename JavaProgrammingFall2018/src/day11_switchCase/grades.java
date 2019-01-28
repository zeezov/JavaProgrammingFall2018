package day11_switchCase;

import java.util.Scanner;

public class grades {
	public static void main (String[] args) {
		
		/*
		 * A - Excellent
		 * B - Good
		 * C - Acceptable
		 * D - Poor
		 * Anything else - Error: Invalid grade
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Grade");
		
		char grade = input.next().charAt(0); //get a Char from Scanner
		
		switch (grade) {
		case 'A':
		case 'a': //to accept lower case you do add this
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Acceptable");
			break;
		case 'D':
			System.out.println("Poor");
			break;
		default:
			System.out.println("Error: Invalid Grade");
		}
		
	}

}
