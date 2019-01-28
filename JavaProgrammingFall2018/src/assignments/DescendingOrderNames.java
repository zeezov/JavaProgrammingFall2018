package assignments;

import java.util.Scanner;

public class DescendingOrderNames {
	public static void main(String[] args) {

		/*
		 * Write a program asks the user to enter three names. Your program should
		 * display the names in descending order. 
		 * Example: Enter name 
		 * 1: Murodil 
		 * Enter name 
		 * 2: Maruf 
		 * Enter name 
		 * 3: Maria 
		 * Names in descending order: 
		 * Murodil 
		 * Maruf
		 * Maria
		 */

		Scanner input = new Scanner(System.in);
		
		String names = "";
		String allNames = "";
		
		for (int i = 1; i <= 3; i++) {
			System.out.println("Enter name number " + i);
			names = input.next();
			
			allNames += names + "\n";
		}
		System.out.print(allNames);
		
		input.close();
		

	}

}
