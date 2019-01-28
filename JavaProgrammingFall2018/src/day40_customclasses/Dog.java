package day40_customclasses;

public class Dog {
	
	/*
	 * Dog class/template
	 * properties/Data/Information
	 * 
	 *  - breed
	 *  - color
	 *  - size => int
	 *  
	 *  Behaviour
	 *  
	 *  - bark
	 *  - eat
	 *  - run
	 *  
	 *  
	 */
	
	String breed;
	String color;
	int size;
	
	
	public void bark() {
		System.out.println("Woof");
	}
	
	public void eat() {
		System.out.println("Eating kabab");
	}
	
	public void run() {
		System.out.println("10 miles in a day");
	}
	
	

}
