package day10_conditionals4;

public class TernaryOperator {
	public static void main (String[] args) {
		
		//Ternary operator is a question mark (?)
		
		/*
		 * Mx score is 100. Passing score is  60.
		 * 
		 */
		
		int score = 49;
		String status = " ";
		
		/*
		 * 1. Do using if/else
		 * 2. Do using ternary operator
		 */
		
//		if (score >= 60) {
//			status = "Passed";
//		} else {
//			status = "Did not pass";
//		}
//		
//		System.out.println(status);
		
//		status = (score >= 60) ? "Passed" : "Did not Pass"; 
//		
//		System.out.println(status);
		
		/*
		 * boolean variable express
		 * if true -> shipping = $25
		 * if false -> shipping = $15
		 */
		
		boolean express = true;
		
		
		System.out.println( (express) ? 25:15); 
		
		// or
//you can also say (express == true)
		int shipping = (express) ? 25:15;		
		System.out.println(shipping);
		
	}

}
