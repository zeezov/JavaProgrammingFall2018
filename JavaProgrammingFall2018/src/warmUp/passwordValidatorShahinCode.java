package warmUp;

import java.util.*;

public class passwordValidatorShahinCode {
	
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
	
	public static boolean passLength(String password) {
		
		if (password.length() >= 8) {
			return true;
		}else {
		System.out.println("Password should contain minimum 8 characters: " + password);
		return false;
		}
		
	}

	
	// Contain at least one uppercase letter (A-Z)
	public static boolean containsUppercase(String password) {

		
		for (int i = 0; i < password.length(); i++) {
			
			for (char ch = 'A'; ch <= 'Z'; ch++) {
//			 for (int ch = 65; ch <= 90; ch++)
				if (ch == password.charAt(i))
					return true;
			}
		}
		
		System.out.println("Password should contain at least 1 uppercase letter: " + password);
		return false;
		
	}
	
	// Contain at least one lowercase letter (a-z)
	public static boolean containsLowercase(String password) {
		
		for (int i = 0; i < password.length(); i++) {
			
			for (char ch = 'a'; ch <= 'z'; ch++) {
//			 for (int ch = 65; ch <= 90; ch++)
				if (ch == password.charAt(i))
					return true;
			}
		}
		
		System.out.println("Password should contain at least 1 lowercase letter: " + password);
		return false;
		
	}
	
	//•Contain at least one digit (0-1-2-3-4-5-6-7-8-9)
	public static boolean containsDigits(String password) {
		
		for (int i = 0; i < password.length(); i++) {
			
			for (char ch = '0'; ch <= '9'; ch++) {
//			 for (int ch = 65; ch <= 90; ch++)
				if (ch == password.charAt(i))
					return true;
			}
		}
		
		System.out.println("Password should contain at least 1 digit: " + password);
		return false;
		
	}
	
	// Password should contain at least 1 of these special characters: 
	// ~`!@#$%^&*()+=_-{}[]\|:;”’?/<>,.
	public static boolean containsSpecials(String password) {
		
		if (password.contains(" ")) {
			System.out.println("Password cannot contain a space: " + password);
			return false;
		}
		
		for (int i = 0; i < password.length(); i++) {	
			
//			if (password.charAt(i) == ' ') {
//				System.out.println("Password cannot contain a space: " + password);
//				return false;
//			}
			
			for (char ch = '!'; ch <= '/'; ch++) {	
				if (ch == password.charAt(i))
					return true;
			}
//		}
		
//		for (int i = 0; i < password.length(); i++) {	
			
			for (char ch = ':'; ch <= '@'; ch++) {	
				if (ch == password.charAt(i))
					return true;
			}
//		}

//		for (int i = 0; i < password.length(); i++) {	
			
			for (char ch = '['; ch <= '`'; ch++) {	
				if (ch == password.charAt(i))
					return true;
			}
//		}
		
//		for (int i = 0; i < password.length(); i++) {	
			
			for (char ch = '{'; ch <= '~'; ch++) {	
				if (ch == password.charAt(i))
					return true;
			}
		}
		
		System.out.println("Password should contain at least 1 special character: " + password);
		return false;
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String password = "";
		int count = 3;
		
		do {
			if (count < 3)
				System.out.println("You have " + count + " attempts left.");

			
				System.out.print("Please enter a password: ");
			password = scan.nextLine();
			count--;
			
			if (count == 0) {
				System.out.println("You failed to enter a right password in 3 attempts. Bye.");
				break;
			}
			
		} while ( !(passLength(password) & containsUppercase(password) & containsLowercase(password) & 
									containsDigits(password) & containsSpecials(password)) );
		
		if (count != 0) {
			System.out.println("Your password is accepted");
			//storedPasswords(password);
		}
		
//		if ( !(passLength(password) && containsUppercase(password) && containsLowercase(password) && 
//									containsDigits(password) && containsSpecials(password)) ) {
//			System.out.println();
//		}else {
//			System.out.println("Your password is accepted");
//		}
		
		
//		System.out.println( passLength(password) );
//		
//		System.out.println( containsUppercase(password) );
//		
//		System.out.println( containsLowercase(password) );
//		
//		System.out.println( containsDigits(password) );
//		
//		System.out.println( containsSpecials(password) );
	}

}
