package day28_ArrayClass;

public class CountEvens {
	public static void main(String[] args) {
		
		int [] nums = {2,1,2,3};
		
		int counter = 0;
		
		for (int i : nums) {
			if (i % 2 == 0) {
				counter++;
			}
		}
		
		System.out.println(counter); // always put outside of for each loop.
		
	}

}
