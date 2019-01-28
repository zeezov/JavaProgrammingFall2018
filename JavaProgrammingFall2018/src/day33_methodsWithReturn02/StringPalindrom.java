package day33_methodsWithReturn02;

public class StringPalindrom {
	public static void main(String[] args) {
		
		
		boolean isPal = isPalindrom("level");
			System.out.println(isPal);
			
		String word = "java";
		
		
		// You can apply this method if you want to check if it is palindrom or not 
		if (isPalindrom(word)) {
			System.out.println("Is palindrom");
		} else {
			System.out.println("Not palindrom");
		}
		
	}
	
	/*
	 * Method: isPalindrome
	 * Params: 1. String
	 * Return type: boolean
	 * If param String is Palindrom returns true otherwise returns false
	 * 
	 * isPalindrom("civic") -> true
	 * isPalindorm("racecar") -> true
	 * 
	 */
	
	
	public static boolean isPalindrom(String word) {
		
		// reverse the String word first
		String reversed = "";
		
		for (int i = word.length()-1; i >= 0; i--) {
			reversed += word.charAt(i);
		}
		
		//compare if word and reversed are the same
		
		if(word.equalsIgnoreCase(reversed)) {
			return true;
		}
		
		return false;
		
		// Also we can say like this without if condition
		//return word.equalsIgnoreCase(reversed);
	}
	
	// VERSION 2 OF isPalindrom that will call reverse method
	
	//public static boolean isPalindromV2(String word) {
		
		//reverse(word).equalsIgnoreCase(word);
		
	//}
	
	

}
