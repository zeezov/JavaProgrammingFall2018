package day04_operators;

import java.util.Scanner;

public class TemperatureConverter {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
			System.out.println("Enter Fahrenheit Degree ");
		//you can also make it double so you can enter 55.5 fahrenheit
		int fahrenheit = scan.nextInt();
		double celcius = (5.0 / 9) * (fahrenheit - 32);
			//you cam make it show int only result by putting +(int)celcius in code
			System.out.println("Temperature in Celciuse: " + celcius);
		
		scan.close();
		
	}

}
