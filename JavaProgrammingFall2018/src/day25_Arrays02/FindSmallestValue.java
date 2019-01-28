package day25_Arrays02;

public class FindSmallestValue {
	
	public static void main(String[] args) {
		
		int[] nums = {10, 3, 77, 23, 90, 1000, 43, 18, 29, 17};
		
		int smallest = nums[0];
		
		for (int num : nums) {
			if (num < smallest) {
				smallest = num;
			}
			
		}
		
		System.out.println("Smallest number is " + smallest);
	}

}
