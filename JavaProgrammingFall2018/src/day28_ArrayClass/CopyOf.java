package day28_ArrayClass;

import java.util.Arrays;

public class CopyOf {
	public static void main(String[] args) {

		int[] a = {10, 20, 30};
		int[] b = Arrays.copyOf(a, 2);

		System.out.println(Arrays.toString(b)); // will print [10, 20]

		int[] c = Arrays.copyOf(a, 5);

		System.out.println(Arrays.toString(c)); // will print [ 10, 20, 30, 0, 0]
		
		System.out.println("------------------------------");
		
		a = Arrays.copyOf(a,4); // to change the size Array (we are adding additinal number)
		
		System.out.println(Arrays.toString(a)); // will print [10,20,30,0]
		
		a[3] = 100; // to assing a new number to empty element '0'; // it is a[3] because position of 3 is 0
		
		System.out.println(Arrays.toString(a)); // now will print [10,20,30,100]


	}

}
