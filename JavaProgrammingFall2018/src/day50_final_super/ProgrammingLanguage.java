package day50_final_super;

 // #9

public class ProgrammingLanguage extends Language {
	
	// veriable hiding. Hiding name from parant class
	public String name = "Programming Language - JAVA";
	
	public void printProgrammingName() {
		System.out.println("Programming L: " + name);
	}
	
	// hiding static method
	public static void staticMethod() {
		System.out.println("Prgoramming Langueage - static method");
	}

}
