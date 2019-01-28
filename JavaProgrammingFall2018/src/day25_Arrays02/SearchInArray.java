package day25_Arrays02;

public class SearchInArray {
	public static void main(String[] args) {
		
		/*
		 * create array nums and assign 10 different numbers to it
		 * search for a number 100 in it using a loop, once found print the index
		 * location and "value found at index" + index
		 * if that search value is not found print "100 not found in the array"
		 * One you found the first 100 then exit the loop at that point, we are looking for only first 100
		 */
		
		int[] nums = {10, 3, 77, 23, 90, 1000, 43, 18, 29, 17};
		int lookFor = 100;
		boolean found = false;
		
		for (int i = 0; i < nums.length; i++) {
			
			if (nums[i] == lookFor) {
				System.out.println(lookFor + " was found at index " + i);
				found = true;
				break;
			}
		
		}
		if (found == false) {
			System.out.println(lookFor + " not found");
		}
		
	}

}
