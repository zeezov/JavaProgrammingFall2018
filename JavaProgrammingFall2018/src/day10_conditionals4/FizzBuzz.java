package day10_conditionals4;

public class FizzBuzz {
	public static void main(String[] args) {
		
		/*
		 * If number is devisable by 3,(no remainder) print "Fizz" instead of the number
		 * If number is devisable by 5, (no remainder) print "Buzz" instead of the number
		 * For number which are multiples of both 2 and 5, print "FizzBuzz"
		 * instead of number
		 * Else print number itself
		 * 
		 */
		
		int number = 15;
		
		
		
		if (number % 3 == 0 && number % 5 == 0) {
			System.out.println("FizzBuzz");
		} else if (number % 3 == 0) {
			System.out.println("Fizz");	
		} else if (number % 5 == 0) {
			System.out.println("Buzz");
		} else {
			System.out.println(number);
		}
		
	}

}
