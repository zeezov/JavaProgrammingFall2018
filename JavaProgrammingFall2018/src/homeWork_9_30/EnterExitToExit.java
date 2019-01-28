package homeWork_9_30;

import java.util.Scanner;

public class EnterExitToExit {
	public static void main(String[] args) {

		/*
		 * create a program that asks a user to write something, prints you wrote:(what
		 * the user wrote) until he writs exit. use a while or do while for that.
		 */

		Scanner input = new Scanner(System.in);

		while (true) {

			System.out.println("Write something \nEnter 'exit' to leave");
			String word = input.next();

			System.out.println();
			System.out.println("You wrote: ==> " + word);

			if (word.equalsIgnoreCase("exit")) {
				System.out.println("System Logged Off");
				break;
			}
			
		}
		
		input.close();
		
	}
	
}
