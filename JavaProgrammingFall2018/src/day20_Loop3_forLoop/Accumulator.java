package day20_Loop3_forLoop;

public class Accumulator {
	public static void main(String[] args) {
		
		/*
		 * Write a program to calculate sum of all numbers
		 * between 1 and 5
		 * 1,+ 2,+ 3,+ 4,+ 5 -> 15
		 */
		
		int sum = 0;
		
		for (int i = 1; i <= 5; i++) {
			sum = sum + i;
		}
		
			System.out.println("Sum is " + sum);
			
			/*
			 * Program to calculate the sum of all odd and even numbers
			 * between zero and 100
			 * sumofOdds -> should have all sum of odd numbers
			 * sumofEvens - should have all sum of even numbers
			 */
		
			int sumOfOdds = 0;
			int sumOfEvens = 0;
			
			for (int i = 0; i <= 100; i++) {
				if (i % 2 == 0) {
					sumOfEvens = sumOfEvens + i; // also sumOfEvens += i;
				} else {
					sumOfOdds = sumOfOdds + i;
				}
				
			}
			
			System.out.println("Odds " + sumOfOdds);
			System.out.println("Evens " + sumOfEvens);
	}

}
