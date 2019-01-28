package day09_Conditionals3;

public class RushHourTollCalculator {
	public static void main(String[] args) {
		
		//NESTED IF EXAMPLE
		
		/* Normal Hours:
		 * 0-100 -> $5.00
		 * 101 - 500 -> $8.00
		 * 501 - 1000 -> $10.00
		 * more thant $1000 -> $12
		 * 
		 * RUSH HOURS:
		 * 0-100 -> $10.00
		 * 101 - 500 -> $16.00
		 * 501 - 1000 -> $20.00
		 * more thant $1000 -> $24
		 */
		
		boolean isRushHour = true;
		
		int miles = 2000;
		double tollCost = 0.0;
		
		if (miles > 0 && miles <= 100) {
			if (isRushHour == true) { // you can also just say if (isRushHour)
				tollCost = 10.0;
			} else {
				tollCost = 5.0;
			}
		} else if (miles >= 101 && miles <= 500) {
			if (isRushHour == true) {
				tollCost = 16.0;
			} else {
				tollCost =8.0;
			}
		} else if (miles >= 501 && miles <= 1000) {
			if (isRushHour == true) {
				tollCost = 20.0;
			} else {
				tollCost =10.0;
			}
		
		} else if (miles > 1000) {
			if (isRushHour == true) {
				tollCost = 24;
			} else {
				tollCost = 12;
			}
		}
		
		System.out.println("Toll Cost: " + tollCost);


			
	}
}
