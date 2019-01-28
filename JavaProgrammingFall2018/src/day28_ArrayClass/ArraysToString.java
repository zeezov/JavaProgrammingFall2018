package day28_ArrayClass;

import java.util.Arrays;


public class ArraysToString {
	public static void main(String[] args) {
		// toString is present in all java classes
		// and it is used to describe the object 
		
		int[] nums = {7,32,5,23};
		
		System.out.println(Arrays.toString(nums));
		
		// sort this array
		
		Arrays.sort(nums);
		
//		for (int arr : nums) {
//			System.out.print(arr + " ");
//		}
		System.out.println();
		
		System.out.println(Arrays.toString(nums));
		
		
	}

}
