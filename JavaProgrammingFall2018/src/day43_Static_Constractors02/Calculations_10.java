package day43_Static_Constractors02;

public class Calculations_10 {
	public static void main(String[] args) {
		
		System.out.println(Calculator_09.add(5, 3));
		System.out.println(Calculator_09.minus(50, 3));

		// we have to use obect for multiply method becuase it is not static
		Calculator_09 HeydarsCalculator = new Calculator_09();
		
		System.out.println(HeydarsCalculator.multiply(4, 2));
		
		// we can still use object even if .add or .minus are static
		System.out.println(HeydarsCalculator.add(10, 30));
		System.out.println(HeydarsCalculator.minus(100, 30));
		
		//Calculator.operation = "add"; will not work
		
		HeydarsCalculator.operation = "math calculations";
		
		
		
	}

}
