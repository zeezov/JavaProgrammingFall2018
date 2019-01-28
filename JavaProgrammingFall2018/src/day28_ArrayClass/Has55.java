package day28_ArrayClass;

public class Has55 {
	public static void main(String[] args) {
		
		int[] nums = {2,4,35,45,15,100,5,5,5};
		
		boolean found = false; 
		
		for (int i = 0; i < nums.length-1; i++) {
			if (nums[i] == 5 && nums[i + 1] == 5) {
				found = true;
				break;
			}
		}
		System.out.println(found);
		
		//nums[i+1] -> if i is 1, we are making it 2 and reading index 2.
		//nums[i] + 1 -> read the value in the arrays and add 1 to it. 
		//     5  + 1 -> 6.
		
	}
}
