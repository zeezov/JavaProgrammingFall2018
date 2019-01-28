package day40_customclasses;

public class Movie {
	
	String name;
	int length;
	
	public void watch() {
		
		System.out.println("Watching movie " + name);
		System.out.println("It is " + length + " mintutes");
		
	}
	
	public void buy(double price) {
		
		System.out.println("Buying " + name + " for $" + price);
		
	}
	
	

}
