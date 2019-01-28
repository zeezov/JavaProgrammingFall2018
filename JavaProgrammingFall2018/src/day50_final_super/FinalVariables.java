package day50_final_super;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// #1

public class FinalVariables {
	
	private final String SCHOOL_NAME; // = "CyberTek";
	public static final int MAX_NUMBER_OF_STUDENTS = 50;
	public static final String FEBRUARY = "February";
	
	public FinalVariables() {
		SCHOOL_NAME = "CyberTek";
	}
	
	
	public static void main(String[] args) {
		
		final int MAX = 100;
		//MAX = 110; we cant change the value of the final variable
		
		System.out.println(MAX);
		
		// fanal array
		final int[] NUMS = new int[] {100, 300, 400};
		
		NUMS[0] = 500;
		
		System.out.println(Arrays.toString(NUMS));
		
		// you cant create new copy of array when using final
		//NUMS = new int[2];
		
		// final ArrayList
		final List<String> PRODUCTS = new ArrayList<>();	
		
		PRODUCTS.add("Water");
		PRODUCTS.add("Cookies");
		PRODUCTS.add("Coffee");
		
		System.out.println(PRODUCTS);
		
		
		
		
	}

}
