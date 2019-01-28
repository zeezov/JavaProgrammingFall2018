package day26_Arrays03;

public class NestedLoops {
	public static void main(String[] args) {

		/*
		 * Given an array of ints nums
		 * 
		 * [1, 2, 3, 4, 2, 3, 4, 44, 12, 20, 100, 33, 100, 4]
		 * 
		 * Using a nested loop print only values that appear once(true meaning of
		 * unique):
		 * 
		 * 1 44 12 20 33
		 * 
		 * Do not use any strings!
		 */
		
		int[] nums = {1, 2, 3, 4, 2, 3, 4, 44, 12, 20, 100, 33, 100, 4};
		
		// take a number from array
		// compare with the rest of numbers in the array. if no matches found
		// it is unique and print it out
		
		// take a number from array
		// create a variable currentNumber and assing 0 to it. int counter = 0;
		// compare the number with all other numbers (dont compare the number with itself)
		// if  a match found counter++, if not dont touch the couner
		// check if counter is still 0, if yes, print that number because it is a unique.
		
		for (int outer = 0; outer < nums.length; outer++) {
			int currentNumber = nums[outer];
			boolean unique = true;
			
			for (int inner = 0; inner < nums.length; inner++) {
				if (nums[inner] == currentNumber && outer != inner) {
					unique = false;
					break;
				}
			}
			
			if (unique) {
				System.out.print(currentNumber + " ");
			}
		}


	}

}
