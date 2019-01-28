package day49_Inheritance_03;

	// #10

public class StudentTest {
	public static void main(String[] args) {
		
		Student student = new Student();
		
		OnlineStudent onlineStudent = new OnlineStudent();
		
		InCampusStudent onCampusStudent = new InCampusStudent();
		
		student.attendAClass();
		onlineStudent.attendAClass();
		onCampusStudent.attendAClass();
		
		

		
				
	}

}
