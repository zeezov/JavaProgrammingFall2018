package day07_conditionals;

public class IfElseStatement {
	public static void main(String[] args) {
		
		double coffeePrice = 8.50;
		
		if (coffeePrice < 6.0)  {
			System.out.println("I will get a coffee ");
		} else {
			System.out.println("I will not get coffee. Too expensive ");
		}
		
		double accountBalance = 450.50;
		double price = 700;
		
		//if you have enought money, you buy the item
		//otherwise you say not enough balance
		
		if (price <= accountBalance) {
			System.out.println("Not enought balance ");
			System.out.println("I am ordering online ");
		} else {
			System.out.println("You bought the item ");
			System.out.println("Lets wait for paycheck ");
		}
		
		/* 
		 * 2 variables: speedLImit, currentSpeed
		 * if currentSpeed is more than 20 mph compared to speedLimit
		 * than you are getting a speedint ticket
		 * otherwise keep driving
		 */
		
		int speedLimit = 50;
		int currentSpeed = 70;
		
		if (speedLimit <= currentSpeed) {
			System.out.println("You are getting a ticket ");
		} else {
			System.out.println("Keep driving");
		}
		
		System.out.println("==========");
		
		/*
		 * create a boolean variable isPrime
		 * if isPrime is true then shipping is 0.0
		 * if not then shipping is $7.99
		 * print shipping cost 
		 */
		
		
	}

}
