package day38_WrapperClasses;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxingVsUnboxing {

	public static void main(String[] args) {
		
		// AUTO Boxing. Take primitive and convert into Wrapper Class object.
		
		int i = 1000;
		Integer j = i;
		
		System.out.println(j);
		
		Double d = 34.2;
		
		boolean b = true;
		Boolean b2 = b;
		
		List<Integer> nums = new ArrayList<>();
		
		nums.add(433);
		int p = 555;
		nums.add(p); // auto boxing
		nums.add(new Integer(77));
		
		System.out.println(nums);
		
		// unboxing
		// Taking the Wrapper class object and converting into
		// primitive and it happens automaticly
		int r = nums.get(0);
		
		
		// another example for unboxing
		Boolean bool = new Boolean(false);
		boolean boolPrimitive = bool;
		System.out.println(boolPrimitive);
		
		
		// another example for unboxing
		Character chObject = '^'; // auto - boxing from char ==> Character
		char chPrimitive = chObject;
		System.out.println(chPrimitive);
		
		Character char3 = new Character('_'); // no Boxing, just create Character object
		
		char ch7 = char3; // take char3 Character object and UNBOX to char primitive and 
						  // assign to ch7.
		
		Integer intValue = new Integer(400);
		int intPrimitive = 400;
		
		if (intValue == intPrimitive) { // UNBOXING ==> intValue is unboxed to primitive. Then compared
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
		
		
		
		

	}

}
