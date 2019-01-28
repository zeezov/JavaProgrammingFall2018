package day17_reveiwSession_Strings;


public class Strings01 {
	public static void main(String[] args) {
		
		//String is a combination of chars
		
		String greeting = "Hello World!";
		//print number of characters
		System.out.println(greeting.length()); // or we can do the one below with variable
		int len = greeting.length(); 
		System.out.println("Length: " + len);
		
		System.out.println("=========================");
		
		// print the fist character
		
		System.out.println(greeting.charAt(0));// or we can do the one below with variable
		char firstCh = greeting.charAt(0);
		System.out.println("First Char: " + firstCh);
		
		System.out.println("=========================");
		
		//print the last character. Try to use
		//len variable. Or dont use len variable
		
		System.out.println(greeting.charAt(11)); // or you can use below
		System.out.println(greeting.charAt(len-1));
		
		greeting = greeting + " I hope everyone is well";
		
		char lastCh = greeting.charAt(greeting.length()-1);
		
		System.out.println(greeting.length());
		
		System.out.println("Last char: " + lastCh);
		
	}

}
