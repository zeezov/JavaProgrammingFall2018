package warmUp;

import java.util.Scanner;

public class StringManipulationExercises {
	public static void main (String[] args) {
		
		/*
		 * Ask user to enter a name. 
		 * Print Hi<name>!
		 * Input:Bob
		 * Output: Hi Bob!
		 */
		
		Scanner input = new Scanner(System.in);
			System.out.println("Please enter your name");
			
		String name = input.nextLine();
		
		System.out.println("Hi " + name);
		
		input.close();
	}

}
