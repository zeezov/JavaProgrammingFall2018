package day25_Arrays02;

import java.util.Scanner;

public class FindLargestInArray {
	public static void main (String[] args) {
		
		// Ask user to enter how many items in array
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many items in array");
		int count = input.nextInt();
		
		//create array called nums with that capasity
		int[] nums = new int[count];
		
		//using a loop enter value one by one
		for (int i = 0; i < count; i++) {
			System.out.println("Enter a number " + (i+1));
			nums[i] = input.nextInt();
		}
		
		//print all items in same line using for each loop
		for (int n : nums) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		//find an array and find the largest value
		int largest = nums[0];
		for (int num : nums) {
			if (num > largest) {
				largest = num;
			}
		}
		
		System.out.println("Largest value: " + largest);
		
	}

}
