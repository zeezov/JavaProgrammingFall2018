package day11_switchCase;

public class checkClass {
	public static void main (String[] args) {
		
		int number = 9;
		String classAtSchool = "";
		String weekDayName = "";
		
		if (number == 1) {
			classAtSchool = "Group Project ";
			weekDayName = "Monday";
		} else if (number == 2) {
			classAtSchool = "Java ";
			weekDayName = "Tuesday";
		} else if (number == 3) {
			classAtSchool = "Java ";
			weekDayName = "Wednesday";
		} else if (number == 4) {
			classAtSchool = "Manual QA/SDLC/SoftSkills ";
			weekDayName = "Thursday";
		} else if (number == 5) {
			classAtSchool = "No class ";
			weekDayName = "Friday ";
		} else if (number == 6) {
			classAtSchool = "Java ";
			weekDayName = "Saturday";
		} else if (number == 7) {
			classAtSchool = "Java ";
			weekDayName = "Sunday";
		} else {
			System.out.println("Invalid number. You can only enter 1-7");
		}
		
		System.out.println(classAtSchool + weekDayName);
		
	}

}
