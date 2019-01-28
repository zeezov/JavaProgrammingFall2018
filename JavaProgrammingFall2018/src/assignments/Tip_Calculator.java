package assignments;

import java.util.Scanner;

public class Tip_Calculator {
	public static void main(String[] args) {
		/*
		 * Write your code inside the method. Use the values given as method parameters.
		 * Assign final values. Then user should select service quality that will
		 * correspond to tip percent.		 
		 * 
		 * Poor = 5%
		 * 
		 * Fair = 10%
		 * 
		 * Good = 15%
		 * 
		 * Great = 20%
		 * 
		 * Excellent = 25%
		 * 
		 * The program should display the following information based on the user input:
		 * 
		 * Split or No split
		 * 
		 * Number of people entered: &&&&
		 * 
		 * Service Quality:
		 * 
		 * Total to pay:
		 * 
		 * Total tip:
		 * 
		 * Total per person:
		 * 
		 * Tip per person:
		 *
		 * Input:
		 * 
		 * Split: Yes
		 * 
		 * Number of people: 4
		 * 
		 * Check amount: 476.00
		 * 
		 * Service Quality: Excellent
		 * 
		 * Output:
		 * 
		 * Split
		 * 
		 * Number of people entered: &&&&
		 * 
		 * Total to pay: 595.00
		 * 
		 * Total tip: 119.00
		 * 
		 * Total per person: 148.75
		 * 
		 * Tip per person: 29.75
		 * 
		 */
		
		Scanner input = new Scanner(System.in);
			
			System.out.println("Do you want to split the bill? Yes or No ");
			String split = input.nextLine();
			
			System.out.println("Check amount? ");
			double checkAmount = input.nextInt();
			
			System.out.println("Service Quality: Poor, Fair, Good, Great, Excellent ");
			String serQty = input.next();
			
		double tipPerPerson = 0, totalPerPerson = 0, totalTip = 0, totalToPay = 0;
		
		
		
		if (serQty.equalsIgnoreCase("Poor")) {
			totalTip = checkAmount * 0.05;
		} else if (serQty.equalsIgnoreCase("Fair")) {
			totalTip = checkAmount * 0.10;
		} else if (serQty.equalsIgnoreCase("Good")) {
			totalTip = checkAmount * 0.15;
		} else if (serQty.equalsIgnoreCase("Great")) {
			totalTip = checkAmount * 0.20;
		} else if (serQty.equalsIgnoreCase("Excellent")) {
			totalTip = checkAmount * 0.25;
		}else {
			
			System.out.println("Please enter the correct Service Quality");
			
			serQty = input.next();

		}
		
		totalToPay = totalTip + checkAmount; 
		
		
		
		if (split.equalsIgnoreCase("Yes")) {
			System.out.println("How many people? ");
			int ppl = input.nextInt();
			
			totalPerPerson = totalToPay / ppl;
			tipPerPerson = totalTip / ppl;
		
			System.out.println("How many people: " + ppl);
			System.out.println("Total to pay: " + totalToPay);
			System.out.println("Total tips: " + totalTip);
			System.out.println("Total per person: " + totalPerPerson);
			System.out.println("Tip per person: " + tipPerPerson);
			
			
		} else if (split.equalsIgnoreCase("No")) {
			System.out.println("Total tip will be: " + totalTip);
			System.out.println("Total to pay: " + totalToPay);
		} else {
			System.out.println("Error");
		}
		
		input.close();

	}

}
