package day33_methodsWithReturn02;


public class ConverterUtility {
	public static void main(String[] args) {
		
		double kmValue = miles2Km(3);
			System.out.println(kmValue);
		
		int celciusValue = fahrenheitToCelcius(-5);
			System.out.println(celciusValue);
			
		
	}

	// Write a method: miles2Km, accepts  miles and returns km value
	// return type: double
	// params: 1 double
	
	public static double miles2Km(double miles) {
		
		// we have call other class to calculate this
		double kms = CalculatorV2.Multiply(miles, 1.60934);
		
		
		//double kilometers = miles * 1.60934;
		
		return kms;
		
	}
	
	/*
	 * Method name: fahrenheitToCelcius
	 * Action: accepts fahrenheit and returns Celcius value
	 * Return type: int
	 */
	
	public static int fahrenheitToCelcius(int fahrenheit) {
		
		int celcius = (fahrenheit - 32) * 5/9;
		
		return celcius;	
	}
	
}
