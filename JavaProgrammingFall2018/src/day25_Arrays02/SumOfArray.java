package day25_Arrays02;

public class SumOfArray {
	public static void main(String[] args) {
		
		/*
		 * Creat variable nums and assing several values using a loop calculate the sum
		 * and print it.
		 * ADDITIONAL:
		 * 		-calculate sum of even numbers
		 * 		-calculate sum of odd numbers
		 */
		
		int[] nums = {10, 3, 77, 23, 90, 1000, 43, 18, 29, 17};
		
		int sum = 0;
		int sumOfEvens = 0;
		int sumOfOdds = 0;
		
		for (int n : nums) {
			sum += n;
			
			if (n % 2 == 0) {
				sumOfEvens += n;
			} else {
				sumOfOdds += n;
			}
		}
		
		System.out.println("Sum is: " + sum);
		System.out.println("Sum of Even is: " + sumOfEvens);
		System.out.println("Sum of Odd is: " + sumOfOdds);
		
		
		
		
	}

}
