package day16_reviewSession1;

public class BooleanWithAndWithout_IF {
	public static void main(String[] args) {
		
		/*
		 * <, <=, >, >=, !=
		 * &&, ||, !, ^
		 * & will test both conditions all the time.   
		 * && (short circuit)
		 * 5 > 6 & 4 > 5 -> false
		 * 5 > 6 && 4 > 5 -> false, and will not test the second condtions
		 * 6 > 3 && 4 > 5 -> false, will test both. Because first is true and second one 
		 * needs to be tested as well.
		 * 
		 * |   
		 * false | true -> true
		 * 5 > 6 || 4 > 5 -> false
		 * 6 = 6 || 3 == 1 -> true and 3 == 1 will not be tested
		 * 
		 * || (short circuit)
		 * 
		 */
		
		boolean b = 12 > 10;
		System.out.println(b);
			//true       true
		b = 12 > 10 && 10 < 15;
		System.out.println(!b); //false
		//b = !b; // the only way to make b false
		System.out.println(b);
		
		System.out.println("======================================");
		
		//22100 - 22200
		int zipCode = 21999;
		
		if (zipCode >= 22100 && zipCode <= 22200) { //when you use only one & it will check both conditions
			System.out.println("McLean");
		} else {
			System.out.println("Not McLean");
		}
		
		System.out.println("==========================================================");
		
		
		
		
		
		
		
		
	}

}
