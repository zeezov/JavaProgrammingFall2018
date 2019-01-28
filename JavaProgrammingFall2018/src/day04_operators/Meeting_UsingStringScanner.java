package day04_operators;

import java.util.Scanner;

public class Meeting_UsingStringScanner {
	public static void main (String[] args) {
		//accept a string value using a scanner
		Scanner scan = new Scanner(System.in);
			System.out.println("Hello, what is your name?");
				String name = scan.nextLine();
			System.out.println("What is your last name?");
				String lastName = scan.nextLine();
			System.out.println("Nice to meet you " + name + " " +  lastName);
		
		scan.close();
	}

}
