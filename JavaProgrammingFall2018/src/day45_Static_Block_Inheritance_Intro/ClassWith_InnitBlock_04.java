package day45_Static_Block_Inheritance_Intro;

public class ClassWith_InnitBlock_04 {
	
	// static block
	
	static {
		System.out.println("Static Block. I run before Init or Construnctor but run only once");
	}
	
	
	    // Initializer Block
	{
		System.out.println("This is Initializer block. I run automaticly every time object is created. I run before constructor");
	}
	
	public ClassWith_InnitBlock_04() {
		
		System.out.println("This is a constructer. I run ever time object is created");
		
	}
	
	public static void staticMethod() {
		System.out.println("Static Method");
	}
}
