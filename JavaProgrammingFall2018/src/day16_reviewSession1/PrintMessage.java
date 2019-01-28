package day16_reviewSession1;

public class PrintMessage {
	
	public static void main(String[] args) {
		
		System.out.println("--Welcome to Review Session--");
		System.out.println(32343); // you can print number without " ";
		System.out.println("Topic 1 is " + "Printing various messages");
		
		int balance = 100;
		System.out.println("Balance is " +  balance + 55);// will print 10055
		System.out.println("Balance is " + (balance + 55));// will add. will print 155
		
		//Print vs Println. Println adds new line at the end
		
		System.out.print("Today is ");
		System.out.print("Java review ");
		System.out.print("day1");
		
		System.out.println();//adding new line. Separating da1 with Today is
		
		System.out.println("Today is ");
		System.out.println("Java review ");
		System.out.println("day1");
		
		// \n, \t,
		// \ is called escape character. Used to say, hey treat next character  as is
		System.out.println("Next topic to review is \n datatypes");//will create new line
		System.out.println("Next topic to review is \\n datatypes");//will print in the same line
		
		System.out.println("Largest integer in Java is \"long\"");// will print "long" with quotes
		
		System.out.println("I want to buy 'wooden' spoon from \"etsy\"");
		
		
	}

}
