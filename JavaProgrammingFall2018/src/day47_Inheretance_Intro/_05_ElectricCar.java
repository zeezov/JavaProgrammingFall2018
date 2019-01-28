package day47_Inheretance_Intro;

public class _05_ElectricCar extends _02_Car {
	
	public static boolean hasBattery = true;
	public int batteryLevelMiles;
	
	
	public void charge() {
		System.out.println("Charging electric car");
		batteryLevelMiles = 500;
	}
	
	

}
