package day13_stringmanipulation;

import java.util.Scanner;

public class CheckWords {
	public static void main(String[] args) {
		
//		Write a program CheckWords:
//			Program accepts 3 words and :
//			- if they are same length:
//				print "All words are same length"
//			- if some same length and others not:
//				print "Not Same nor Different lengths"
//			- if all different length 
//				print "All different length"
//
//			
		
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter first word");
		
		String word1 = input.nextLine();
		System.out.println("Please enter second word");
		String word2 = input.nextLine();
		System.out.println("Please enter third word");
		String word3 = input.nextLine();
		
		int n1 = word1.length();
		int n2 = word2.length();
		int n3 = word3.length();
		
		if (n1 == n2 && n1 == n3) {
			System.out.println("All words are the same");
		} else if (n1 == n2 || n2 == n3 || n1 == n3) {
			System.out.println("Not same or different length");
		} else {
			System.out.println("All different length");
		}
				
		input.close();
		
	}

}
