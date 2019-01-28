package day50_final_super;

 // #8

public class Language {
	
	public String name = "General Language";
	
	public static void staticMethod() {
		System.out.println("Langueage - static");
	}
	
	public void printName() {
		System.out.println("Language: " + name);
		staticMethod();
	}

}
