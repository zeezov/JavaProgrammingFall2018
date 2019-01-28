package day33_methodsWithReturn02;

public class StringMethods_ReverseString {
	
	public static void main(String[] args) {
		
		String reversedWord = reverse("reversed");
			System.out.println(reversedWord);
		
	}
	
	/* 
	 * Method: reverse
	 * Params: 1 String 
	 * Return type: String
	 * It reverses the Param String and returns the resul
	 */
	
	public static String reverse(String word) {
		
		String reversed = "";
		
		for (int i = word.length()-1; i >= 0; i--) {
			//reversed += word.charAt(i);
			reversed += word.substring(i, i+1);
		}
		return reversed;
		
	}

}
