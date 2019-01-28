package homeWork_10_07;

public class _07_BiggestNumberInArray {
	public static void main(String[] args) {

		/*
		 * 7)get the biggest number in an int array using a loop and print the biggest
		 * number to console. use this loop: 
		 * int[] nums = new int[]{60,73,9,15,200,350};
		 */
		
		int[] nums = new int[]{600,73,9,15,200,350};
		
		int biggestNumber = nums[0];
		
		for (int n : nums) {
			if (n > biggestNumber) {
				biggestNumber = n;
			}
		}
		
		System.out.println(biggestNumber);
	}

}
