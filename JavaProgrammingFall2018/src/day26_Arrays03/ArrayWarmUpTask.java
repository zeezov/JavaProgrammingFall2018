package day26_Arrays03;

public class ArrayWarmUpTask {
	public static void main(String[] args) {

		/*
		 * Write a program called IncrementArrayValues:
		 * 1. Declare array nums and assign {1,2,3,4,5,6,7,8,9}
		 * 2. Print out all values in single line separated by space:
		 * 1 2 3 4 5 6 7 8 9
		 * 3. Using a Loop write some code to do the following:
		 * if the value is even - double it and assign back. If the value is odd -
		 * triple it and assign back.
		 * 4. Print out all values in single line separated by space
		 * 3 4 9 8 15 12 21 16 27
		 */
		
		int[] nums = {1,2,4,5,6,7,8,9};
		
		for (int i : nums) {
			System.out.print(i + "\t");
		}
			System.out.println();
			
		for (int k = 0; k < nums.length; k++) {
			if (nums[k] % 2 == 0) {
				nums[k] *= 2;
			} else {
				nums[k] *= 3;
			}
			// ternary option: nums[i] = (nums[k] % 2 == 0) ? nums[k] *= 2 : nums[k] *= 3;
			
		}
		
		for (int i : nums) {
			System.out.print(i + "\t");
		}
			System.out.println();
	
		
	}

}
