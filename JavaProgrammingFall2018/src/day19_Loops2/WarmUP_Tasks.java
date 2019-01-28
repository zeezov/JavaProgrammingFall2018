package day19_Loops2;

public class WarmUP_Tasks {
	public static void main(String[] args) {
		

		/*
		 * 1. Write a program that takes string word and converts first letter to
		 *    uppercase and the rest to lowercase. Print it after conversion. 
		 * 2. Write a program to print numbers from 1 to 10. in same line, separated by space 
		 * 3. Write a program to prints numbers from 10 to 1. in same line, separated by space
		 */

		// Task #1.

		String word = "JAVA";
		

		// you can also do it like this
		// it is much more easier

		word = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase(); 
		System.out.println(word); // making and printing the fitst letter in CAPS

//		word = word.toLowerCase();
//		
//		char word1 = word.toUpperCase().charAt(0);
//		String word2 = word.substring(1);
//		
//		System.out.println(word1 + word2); // making and printing the fitst letter in CAPS

		System.out.println("====================================");

		// Task #2.

		int num = 1;

		while (num <= 10) {
			System.out.print(num + ", ");
			num++;
		}
		System.out.println("");
		System.out.println("====================================");

		// Task #3

		int num1 = 10;

		while (num1 >= 1) {
			System.out.print(num1 + ", ");
			num1--;
		}

	}

}
