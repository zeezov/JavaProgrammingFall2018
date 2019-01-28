package day08_conditionals2;

import java.util.Scanner;
//Write a program that asks a student what is their Batch number
//if that is 10 say = we are classmates
//if not, say something else
public class WarmUpTasks {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your Batch Number");
		
		int batchNumber = scan.nextInt();
		
			if (batchNumber == 10) {
				System.out.println("We are classmates");
			} else {
				System.out.println("We are not classmates");
			}
		
		//Create a variable pincode and assign some number to it
		//Ask user to enter their pincode, if it matches, say access granted
		//if not, denied
		System.out.println(" ");
			
		int pin = 2233;
		System.out.println("Please enter your pin number");
		
		int inputPincode = scan.nextInt();
		
			if (inputPincode == pin) {
				System.out.println("Access granted");
			} else {
				System.out.println("Denied");
				
			}
		
		System.out.println("");
		
		//	Aks user to ineter a number. and check if it is odd or even
		// if even print "It is even number. Else print it is odd number
			
		System.out.println("Please inter a number:");
		 int number = scan.nextInt();
		  
		 	if (number % 2 == 0) {
		 		System.out.println("Even number");
		 	} else {
		 		System.out.println("Its odd man");
		 	}
		 	
		 scan.close();
	}

}
