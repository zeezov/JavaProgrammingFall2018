package day17_reveiwSession_Strings;

import java.util.Scanner;

public class WarmUp {
	public static void main(String[] args) {
		
		/*
		 * Program check age and age group by number of month:
		 * accpets number of month:
		 * based on number of months find out age and age group
		 */
		
		Scanner input = new Scanner (System.in);
			System.out.println("Please enter how many month");
			
		double month =input.nextDouble();
			input.close();
			
		
			if (month <= 0) {
			System.out.println("Not born yet");
			return;
						
		}
		
			int year = (int) (month / 12);
			int remainderMonth = (int) month % 12;
			
			
		if (year < 12) {
			System.out.println("You are: " + month + " month old Infant");
		} if (month >= 12 && month <= 36) {
			System.out.println("You are: " + year + " years old and " + remainderMonth + " month old Toddler");
		} if (month > 36 && month < 60) {
			System.out.println("You are: " + year + " years old and " + remainderMonth + " month old Pre-Shcool Child"); 
		} if (month >= 60 && month <= 144) {
			System.out.println("You are: " + year + " years old and " + remainderMonth + " month old School age Child");
		} if (month >= 156 && month <= 216) {
			System.out.println("You are: " + year + " years old and " + remainderMonth + " month old Adolescent");
		} if (month >= 228 && month < 480) {
			System.out.println("You are: " + year + " years old and " + remainderMonth + " month old Young Aduld");
		} if (month >= 480 && month < 780) {
			System.out.println("You are: " + year + " years old and " + remainderMonth + " month old Middge age Adult");
		} if (month >= 780) {
			System.out.println("You are: " + year + " years old and " + remainderMonth + " month old Senior");
		} if (month < 1) {
			System.out.println("Neonate");
		}
		
		
		
	}

}
