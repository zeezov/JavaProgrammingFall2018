package day45_Static_Block_Inheritance_Intro;

public class Blocks_06 {
	
	static int num = 100;
	static String str;
	
	// static block
	static {
		num = num + 1000;
		str = "Hello";
	}
	
	// Inititilizer (Init for short) block
	{
		num = num + 500;
		str = str + " world";
	}
	
	public Blocks_06() {
		num = num * 2;
		str = str + "!!!";
	}

}
