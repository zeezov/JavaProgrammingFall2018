package warmUp;

public class FindNonDuplicate {
	public static void main(String[] args) {

		/*
		 * Given an array nums with 7 integers every element is repeated twice - except
		 * one. Find that element and print it to console.
		 */

		int[] nums = { 1, 1, 2, 3, 4, 3, 4 };

		for (int i = 0; i < nums.length; i++) {
			int count = 0;

			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(nums[i]);
			}
		}

		// System.out.println(nums[i]);

	}

}
