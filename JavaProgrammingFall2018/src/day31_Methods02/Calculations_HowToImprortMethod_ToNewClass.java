package day31_Methods02;

public class Calculations_HowToImprortMethod_ToNewClass {
	public static void main(String[] args) {
		
		//lets add 1234 + 400 using add method of Calculator class
		
		Calculator.Add(1234, 400);
		
		//we are mentioning the class name because divide method is not in the same class
		Calculator.Divide(500, 10);
		
	}

}
