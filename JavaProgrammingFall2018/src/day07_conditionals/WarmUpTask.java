package day07_conditionals;

//programm that converts USD to UER
//and UER to USD

import java.util.Scanner;

public class WarmUpTask {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter US amount: $");
			double usAmount = scan.nextDouble();
			
			double usd2eurExchangeRate = usAmount * 0.86;
			double eur2usdExchangeRate = 1.17 * usAmount;
			
			
			System.out.println(usAmount + " USD " + usd2eurExchangeRate + " EUR");
			System.out.println(usAmount + " EUR " + eur2usdExchangeRate + " USD");
			
		scan.close();
		
	}

}
