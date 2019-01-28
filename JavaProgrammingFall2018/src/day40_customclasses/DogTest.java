package day40_customclasses;

public class DogTest {
	public static void main(String[] args) {
		
		Dog name = new Dog();

		name.breed = "Shephard";
		name.color = "White";
		name.size = 15;

		name.bark();
		name.eat();
		name.run();
		
	}

}
