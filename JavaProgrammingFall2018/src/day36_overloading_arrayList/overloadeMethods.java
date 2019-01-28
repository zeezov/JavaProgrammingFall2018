package day36_overloading_arrayList;

public class overloadeMethods {
	public static void main(String[] args) {
		
		System.out.println( add(3, 4) ); // int return
		System.out.println( add(3, 4, 5) ); // double return
		
		System.out.println(playGame(3, "soccer"));
		
		System.out.println(work("sdet"));
		
		System.out.println(work(160));
		
	}
	
	/*
	 *  2 methods : add
	 *  1. add
	 *  	params: 2 ints
	 *  	return: int
	 *  2. add
	 *  	params: 3 double
	 *  	returns double
	 */
	
	public static int add(int n1, int n2) {
		return n1 + n2;
	}
	
	public static double add(double n1, double n2, double n3) {
		return n1 + n2 + n3;
	}
	
	/*
	 *  Method: playGame
	 *  1. Name: playGame
	 *  	Params: int, String
	 *  	return boolean
	 *  2. Name: playGame
	 *  	Params: String, int
	 *  	return boolean
	 *  
	 *  gamename, numberOfPlayers
	 *  print Playing [game] with [that many] players
	 *  if number of players more >= then return true
	 */
	
	public static boolean playGame(int n1, String str) {
		
		System.out.println("Playing <" + str + "> with <" + n1 + "> players ");
		
		return n1 >= 2;
	}
	
	public static boolean playGame(String str, int n1) {
		
		System.out.println("Playing " + str + " with " + n1 + " players " );

		if (n1 >= 2) {
			return true;
		} 
		return false;
		
	}
	
	/* 
	 * Method: work
	 * 1. params string. JobType
	 * 		returns boolean. if job is sdet or develper, then true else false
	 * 		print: working as JobType and its is fun
	 * 2 params int. hours
	 * 		returns double salary = hours + 60;
	 * 		print: Worked this many hours and made that much income
	 */
	
	public static boolean work(String jobType) {
		
		System.out.println("Working as " + jobType + " and it is fun");
		
		return jobType.equalsIgnoreCase("sdet") || jobType.equalsIgnoreCase("developer");
		
	}
	
	public static double work(int hours) {
		
		double salary = hours * 14.4; // my current salary 10/27/18
		double perYear = salary * 12;
		System.out.println("Worked " + hours + " hours a month and made " + salary 
							+ " a month and " + perYear + " a year :((" );
		
		return salary;
	}

}
