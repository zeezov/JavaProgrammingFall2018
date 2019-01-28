package day53_Abstraction_Interface2;

public abstract class Shape implements Drawable {
	
	String name;
	
	public Shape(String name) {
		this.name = name;
	}
	
	public Shape() {
		System.out.println("This is Shape class");
	}
	
	// when we implement from Drawable it automaticle takes both methods from Drawable
	
	
	public abstract void calculateArea();

}
