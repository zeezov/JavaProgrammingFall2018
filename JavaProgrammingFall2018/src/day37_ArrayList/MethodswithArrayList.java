package day37_ArrayList;

import java.util.*;

public class MethodswithArrayList {
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(1000);
		numbers.add(4000);
		numbers.add(10000);
		
		int result = sumList(numbers);
		System.out.println(result);
		
		// second method
		
		List<Integer> myNums1 = new ArrayList<>();
		
		myNums1.add(100);
		myNums1.add(400);
		myNums1.add(1000); 
		
		List<Integer> myNums2 = new ArrayList<>();
		
		myNums2.add(543);
		myNums2.add(10);
		
		int sumResult = sum2List(myNums1, myNums2);
		System.out.println(sumResult);
		
		// third method
		
		System.out.println(buildIntList(10));
		
		ArrayList<Integer> randomList = buildIntList(10);
		
		System.out.println(randomList);
		
		System.out.println(sumList(  buildIntList(10) ) );

		
		
		
		
	}
	
	// how to write a method that accepts ArrayList
	// calculate the sum of values an return
	public static int sumList(ArrayList<Integer> nums) {
		
		int sum = 0;
		
		//option 1
		
//		for (int n : nums) {
//			sum += n;
//		}
		
		for(int i = 0; i < nums.size(); i++) {
			sum += nums.get(i);
		}
		
		return sum;
		
	}
	
	/*
	 * method : sum2Lists
	 * Args: 2 Integer arraylist
	 * return type: int
	 * Sum of both ArrayLists
	 */
	
	public static int sum2List(List<Integer> nums1, List<Integer> nums2) {
		
		int sum = 0;
		
		for (int n : nums1) {
			sum += n;
		}
		
		for (int n : nums2) {
			sum += n;
		}
		
		return sum;
		
	}
	
	/*
	 *  How to write a method that returns a ArrayList of integers
	 *  
	 *  Method name: buildIntlist
	 *  Return type: ArrayList of integers
	 *  Args: int
	 *  
	 *  This method gets an int and create an arraylist with that many random
	 *  numbers between 0 - 100 and retuns it
	 */
	
	public static ArrayList<Integer> buildIntList(int count) {
		
		Random random = new Random();
		ArrayList<Integer> returnList = new ArrayList<>();
		
		for (int z = 1; z <= count; z++) {
			returnList.add(random.nextInt(10));
		}
		
		return returnList;
		
	}
	

}
