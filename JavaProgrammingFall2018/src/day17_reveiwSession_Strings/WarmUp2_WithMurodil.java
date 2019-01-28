package day17_reveiwSession_Strings;

import java.util.Scanner;


public class WarmUp2_WithMurodil {
	public static void main(String[] args) {
		
		//month to age
		
		Scanner input = new Scanner (System.in);
			System.out.println("Please enter number of month");
			double month = input.nextDouble();
			//chekc if valid month
			input.close();
			if (month <= 0.0) {
				System.out.println("Not born yet");
				return;
			}
			
			//based on month, find out year
			//divide month by 12 and get whole years
			int year = (int) (month / 12);
			//find out number of remaining month
			int remainingMonth = (int) month % 12;
			String ageGroup = " ";
			
			
			if (month < 1.0) {
				ageGroup = "Neonate";
				System.out.println("Weeks old: " + (month / 0.25));
			} else if (year < 1) {
				ageGroup = "Infant";
				System.out.println("Month: " + month);
			} else if (year < 13) {
				if (year < 3) {
					ageGroup = "Toddler";
				} else if (year > 6) {
					ageGroup = "Pre-School Child";
				} else {
					ageGroup = "School Age Child";
				}
			} else if (year < 65) {
				if (year < 19) {
					ageGroup = "Adolescent";
				} else if (year < 41) {
					ageGroup = "Young Adult";
				} else {
					ageGroup = "Middle Age Adult";
				}
			} else {
				ageGroup = "Older Adul";
			}
			
			System.out.println("Age group is: " + ageGroup);
			System.out.println("Years: " + year);
			System.out.println("Month: " + remainingMonth);
		
	}

}
