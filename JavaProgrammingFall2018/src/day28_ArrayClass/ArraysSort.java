package day28_ArrayClass;

import java.util.Arrays;

public class ArraysSort {
	public static void main(String[] args) {
		
		// SORT method of Arrays class.
		
		int[] nums = {9,4,3,0,-4,5,3,10};
		
		for (int n : nums) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		Arrays.sort(nums);
		
		for (int n : nums) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		String[] names = {"Said", "John", "Asel", "Alisiya", "Mijat", "Tariq", "Z", "Khalili"};
		
		//ABCDEFGHIJKLMNOPQRSTUVWXYZ
		Arrays.sort(names);
		
		for (String name : names) {
			System.out.print(name + " ");
		}
		System.out.println();
		
		char[] charArray = {'c', 'C', 'D', 'A', '2'};
		
		Arrays.sort(charArray, 0 ,3); // partial sorting if needed
		
		for (char ch : charArray) {
			System.out.print(ch + " ");
		}
		
		
	}

}
