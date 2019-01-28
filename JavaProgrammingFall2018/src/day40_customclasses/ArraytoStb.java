package day40_customclasses;

import java.util.Arrays;

public class ArraytoStb {
	public static void main(String[] args) {
		
		String[] words = new String[5];
		
		words[0] = "java";
		words[1] = "coffee";
		words[2] = "tea";
		words[3] = "water";
		words[4] = "milk";
		
		System.out.println(Arrays.toString(words));
		
		// put all into String without brackets and colons
		
		// creating StringBuilder
		
		StringBuilder wordsStb = new StringBuilder();
		
		// without loop if you have fixed number of values is String[]
		
		wordsStb.append(words[0])
				.append(words[1])
				.append(words[2])
				.append(words[3])
				.append(words[4]);
		
		System.out.println(wordsStb);
		
		// add everyting into StringBuilder using loop
		
		StringBuilder wordsBuilder = new StringBuilder();
		
		for (String drink : words) {
			wordsBuilder.append(drink);
		}
		
		System.out.println(wordsBuilder);
		
		
		
		
		
	}
	

}
