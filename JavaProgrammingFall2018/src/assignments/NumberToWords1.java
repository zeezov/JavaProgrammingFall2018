package assignments;

import java.util.Scanner;

public class NumberToWords1 {
	public static void main(String[] args) {

//		Level: Easy
//		Create a program called NumberToWords.
//		Program accepts a number between 0 and 10
//		And prints the word for the number. Try to use switch statement.
//		Ex:
//		Enter number: 5
//		five

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter number from 1 to 10");
		int num = input.nextInt();

		switch (num) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		case 6:
			System.out.println("Six");
			break;
		case 7:
			System.out.println("Seven");
			break;
		case 8:
			System.out.println("Eight");
			break;
		case 9:
			System.out.println("Nine");
			break;
		case 10:
			System.out.println("Ten");
			break;
		default:
			System.out.println("Invalid Number");
		}

		input.close();

	}

}
