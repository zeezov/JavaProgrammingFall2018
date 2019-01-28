package day51_Abstraction_And_AbstractClasses;

public class Contractor extends Employee {
	
	double hourlyRate;
	int contractPeriod;
	
	@Override
	public void work() {
		System.out.println("Contractor is working");
		
	}
	@Override
	public void speak() {
		System.out.println("Contractor is speaking");
		
	}

}
