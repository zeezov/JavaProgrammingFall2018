package day33_methodsWithReturn02;

import java.util.Arrays;
import java.util.Random;

public class ArrayMethods {
	public static void main(String[] args) {
		
		//Version 1
		System.out.println(Arrays.toString(getIntArray()));
		
		//Version 2
		System.out.println(Arrays.toString(getIntArray2()));
		
		/*
		 *  Create 2 arrays using getIntArray method and 
		 *  compare SUMS of both and print out which one is larger
		 */
		
		int[] nums1 = getIntArray();
		int[] nums2 = getIntArray();
		
		int sumOfNums1 = 0, sumOfNums2 = 0;
		
		for (int num : nums1) {
			sumOfNums1 += num;
		}
		
		for (int num : nums2) {
			sumOfNums2 += num;
		}
		
		if (sumOfNums1 > sumOfNums2) {
			System.out.println("First Array Sum is larger: " + sumOfNums1);
			System.out.println("Second Arrasy Sum: " + sumOfNums2);
		} else if (sumOfNums1 < sumOfNums2) {
			System.out.println("First Array Sum is larger: " + sumOfNums2);
			System.out.println("Second Arrasy Sum: " + sumOfNums1);
		} else {
			System.out.println("Sum of both Arrasy are equal. First Array: " + sumOfNums1);
			System.out.println("Sum of both Arrasy are equal. Second Array: " + sumOfNums2);
		}
		
	}
	
	/*
	 * Write a method that returns array
	 * Method: getIntArray
	 * Param/Args: nothing
	 * Returns: int array
	 * 
	 * Creates an array with 5 ints and assigns random numers,
	 * betwwin 0 - 100 then returns that array
	 * 
	 * Exp:
	 * 
	 * getIntArray() -> [43, 23, 54, 1, 89]
	 * 
	 */
	
	public static int[] getIntArray() {
		
		Random random = new Random();
		
		int num1 = random.nextInt(101);
		int num2 = random.nextInt(101);
		int num3 = random.nextInt(101);
		int num4 = random.nextInt(101);
		int num5 = random.nextInt(101);
		
		int[] number = {num1, num2, num3, num4, num5};
		Arrays.sort(number); // this will sort the number from small to large
		return number;
	}
	
	// Version #2 with loop
	
	public static int[] getIntArray2() {
		
		int[] nums = new int [5];
		
		Random random = new Random();
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = random.nextInt(101);
		}
		
		return nums;
		
		// another way of doing it
		
//		int[] nums2 = {random.nextInt(101),
//					   random.nextInt(101),
//					   random.nextInt(101),
//					   random.nextInt(101),
//					   random.nextInt(101)};
		
		
		
	}
	
	
}
