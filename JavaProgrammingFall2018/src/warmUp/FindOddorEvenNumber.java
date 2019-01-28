package warmUp;

import java.util.Scanner;

public class FindOddorEvenNumber {
	public static void main(String[] args) {

		// ask user to enter a numbe between 0 and 100
		// find Odd or Even number between 0-100

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number between 1 and 100");

		int num = input.nextInt();
		System.out.println("Your number is: " + num);
		input.close();
		
		if (num == 0 || num > 100) {
			System.out.println("Invalid number. Enter only numbers 1 - 100");
			return;
		}

		if (num % 2 == 0 && num >= 1 && num <= 100) {
			System.out.println("It is Even number");
		} else {
			System.out.println("It is Odd number");
		}

	}
	

}
