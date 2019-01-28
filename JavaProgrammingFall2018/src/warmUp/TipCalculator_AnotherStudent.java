package warmUp;

import java.util.Scanner;

public class TipCalculator_AnotherStudent {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your bill?");
		double checkAmount = scan.nextDouble();
		System.out.println("Would you like to split?");
		String splitOrNot = scan.next();
		System.out.println("How many people?");
		int numOfPeople = scan.nextInt();
		System.out.println("How was your experiance? Poor, Fair, Good, Great, Excellent");
		String quality = scan.next();
		double tipAmount = 0;
		if (splitOrNot == "Yes" || splitOrNot == "yes") {
		}else if (quality.equals("Poor") || quality.equals("poor")) {
			   tipAmount = checkAmount * 0;
			}else if (quality.equals("Fair") || quality.equals("fair")) {
				 tipAmount = checkAmount * 0.1;
			}else if (quality.equals("Good") || quality.equals("good")) {
				 tipAmount = checkAmount * 0.15;
			}else if (quality.equals("Great") || quality.equals("great")) {
				 tipAmount = checkAmount * 0.2;
			}else if (quality.equals("Excellent") || quality.equals("excellent")) {
				 tipAmount = checkAmount * 0.25;
			}
		double totalCheck = tipAmount + checkAmount;
		double checkPerPerson = totalCheck / numOfPeople;
		double tipPerPerson = tipAmount / numOfPeople;
		
			System.out.println(splitOrNot);
			System.out.println("Number of people entered " + numOfPeople);
			System.out.println("Total to pay " + totalCheck);
			System.out.println("Total tip " + tipAmount);
			System.out.println("Total check  per person " + checkPerPerson);
			System.out.println("Total tip per person " + tipPerPerson);
			
		
		
	}

}
