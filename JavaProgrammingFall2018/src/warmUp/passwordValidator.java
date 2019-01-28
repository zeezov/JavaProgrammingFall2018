package warmUp;

import java.util.Scanner;

public class passwordValidator {
	public static void main(String[] args) {
		
		/* 
		 * Ask user to enter a new password. 
		 * 
		 * If the password does not match any of the requirements below, 
		 * print a message based on what requirement it is breaking. 
		 * 
		 * If it does not break any requirement, print ‘Password accepted’.
		 * 
		 * Password requirements:
		 * 	•Be a minimum of eight (8) characters in length
		 * 	•Contain at least one uppercase letter (A-Z)
		 * 	•Contain at least one lowercase letter (a-z)
		 * 	•Contain at least one digit (0-1-2-3-4-5-6-7-8-9)
		 * 	•Contain at least one special character (~`!@#$%^&*()+=_-{}[]\|:;”’?/<>,.)
		 * 
		 * Input: oxidex
		 * Output: Password should contain minimum 8 characters
		 * 
		 * Input: abcdefghi
		 * Output: Password should contain at least 1 uppercase letter
		 * 
		 * Input: ABCDEFGHI
		 * Output: Password should contain at least 1 lowercasenumber
		 * 
		 * Input: Abcdefghi
		 * Output: Password should contain at least 1 digit
		 * 
		 * Input: Abcdefghi1
		 * Output: Password should contain at least 1 of these special characters: ~`!@#$%^&*()+=_-{}[]\|:;”’?/<>,.
		 * 
		 * Input: Abcdefghi1$
		 * Output: Your password is accepted
		 * 
		 */	
		
		Scanner input = new Scanner(System.in);
			System.out.println("Please enter password");
		String password = input.nextLine();
			
		
		System.out.println(moreThanEight(password));
		System.out.println(oneUpperCase(password));
		System.out.println(oneLowerCase(password));
		System.out.println(oneDigit(password));
		System.out.println(speChar(password));
		
		System.out.println("Your password is accepted");
		
	}
	 // •Be a minimum of eight (8) characters in length
	public static boolean moreThanEight(String password) {
		
		if (password.length() >= 8) {
			return true;
		} else {
			System.out.println("Password must be 8 characters long: " + password);
			return false;
		}
		
	}
	 //•Contain at least one uppercase letter (A-Z)
	public static boolean oneUpperCase(String password) {
		
		for (int i = 0; i < password.length(); i++) {
			for (char ch = 'A'; ch <= 'Z'; ch++) {
				if(ch == password.charAt(i)) {
					return true;
				}
			}	
		}
		System.out.println("Password must have one Upper Case: " + password);
		return false;
		
	}
	 // •Contain at least one lowercase letter (a-z)
	public static boolean oneLowerCase(String password) {
		
		for (int i = 0; i < password.length(); i++) {
			for (char ch = 'a'; ch <= 'z'; ch++) {
				if(ch == password.charAt(i)) {
					return true;
				}
			}
		}
		System.out.println("Password must have one Lower Case: " + password);
		return false;	
	}
	 // •Contain at least one digit (0-1-2-3-4-5-6-7-8-9)
	public static boolean oneDigit(String password) {
		
		for (int i = 0; i < password.length(); i++) {
			for (char ch = '0'; ch <= '9'; ch++) {
				if (ch == password.charAt(i)) {
					return true;
				}
			}
		}
		System.out.println("Pasword must have one digit: " + password);
		return false;
	}
	 // •Contain at least one special character (~`!@#$%^&*()+=_-{}[]\|:;”’?/<>,.)
	public static boolean speChar(String password) {
		
		if(password.contains(" ")) {
			System.out.println("Password cant have space: " + password);
			return false;
		}
		
		for (int i = 0; i < password.length(); i++) {
			
			for (char ch = '!'; ch <= '/'; ch++) {
				if (ch == password.charAt(i)) {
					return true;
				}
			}
			
			for (char ch = ':'; ch <= '@'; ch++) {
				if (ch == password.charAt(i)) {
					return true;
				}
			}
			
			for (char ch = '['; ch <= '`'; ch++) {
				if (ch == password.charAt(i)) {
					return true;
				}
			}
			
			for (char ch = '{'; ch <= '~'; ch++) {
				if (ch == password.charAt(i)) {
					return true;
				}
			}
			
		}
		System.out.println("Password should must have one of these speacial characters [~`!@#$%^&*()+=_-{}[]\\|:;”’?/<>,.] : " + password);
		return false;
		
	}
	
	
	

}
