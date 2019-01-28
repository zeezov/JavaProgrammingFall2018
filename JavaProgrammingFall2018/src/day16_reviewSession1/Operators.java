package day16_reviewSession1;

public class Operators {
	public static void main(String[] args) {
		
		/*
		 * arithmetic operators: +, -, /, *, %
		 * shorthand assignment: +=, -=, /=, *=, %=
		 * incriment/decrement: --, ++
		 * comparison: >, >=, <, <=, ==, !=
		 * 
		 */
		
		/*
		 * distanceInMiles, pace (miles per hour) 
		 * how many minutes it will take to reach destination
		 * 
		 */
		
		double distance = 34;
		double pace = 20;
		
		double hours = distance / pace; 
		double minutes = 60 * hours;
		
		//you can also say: double hours = distance / pace * 60;
		
		System.out.println("It will take: " + minutes + " minutes to reach destination");
				
		//you spend 5 minutes in traffice
		minutes += 5.0;
		
		//You spend 1 minute extra coz you took a wrong turn
		minutes++;
		
		System.out.println("Finnaly it takes: " + minutes + " minutes");
		
		System.out.println("===========================================");
		
		int number = 10;
		System.out.println(number / 3); // 3
		System.out.println(number % 3); // 1
		
		System.out.println(number);
		++number; // add 1
		System.out.println(number);
		number++; // add 1
		System.out.println(number);//it is 12 now
		
		
		int num2 = number++; // 12 will be assigned to num2 first // ++number will make num2 13
		System.out.println(num2); // 12
		System.out.println(number);// 13
		
			  //13			14+1
		num2 = number++ + ++number; // 13 + 15 = 28
		System.out.println(num2); // 28
		System.out.println(number); // 15
	}

}
