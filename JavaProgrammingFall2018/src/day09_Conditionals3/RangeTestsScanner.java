package day09_Conditionals3;

import java.util.Scanner;

public class RangeTestsScanner {
	public static void main(String[] args) {
		
	
			//check if students are more than or equal 5 or less than 30
			//if true print "Lest do mentoring session"
			//if students more than or equall to 30 or less than or equal to 60 print -
			//lets have a lecture
			//if more than 60: 
			//print how many students need to take class online
		
	
		Scanner input = new Scanner(System.in);
		System.out.println("How many studets are in class?");
		
		int students = input.nextInt();
		String say = " ";
		
		if (students >= 5 && students < 30) {
			say = "Lets do mentoring session";
		} else if (students >= 30 && students <= 60) {
			say = "Lets have a lecture";
		} else if (students > 60) {
			int online = students - 60;
			System.out.println(online + " Need to take the class online");
		} else {
			System.out.println("Number have to be 5 or more");
		}
	
		System.out.println(say);
		
		input.close();
		
	}

}
