package day42_Encapsulation_Constractor;

public class CarMax04 {
	public static void main(String[] args) {
		
		Car03 carOne = new Car03();
		
		carOne.setMake("Accura");
		carOne.setModel("ILX");
		carOne.setType("Sedan");
		carOne.setSpeed(35);
		
		System.out.println("Make: " + carOne.getMake());
		System.out.println("Current speed: " + carOne.getSpeed());
		
		carOne.accelerate(30);
		System.out.println("Current speed: " + carOne.getSpeed());
		
		// Using constractor
		Car03 carTwo = new Car03();
		System.out.println("Car 2 make: " + carTwo.getMake());
		System.out.println("Car 2 model: " + carTwo.getModel());
		System.out.println("Car 2 type: " + carTwo.getType());
		
		// new object Constructor with 3 params
		Car03 carThree = new Car03("Couple", "Ford", "Mustang");
		System.out.println("Car 3 make: " + carThree.getMake());
		System.out.println("Car 3 model: " + carThree.getModel());
		System.out.println("Car 3 type: " + carThree.getType());
		
		

	}

}
