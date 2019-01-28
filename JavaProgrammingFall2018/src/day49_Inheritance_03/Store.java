package day49_Inheritance_03;

	// #4

public class Store {

	private String type;
	private double rent;
	
	public Store(String type) {
		this.type = type;
		System.out.println("Store constructor with Type: " + type);
		
	}
	
	public Store(double rent) {
		
		this.rent = rent;
		System.out.println("Store cunstructor with Rent: " + rent);
		
	}
	
	public Store(String type, double rent) {
		
		this.type = type;
		this.rent = rent;
		System.out.println("Store constructor with Type: " + type + " and rent: " + rent);
		
	}
	
	
	public double getRent() {
		return rent;
	}

	public void setRent(double rent) {
		this.rent = rent;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
}
