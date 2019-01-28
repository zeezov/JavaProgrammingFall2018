package day08_conditionals2;

public class Grades {
	public static void main(String[] args) {
		/*
		 * A,B,C,D
		 * Use char variable grade
		 * if grade is A -> Excellent
		 * if grade is B -> Good
		 * If grade is C -> Acceptable
		 * If grade is D - > Review all classes
		 */
		
		char grade = 'A';
			
			if (grade == 'A') {
				System.out.println("Ecellent");
			} else if (grade == 'B') {
				System.out.println("Good");
			} else if (grade == 'C') {
				System.out.println("Acceptable");
			} else if (grade == 'D') {
				System.out.println("Review all classes");
			} else {
				System.out.println("Invalid Grade. Only A,B,C,D options allowed");
			}
		
		
		}
	

}
