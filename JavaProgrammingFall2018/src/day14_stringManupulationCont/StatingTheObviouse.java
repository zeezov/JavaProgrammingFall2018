package day14_stringManupulationCont;

import java.util.Scanner;

public class StatingTheObviouse {
	public static void main(String[] args) {
		
		//create Scanner
		//what is your email
		//some@gmail.com
		//oh so you have gmail
		
		Scanner input = new Scanner(System.in);
			System.out.println("Please enter your email: ");
			
		String entry = input.nextLine();
		
		//donaldtheduck@gmail.com
		
		//System.out.println(entry.substring(14, 19));
		//1 find the location of @ sign
		//2 find the location of the .
		//substring using those two locations.
		
		//it is getting the location of "@" sign and adding one
		//if we dont add 1, it will include "@" sign inthe substring
		int start = entry.indexOf("@")+1;
			System.out.println(start);
			System.out.println(entry.substring(start));
			
		int end = entry.indexOf(".");
			System.out.println("Oh so you have a " + entry.substring(start, end));
		
		
		
		
		
		
	}

}
