package day23_Loops6;

import java.util.Scanner;

public class PhoneNumberValidator {
	public static void main(String[] args) {

		/*
		 * Program PhoneNumberValidator - simple phone number format check.
		 * Accepts phone number in one of two formats: (202)3334444 or 2023334444
		 * Checks:
		 * - if length is not 12 or 10 characters, then -> show error message : invalid
		 * length - must be either 12 or 10 characters.
		 * 
		 * - If first character is '(' then 1. fifth character must be ')' -> if not
		 * show error message: Invalid format -there is no closing parenthesis.
		 * 
		 * - Get rid of parentheses using replace method - code:
		 * 
		 * phoneNumber = phoneNumber.replace( "(", "");
		 * 
		 * phoneNumber = phoneNumber.replace( ")", "");
		 * 
		 * - Using a loop check if each character is a number between 0-9. -> if not
		 * show error message: Invalid character - must be a number between 0-9.
		 */
		
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter a phone number");
		String num = input.next();
		
		if (num.startsWith("(")) {
			if (num.length() != 12) {
				System.out.println("Invalid length. Must be 12 or 10 numbers");
				return;
			}
		} else {
			if (num.length() != 10) {
				System.out.println("Invalid length. Must be 12 or 10 numbers");
				return;
			}
		}
		
		if (num.charAt(0) == '(') {
			if (num.charAt(4) != ')') {
			System.out.println("Invalid format. there is no closing parenthesis");
			return;
			
			}
		}
		
		 num = num.replace( "(", ""); // if there is '(' then remove it
		 
		 num = num.replace( ")", ""); // if there is ')' then remove it
		 
		 //loop and check if char is a number between 0-9
		 
		 for (int i = 0; i < num.length(); i++) {
			 if (!(num.charAt(i) >= '0' && num.charAt(i) <= '9')) {
				 System.out.println("Invalid char - must be a number between 0 - 9 ");
				 return;
			 }
		 }
		System.out.println("All numbers detected.");
		
	}

}
