package day28_ArrayClass;

import java.util.Arrays;

public class PrintFirstAndLast {
	public static void main(String[] args) {
		
		String[] words = {"Hello", "Hi", "Salom", "Jahongir"};
		
		for (String k : words) {
			System.out.println(k.charAt(0) + "" + k.charAt(k.length()-1));
		}
		
		
		
		for (int i = 0; i < words.length; i++) {
			words[i] = words[i].substring(0,1) + words[i].substring(words[i].length()-1);
		}
		
		System.out.println(Arrays.toString(words));
		
	}

}
