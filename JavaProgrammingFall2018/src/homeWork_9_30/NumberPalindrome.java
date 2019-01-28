package homeWork_9_30;

public class NumberPalindrome {
	public static void main(String[] args) {
		
		/*
		 * Write a program that accepts a number from user and check if the number is palindrome or not
		 * A plindorom number is a numbe which remains the same when it is reversed. 
		 */
		
		int num = 123321;
		int reversed = 0, remainder, originalInteger;
		
		originalInteger = num;
		
		while (num != 0) {
			remainder = num % 10;
			reversed = reversed * 10 + remainder;
			num /= 10;
		}
		
		if (originalInteger == reversed) {
			System.out.println(originalInteger + " is a palindrome");
		} else {
			System.out.println(originalInteger + " is not palindrome");
		}
		
		
		
	}

}
