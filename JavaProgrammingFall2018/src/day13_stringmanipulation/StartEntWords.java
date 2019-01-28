package day13_stringmanipulation;

public class StartEntWords {
	public static void main(String[] args) {
		  //Write a program StartEndWords:
//			you have 2 words that must be 5 characters 
//			and check if last letter of first word and first letter of
//			second word are same.
//			if either one not 5 chars legth:
//				print "need to be exactly 5 chars legth"
//			if last letter of 1st word and first letter of 2nd word match
//				print "Fizz"
//			if they do not match
//				print "Buzz - did not match"
		
		String w1 = "nazim";
		String w2 = "jahon";
		
		if (w1.length() != 5 || w2.length() != 5) {
			System.out.println("Need to be exaclty 5 chars");
		} else if (w1.charAt(4) == w2.charAt(0)) {
			System.out.println("Fizz");
		} else {
			System.out.println("Buzz - did not match");
		}
		
		//Another way to write this code
		
//		if (word1.length() == 5 && word2.length() == 5) {
//			if (word1.charAt(4) == word2.charAt(0)) {
//				System.out.println("Fizz");
//			} else {
//				System.out.println("Buzz - did not match");
//			}
//		} else {
//			System.out.println("need to be exactly 5 chars");
		
	}

}
