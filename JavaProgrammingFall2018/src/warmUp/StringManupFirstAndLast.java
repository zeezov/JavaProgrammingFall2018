package warmUp;

import java.util.Scanner;




public class StringManupFirstAndLast {
	public static void main(String[] args) {
		
		/*
		 * First and last.
		 * Ask user to enter two words. 
		 * Print the first letter of the first word and the last letter of the second word.
		 * Input: Bob System
		 * Output: Bm
		*/
		
		Scanner input = new Scanner(System.in);
			System.out.println("Please enter 2 numbers");
			String w1 = input.nextLine();
			String w2 = input.nextLine();
			
			char word1 = w1.charAt(0);
			int len = w2.length();
			char word2 = w2.charAt(len - 1);
			
			System.out.println(word1 + "" + word2);
			//System.out.println(word2);
			
			input.close();
		
	}	
	
	

}
