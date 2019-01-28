package day09_Conditionals3;

public class rangeTests {
	public static void main(String[] args) {
		
		
		//check if students are more than or equal 5 or less than 30
		//if true print "Lest do mentoring session"
		//if students more than or equall to 30 or less than or equal to 60 print -
		//lets have a lecture
		//if more than 60: 
		//print how many students need to take class online
		
		int students = 60;

		
		if (students >= 5 && students < 30) {
			System.out.println("Lets do mentoring sessions");
		} else if (students >= 30 && students <= 60) {
			System.out.println("Lets have a lecture");
		} else if (students > 60) {
			int online = students - 60;
			System.out.println(online + " students need to join class online");
			//if students less than 5 we enter else 
		} else {
			System.out.println("Students need to me more than or equal to 5");
		}
		
	}

}
