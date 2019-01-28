package repl.it;

import java.util.Arrays;

import day28_ArrayClass.ArraysToString;

public class addTwoArrays {
	public static void main(String[] args) {

		int[] arr1 = {44,55,66,77,65};
		int[] arr2 = {55,45,67,78,87};
		
		int[] arr3 = addElement(arr1,arr2);
		
		System.out.println(Arrays.toString(arr3));
		
	}

	/*
	 * Method addElements accepts 2 int arrays and adds each element value of two
	 * arrays and returns a new array.
	 * 
	 * addElements(new int[][10, 40, 50, 3, 1], new int[][11, 0, 500, 44, 1101]);
	 * -------- return array after adding values in the arrays: [21, 40, 550, 47,
	 * 1102]
	 * 
	 * each arg arrya has 5 elements
	 * 
	 * 1 -> 1,2,3,4,5
	 * 2 -> 11,22,33,44,55
	 * 
	 * 
	 */
	
	public static int[] addElement(int[] ints1, int[] ints2) {
		// create a new array here
		
		int[] newArray = new int[ints1.length];
		
		// go to each element in arrays and add them
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = ints1[i] + ints2[i];
		}
		
		return newArray;
		
	}

}
