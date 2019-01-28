package day21_Loops4;

public class WarmUp1 {
	public static void main(String[] args) {

		/*
		 * Accept a string and if its a palindrome, print "Palindrom" if not print
		 * "Not Palindrom"
		 */

		String name = "Gugug";
		String reversed = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			reversed += name.charAt(i);
			// System.out.println(reversed);
		}
		if (name.equalsIgnoreCase(reversed)) {
			System.out.println("Palindrom");
		} else {
			System.out.println("Not Palindrom");
		}


		
		
		

	}

}
