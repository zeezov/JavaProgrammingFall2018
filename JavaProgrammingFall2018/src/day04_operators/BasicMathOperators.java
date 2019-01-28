package day04_operators;

public class BasicMathOperators {
	public static void main (String[] args) {
		
		//create two variables and assign values
		
		int num1 = 100;
		int num2 = 200;
		
			System.out.println(num1 + num2); //300
			System.out.println(num1 + num2 + 1000); //1300

		int sum = num1 + num2 + 10;
			
			System.out.println("The sum is " + sum);
			System.out.println("===================");
			
			
		//create 3 variables: apples, carrots, tomatoes
		//add prices to it with decimals
		//create a variable called total and assign total price
		//also print the tax then add the tax to the total
		//print your total price with tax
		// tax is 0.06
			
		
		double apples = 10.55;
		double carrots = 3.87;
		double tomatoes = 6.23;
		
		double totalBeforeTax = apples + carrots + tomatoes;
			System.out.println("Total before Tax: " + totalBeforeTax);
			
		//calculate tax
			
		double tax = totalBeforeTax * 0.06;
			System.out.println("Total tax: " + tax);
			
		double grandTotal = totalBeforeTax + tax;
			System.out.println("Your grand total is $" + grandTotal);
		
			//used to make soace	
		System.out.println("");
		
		System.out.println("Nazim");
			
			
	}

}
