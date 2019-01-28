package day50_final_super;

 // #7

public class Electronics extends Product {
	
	private double price;
	
	

	public Electronics(String name, double price) {
		
		super(name);
		this.price = price;
		
	}
	
	public Electronics() {
		setName("Unknown Electornics");
		//super("Unknown Electornics"); <== will aslo work
		
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		//return "Name: " + getName() + " | Price: " + price; 
		
		// calls the parent class variables and methods
		// this wil get toString from product and add price
		return super.toString() + " | Price: " + price;
	}
	
	public void buy() {
		
		super.buy();
		System.out.println("Total price is " + price);
		
	}
	

}
