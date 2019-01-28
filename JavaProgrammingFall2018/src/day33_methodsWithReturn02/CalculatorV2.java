package day33_methodsWithReturn02;

public class CalculatorV2 {
	
	// we are calling all these in class CompareCalculations
	
	public static double calculate(double n1, double n2, char operator) {
		switch(operator) {
		case '+':
			return Add(n1,n2);

		case '-':
			return Subtract(n1,n2);
			
		case '*':
			return Multiply(n1,n2);
			
		case '/': return Divide(n1,n2);
		
		default:
			throw new RuntimeException("ERROR: Invalid Operator " + operator);
		}
	}
	

	public static double Add(double num, double num2) {
		
		double result = num + num2;
		
		return result;
	}

	public static double Subtract(double num, double num2) {
		
		double result = num - num2;
		
		return result;
	}

	public static double Multiply(double num, double num2) {
		
		double result = num * num2;
		
		return result;
	}

	public static double Divide(double num, double num2) {
		
		double result = 0;
		
		if (num2 == 0) {
			System.out.println("Error: cannot divide by zero");
			return - 1;
		} else {
			result = num / num2;
		}
		return result;		
	}
	
}


