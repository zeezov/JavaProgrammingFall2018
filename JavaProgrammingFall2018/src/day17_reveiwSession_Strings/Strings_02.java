package day17_reveiwSession_Strings;

import java.util.Scanner;

public class Strings_02 {
	public static void main(String[] args) {
		
		//create 1 string variable
		//if first and last chars are the same print "First same"
		//if second and second from the last word are the same print "second same"
		
		Scanner input = new Scanner(System.in);
			System.out.println("What is the word? ");
			String word = input.next();
		// test below conditions only if word has atleast 4 chars
		//check first and last
			
		if (word.length() >= 4) {
			if (word.charAt(0) == word.charAt(word.length()-1)) {
			System.out.println("First and last words are the Same");
			} 
			//check second and second from the end
			if (word.charAt(1) == word.charAt(word.length()-2)) {
			System.out.println("Seconds word and 1 before last word are the Same");
			}
		} else {
			System.out.println("Error: At least 4 characters required");
		}
		input.close();
	}

}
