package warmUp;

import java.util.Scanner;

public class StringManupulation {
	public static void main(String[] args) {
		
		//Make Z upper case
		
		String str = "NAZIM";
		
		str = str.toLowerCase();
		String firstHalf = str.substring(0, 2);
		String secondHalf = str.substring(3, 5);
		char mid1 = str.toUpperCase().charAt(2);
		
		//this is another more dynamic way to make it. As said by Murodil.
//		str = str.substring(0, str.length()/2).toLowerCase() 
//				+ str.substring(str.length()/2, str.length()/2 + 1).toUpperCase()
//				+ str.substring(str.length()/2 + 1).toLowerCase();
//		
//			System.out.println(word);
		
		System.out.println(firstHalf + mid1 + secondHalf);
		
		System.out.println("=====================================");
		
		//make the middle word upper case if the word input is odd
		
		Scanner input = new Scanner (System.in);
		
		String word = input.nextLine();
		
		word = word.toLowerCase();
		
		if (word.length() % 2 !=0) {
			String mid = word.substring((word.length()+1)/2-1,(word.length()+1)/2);
			
	 	      mid=mid.toUpperCase();
			word=word.substring(0,(word.length()+1)/2-1)+mid+word.substring((word.length()+1)/2);
	 			 
				System.out.println(word);
				
			
		} else {
			System.out.println("Your name is not ODD");
		}
			
		
		
		
		
		
		
	}

}
