package day50_final_super;

 // #10

public class TestLanguage {
	public static void main(String[] args) {
		
		ProgrammingLanguage pl = new ProgrammingLanguage();
		
		pl.printName(); // Language: General Language. Since printName is running from Parnet class
		
		pl.printProgrammingName();
		
		System.out.println(pl.name); // will print Programming Language - JAVA. Goes to closest name which is in ProgrammingLanguage class.
		
		pl.staticMethod();
		
		pl.printName();
		
	}

}
