package day12_classobject_strings;

import java.util.Scanner;

public class Directions {
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your location");
		
		char startingPoint = input.next().charAt(0);
		
		System.out.println("Please enter your destination");

		char destination = input.next().charAt(0);
		
		if (startingPoint == destination) {
			System.out.println("Already here");
		}
		 // how to use lower case 
		if (startingPoint == 'A' || startingPoint == 'a' && destination == 'B' || destination == 'b') {
			System.out.println("Go right");
		} else if (startingPoint == 'A' || startingPoint == 'a' && destination == 'C'|| destination == 'c') {
			System.out.println("Go right and down");
		} else if (startingPoint == 'A' || startingPoint == 'a' && destination == 'D' || destination == 'd') {
			System.out.println("Go right than down and left");
		} else if (startingPoint == 'B' || startingPoint == 'b' && destination == 'C' || destination == 'C') {
			System.out.println("Go down");
		} else if (startingPoint == 'B' || startingPoint == 'b' && destination == 'D' || destination == 'd') {
			System.out.println("Go down and left");
		} else if (startingPoint == 'B' || startingPoint == 'b' && destination == 'A' || destination == 'a') {
			System.out.println("Go down than left and up");
		} else if (startingPoint == 'C' || startingPoint == 'c' && destination == 'D' || destination == 'd') {
			System.out.println("Go left");
		} else if (startingPoint == 'C' || startingPoint == 'c' && destination == 'A' || destination == 'a') {
			System.out.println("Go left and up");
		} else if (startingPoint == 'C' || startingPoint == 'c' && destination == 'B' || destination == 'b') {
			System.out.println("Go left than up and right");
		} else if (startingPoint == 'D' || startingPoint == 'd' && destination == 'A' || destination == 'a') {
			System.out.println("Go up");
		} else if (startingPoint == 'D' || startingPoint == 'd' && destination == 'B' || destination == 'b') {
			System.out.println("Go up than right");
		} else if (startingPoint == 'D' || startingPoint == 'd' && destination == 'C' || destination == 'c') {
			System.out.println("Go up than right and down");
		} else {
			System.out.println("Invalid Entry");
		}
		
		
		
		input.close();
		
		
		
	}

}
