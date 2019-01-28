package day54_Polymorphysm;

public class AnimalConcert {
	public static void main(String[] args) {
		
		
		Animal a1 = new Dog();
			a1.makeNoise();
			
		Animal a2 = new Cat();
			a2.makeNoise();
		
		Animal a3 = new Horse();
			a3.makeNoise();
		
	}

}
