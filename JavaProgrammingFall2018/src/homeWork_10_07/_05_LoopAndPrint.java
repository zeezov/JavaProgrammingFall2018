package homeWork_10_07;

import java.util.Arrays;

public class _05_LoopAndPrint {
	public static void main(String[] args) {

		/*
		 * 5)loop and print to the console the numbers from this array: 
		 * int[] nums = new int[] {5,4,3,7,8,11};
		 */
		
		int[] nums = new int[] {5,4,3,7,8,11};
		
		System.out.println(Arrays.toString(nums));
		
		
		System.out.println();
		
		for (int n : nums) {
			System.out.print(n + ", ");
		}
		
		
	}

}
