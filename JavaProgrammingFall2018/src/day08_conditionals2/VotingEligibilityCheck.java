package day08_conditionals2;

public class VotingEligibilityCheck {
	public static void main (String [] args) {
		
		/* Create a variable called age of type int
		 * check if value of age is 18 or more,
		 * true => you are eliginble to vote
		 * false -> you are not eligle to vote
		 */
		
		int age = 20;
			if (age >= 18) {
				System.out.println("You can vote");
			} else {
				System.out.println("You cant vote, too young");
			}
		
	}

}
