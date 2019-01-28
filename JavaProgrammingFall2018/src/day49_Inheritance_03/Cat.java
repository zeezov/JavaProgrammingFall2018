package day49_Inheritance_03;

	// #2

public class Cat extends Animal {
	
	public Cat() {
	    super("Object");
	    System.out.println("Cat object is created");
	}
	
	@Override
	public void speak() {
		System.out.println("Meow");
	}

}
