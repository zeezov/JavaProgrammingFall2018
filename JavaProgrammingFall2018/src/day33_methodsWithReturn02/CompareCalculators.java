package day33_methodsWithReturn02;


public class CompareCalculators {
	public static void main(String[] args) {
		
		// called this from day31
		//Calculator.Add(50, 5);
		
		//called this from day33
		double result = CalculatorV2.Add(3, 4);
		
		// check if result equals 7
		if(result == 7) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		
		// other way do it
		System.out.println(CalculatorV2.Add(30, 40));
		
		System.out.println(CalculatorV2.Divide(0,9));
		
		System.out.println(CalculatorV2.calculate(2,4,'*'));
		
	}

}
