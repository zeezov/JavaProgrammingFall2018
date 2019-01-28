package day14_stringManupulationCont;

import java.util.Scanner;

public class AddsThings {
	public static void main(String[] args) {
		
		//concat (concatination) ---> adds two strings together
		
		//System.out.println("a" + "b"); //regular way
		
		String domain = "@cybertekschool.edu";
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your username: ");
		
		String entry = input.nextLine();
		
		System.out.println("This is your new school email: ");
		
		//same as: entry.cantact(domain) === entry + domain
		//same as: entry.concat(domain) === "A" + "B"
		System.out.println(entry.concat(domain));
		//same as System.out.println(entry + domain);
		
		
		
	}

}
