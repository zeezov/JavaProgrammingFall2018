package day47_AccessModifiers01;

//VaCampus has-a VaCampusStudent

public class _03_VaCampus {
	
	public static void main(String[] args) {
	
	_02_VaCampusStudents campusStudent = new _02_VaCampusStudents();
	
	_01_Student student = new _01_Student();
	student.name = "Serik"; //public
	//student.ssn ssn is private. Only visible in student class
	student.age = 27;
	student.campus = "Mclean VA";
	
	}

}
