package day47_Inheretance_Intro;

public class _01_Vehicle {
	
	public String makeAndModel;
	public int year;
	public int maxSpeed;
	public int milage;
	
	// using static method
	public static void service() {
		System.out.println("Oil service");
	}
	
	
	public void drive() {
		System.out.println("Driving");
	}
	
	public void stop() {
		System.out.println("Stopping");
	}

}
