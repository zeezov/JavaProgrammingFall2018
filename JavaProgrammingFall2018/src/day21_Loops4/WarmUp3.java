package day21_Loops4;

public class WarmUp3 {
	public static void main(String[] args) {
		
		
		//find unique Chars

		/*
		 * 3. Accept a String and print only unique characters in the String:
		 * Enter word:
		 * java
		 * jav
		 * aabcddee
		 * abcde
		 */
		
		//TODO make it again using charAt
		
		String word = "Javaaaaaa";
		String unique = "";
		
		for (int i = 0; i < word.length(); i++) {
			//word.substring(i, i+1);
			if(!unique.contains(word.substring(i, i+1))) {
			unique += word.substring(i, i+1);
		}	
		
		}
		System.out.println(unique);
		
		
	}

}
