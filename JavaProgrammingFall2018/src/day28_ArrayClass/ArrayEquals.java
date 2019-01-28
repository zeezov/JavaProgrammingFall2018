package day28_ArrayClass;

import java.util.Arrays;

public class ArrayEquals {
	public static void main(String[] args) {
		
		// Equals method in Arrays class
		// When 2 arrays with same length and same order of elements
		// then they are equal
		
		int[] a = {10,20,30};
		int[] b = {10,20,30};
		int[] c = {10,20,30,40};
		int[] d = {10,20,40,30};
		
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.equals(b, c));
		System.out.println(Arrays.equals(c, d));
		
		// Sort the D array and compare it with c
		
		Arrays.sort(d);
		
		System.out.println(Arrays.equals(c, d));
		
		// Use operators to compare instead of equals
		System.out.println(a == b); // false
		
		int[] j = a;
		
		System.out.println(Arrays.toString(j));
		System.out.println(a == j); // true
		
		j[0] = 1000;
		
		System.out.println(Arrays.toString(j));
		System.out.println(Arrays.toString(a));


		
	}

}
