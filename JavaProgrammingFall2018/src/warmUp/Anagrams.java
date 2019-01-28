package warmUp;

import java.util.Arrays;

public class Anagrams {
	public static void main(String[] args) {
		
		String str1 = "Java";
		String str2 = "avaJ";
		
		System.out.println(anagramCheck(str1, str2));

	}

	public static boolean anagramCheck(String word1, String word2) {

		char[] w1 = word1.toCharArray();
		char[] w2 = word2.toCharArray();

		Arrays.sort(w1);
		Arrays.sort(w2);

		return Arrays.equals(w1, w2);
	}

}
