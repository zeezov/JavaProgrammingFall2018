package day31_Methods02;

import java.util.Arrays;

public class MethodsWithConditions {
	public static void main(String[] args) {
		
		getLarger(-1,5);
		int[] arr =  {100,30,40};
		getMax(arr);
		// another way
		getMax(new int[] {3234,343,325,353});
		
		steps(-5);
		
	}
	
	/* 
	 * Create a method that accepts 2 numbers and prints the largest one
	 * if the are equal it prints "Numbers are equal"
	 */
	
	public static void getLarger(int num1, int num2) {
		if (num1 > num2) {
			System.out.println(num1 + " is Largest");
		} else if (num1 < num2) {
			System.out.println(num2 + " is Largest");
		} else if (num1 == num2) {
			System.out.println("Numbers are equal");
		} 
	}
	
	/*
	 *  Create a method getMax - than accpets int Array and print largest number in the Array
	 *  if array is empty, print "Error: Array is empty"
	 */
	
	public static void getMax(int[] num) {
		if (num.length == 0){
			System.out.println("Error: Array is empty");
			return;
		}
		
		Arrays.sort(num);
		
		System.out.println(num[num.length-1]);	
	}
	
	/*
	 * Create a method steps. It accepts an int parameter
	 * if the parameter is negative then we print "jump" that many times
	 * 
	 */
	
	public static void steps(int nums) {
		
		if (nums == 0) {
			System.out.println("Sit");
		} else if (nums > 0) {
			for (int i = 1; i <= nums; i++) {
				System.out.println("Step " + i);
			}
		} else if (nums < 0) {
			for (int n = 1; n <= -nums; n++) {
				System.out.println("Jump " + n);
			}
		}
	}

}
