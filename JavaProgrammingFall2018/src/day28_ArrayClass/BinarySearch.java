package day28_ArrayClass;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		
		String[] words = {"cake","tomato", "wooden spoon" , "pizza", "apples"};
		
		System.out.println("Original: " + Arrays.toString(words));

		Arrays.sort(words);
		System.out.println("Sorted: " + Arrays.toString(words));
		
		System.out.println();
		
		//find the index of pizza in the words array
		System.out.println(Arrays.binarySearch(words, "pizza"));
		
	}

}
