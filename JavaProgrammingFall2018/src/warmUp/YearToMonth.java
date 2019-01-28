package warmUp;

import java.util.Scanner;

public class YearToMonth {
	public static void main(String[] args) {
		
		//Ask user to enter they age and find out how many month they are
		
		Scanner input = new Scanner (System.in);
			System.out.println("Please enter you age");
			
		int year = input.nextInt();
		
		int month = 12 * year;
		int yearBorn = 2018 - year;
		
		
		System.out.println("You are: " + month + " month old");
		System.out.println("You are born in: " + yearBorn);
				
		input.close();
		
	}

}
