package day52_Abstraction_Interface;

public class Drone implements Flyable, Movable {
	
	int engineSize;
	int maxHeight;
	
	@Override
	public void fly() {
		System.out.println("Drone Fly");
		
	}

	@Override
	public void Move() {
		System.out.println("Drone Move");
		
	}
	
	public static void main(String[] args) {
		
		Drone d = new Drone();
		
		d.Move();
		
	}
	
	
	
	
	
	

}
