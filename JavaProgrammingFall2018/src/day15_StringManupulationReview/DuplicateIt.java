package day15_StringManupulationReview;

import java.util.Scanner;

public class DuplicateIt {
	public static void main(String[] args) {
		
		//Ask the user to ente 2 words. Print the first word, second word, second word, first word
		//Input: one two 
		//Output: onetwotwoone
		
		Scanner input = new Scanner(System.in);
			System.out.println("Please enter first word");
			
		String firstWord = input.nextLine();
			
		System.out.println("Please enter second word");
		
		String secondWord = input.nextLine();
				
		System.out.println(firstWord + secondWord + secondWord + firstWord);
		
		System.out.println("==================");
		
		//using concat
		System.out.println(firstWord.concat(secondWord).concat(secondWord).concat(firstWord));

		
		input.close();
		
	}

}
