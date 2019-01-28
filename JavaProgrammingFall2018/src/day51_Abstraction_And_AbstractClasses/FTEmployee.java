package day51_Abstraction_And_AbstractClasses;

public class FTEmployee extends Employee {
	
	double bonus;
	
	public void speak() {
		System.out.println("FTEmployee is speaking");
	}
	
	public void work() {
		System.out.println("FTEmployee is working");
	}

}
