package day08_conditionals2;

public class MultiWayIfStatement {
	public static void main (String[] args) {
		
		int weekday = 1;
		
			if (weekday == 1) {
				System.out.println("Monday");
			} else if (weekday == 2) {
				System.out.println("It is Tuesday");
			} else if (weekday == 3) {
				System.out.print("It is Wednesday");
			} else if (weekday == 4) {
				System.out.println("It is Thursday");
			} else if (weekday == 5) {
				System.out.println("It is Friday");
			} else if (weekday == 6) {
				System.out.println("It is Saturday");
			} else if (weekday == 7) {
				System.out.println("It is Sunday");
			} else {
				System.out.println("Invalid day. Can be only 1-7");
			}
			
			
		
		
	}

}
