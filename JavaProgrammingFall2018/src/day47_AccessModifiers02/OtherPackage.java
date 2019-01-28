package day47_AccessModifiers02;

import day47_AccessModifiers01._01_Student;

public class OtherPackage {

	public static void main(String[] args) {
		
		_01_Student student = new _01_Student();
		student.name = "Mike";
		//student.ssn = 23423; private
		//student.age = 44;
		//student.campus = "Chicago";
		
	}

}
