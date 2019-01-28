package day42_Encapsulation_Constractor;

public class Car03 {

	private String type;
	private String make;
	private String model;
	private int speed;
	
	
	public Car03() { // no argument constractor
		System.out.println("Car class constractor");
		
		type = "unknown";
		make = "unknown";
		model = "unknown";
		
	}
	
	public Car03(String type, String make, String model) {
		
		System.out.println("3 args constructor");
		
		this.type = type;
		this.make = make;
		this.model = model;
		
	}

	
	public void accelerate(int mph) {
		speed += mph;
		System.out.println(make + " " + type + " is accelerating. ");
	}
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
}
