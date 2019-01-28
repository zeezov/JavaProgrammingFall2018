package day25_Arrays02;

public class ArrayPrintReverse {
	public static void main (String[] args) {
		
		/*
		 * Create an int array points and assign 10 differnce numbers
		 * between 0 - 100
		 */
		
		int[] points = {10, 3, 77, 23, 90, 100, 43, 18, 29, 17};
		
		//check if 10 points and say 10 points found
		if (points.length == 10) {
			System.out.println("10 points found");
		} else {
			System.out.println("We need 10 points");
		}
		
		// 1.Using a for loop print each item in reverse order in same line
		// separetated by space.
		// 2. Using a while loop print each item in reverse order in same line
		// separetated by space.
		
		for (int i = points.length - 1; i >= 0; i--) {
			System.out.print(points[i] + " ");
		}
		
		System.out.println();
		System.out.println("==========Using While Loop==========");
		
		int idx = points.length-1;
		while (idx >= 0) {
			System.out.print(points[idx] + " ");
			idx--;
		}
		
	}

}
