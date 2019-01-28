package day09_Conditionals3;

import java.util.Scanner;

public class FicoScoreTaskScanner {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your Credit Score");
		
		int creditScore = scan.nextInt();
		String creditStatus = " ";
		int percentage = 0;
		
		if (creditScore >= 1 && creditScore <= 299) {
			creditStatus = "Bad Credit";
		} else if (creditScore <= 0 || creditScore > 850) {
			creditStatus = "No Data Available";
		} else if (creditScore >= 300 && creditScore <= 579) {
			creditStatus  = "Poor";
			percentage = 16;
		} else if (creditScore >= 580 && creditScore <= 669) {
			creditStatus = "Fair";
			percentage = 18;
		} else if (creditScore >= 670 && creditScore <= 739) {
			creditStatus = "Good";
			percentage = 21;
		} else if (creditScore >= 740 && creditScore <= 799) {
			creditStatus = "Very Good";
			percentage = 25;
		} else if (creditScore >= 800 && creditScore <= 850) {
			creditStatus = "Eceptional";
			percentage = 20;
		}
		
		System.out.println(creditStatus);
		System.out.println(percentage);
		
		scan.close();
		
	}

}
