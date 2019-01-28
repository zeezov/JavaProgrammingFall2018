package day53_Abstraction_Interface2;

/*
 * Create an interface called Drawable
 with constant COLOR 
 and abstract method draw() return nothing
 another abstract method drawLine , 
 have one parameter direction : String 
 return int 
 Let the rectangle class implements this interface 
 */

public interface Drawable {
	
	public static final String COLOR = "RED";
	
	public abstract void draw();
	
	public abstract int drawLine(String s);
	
	// we can use default method so we dont have to implement methods an all classes
	public default void drawSquare() {
		System.out.println("I will waait for your implementations");
	}
	
	//static method
	public static void doStaticStuff() {
		System.out.println("This is static");
	}
	

}
