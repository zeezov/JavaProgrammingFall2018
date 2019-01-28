package day10_conditionals4;

public class findTheSeason {
	public static void main(String[] args) {
		
		/*
		 * find the season
		 * month -> number and find the season of the year for that month number
		 */
		
		
		int month = 1;
		
		if (month >= 3 && month <=5) {
			System.out.println("Current season is: Spring");
		} else if (month >= 6 && month <= 8) {
			System.out.println("Current seasin is: Summer");
		} else if (month >= 9 && month <= 11) {
			System.out.println("Current season is: Fall");
		} else if (month == 12 || month == 1 || month == 2) {
			System.out.println("It is winter");
		} else {
			System.out.println("Invalid data");
		}
		
		
	}

}
