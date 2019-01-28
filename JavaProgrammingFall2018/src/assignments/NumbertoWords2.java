package assignments;

import java.util.Scanner;


public class NumbertoWords2 {
	public static void main(String[] args) {
		
		/*
		 * Level: Medium
		   Create a program called NumberToWords2.
  		   Program accepts a number between 0 and 1000
   	       And prints the word for the number.
 
		   Ex:
		   Enter number: 500
		   
		   five hundred

		   Enter number: 78
		   seventy eight
		 */
		
		
		Scanner input = new Scanner (System.in);
			System.out.println("Please enter numbers 0 to 1000");
			
//		int number = input.nextInt();
		
		String num = input.next();
		
		System.out.println(num.length());
		
		String str1 = "", str2 = "Two", str3 = "Three", str4 = "Four", str5 = "Five", str6 = "Six",
			   str7 = "Seven", str8 = "Eight", str9 = "Nine", str10 = "Ten";
		
		if(num.charAt(0) == 1 && str1.length() == 3) {
				
				str1 = "OneHundred";
				
			}else if(num.charAt(0) == 1 && str1.length() == 2) {
				
				str1 = "Ten";
				
			}else if(num.charAt(0) == 1 && str1.length() == 1) {
				
				str1 = "One";
			} 
			
		System.out.println(str1);
		
		

		//		if (number == 0) {
//			System.out.println("Zero");
//		} else if (number == 1) {
//			System.out.println(str1);
//		} else if (number == 2) {
//			System.out.println(str2);
//		} else if (number == 3) {
//			System.out.println(str3);
//		} else if (number == 4) {
//			System.out.println(str4);
//		} else if (number == 5) {
//			System.out.println(str5);
//		} else if (number == 6) {
//			System.out.println(str6);
//		} else if (number == 7) {
//			System.out.println(str7);
//		} else if (number == 8) {
//			System.out.println(str8);
//		} else if (number == 9) {
//			System.out.println(str9);
//		} else if (number == 10) {
//			System.out.println(str10);
//		}
//		
		
		
	}

}