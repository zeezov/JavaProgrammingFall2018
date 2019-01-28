package day43_Static_Constractors02;

public class Calculator_09 {
	
	public String operation;
	
	public static double add(double num1, double num2) {
		return num1 + num2;
	}
	
	public static double minus(double num1, double num2) {
		return num1-num2;
	}
	
	public double multiply(double num1, double num2) {
		operation = "multiply";
		return num1 * num2;
	}
	
	public static void multiply2(double num1, double num2) {
		//System.out.println(multiply(num1,num2)); will not work
	}

}
