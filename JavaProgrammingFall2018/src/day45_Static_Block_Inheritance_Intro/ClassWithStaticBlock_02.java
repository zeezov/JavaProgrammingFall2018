package day45_Static_Block_Inheritance_Intro;

public class ClassWithStaticBlock_02 {
	
	// static block only runs one time.
	static {
		System.out.println("This is static Block. I run once in the beginning");
	}
	
	public ClassWithStaticBlock_02() {
		System.out.println("THis is a Construnctor. I run every time object is created");
	}

}
