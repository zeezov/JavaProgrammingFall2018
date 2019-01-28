package day40_customclasses;

public class Employee {
	
	/*
	 * Instance variables
	 * First name, Last name, email, jobTitle, hourlySalary
	 */
	
	String firstName;
	String lastName;
	String email;
	String jobTitle;
	double hourlySalary;
	
	// behavior
	public void work() {
		System.out.println(firstName + " is working as " + jobTitle);
	}
	
	
//	public static void main(String[] args) {
//		
//		Employee emp1 = new Employee();
//		
//		emp1.firstName = "John";
//		emp1.lastName = "Smith";
//		emp1.email = emp1.firstName + emp1.lastName +"@mail.com";
//		emp1.jobTitle = "Window Washer";
//		emp1.hourlySalary = 65.50;
//		
//		System.out.println("First name " + emp1.firstName);
//		System.out.println("Last name " + emp1.lastName);
//		System.out.println("Email " + emp1.email);
//		System.out.println("Job title " + emp1.jobTitle);
//		System.out.println("Pay an hour " + emp1.hourlySalary);
//		System.out.println("Pay per day: " + emp1.hourlySalary*8 + " pay per week");
//		
//	}

}
