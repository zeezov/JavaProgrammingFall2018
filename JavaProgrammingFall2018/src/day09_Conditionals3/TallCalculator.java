package day09_Conditionals3;

public class TallCalculator {
	public static void main(String[] args) {
		
		/*
		 * 0-100 -> $5.00
		 * 101 - 500 -> $8.00
		 * 501 - 1000 -> $10.00
		 * more thant $1000 -> $12
		 */
		
		System.out.println("==========Toll Calculator==========");
		
		int miles = 1;
		double tollCost = 0.0;
		
		if (miles > 0 && miles <= 100) {
			tollCost = 5;
		} else if (miles >= 101 && miles <= 500) {
			tollCost = 8;
		} else if (miles >= 501 && miles <= 1000) {
			tollCost = 10;
		} else if (miles >= 1000) {
			tollCost = 12;
		} else {
			System.out.println("Not Valid");
		}
		
		System.out.println(miles);
		System.out.println("$" + tollCost);
		
		
		
		
	}

}
