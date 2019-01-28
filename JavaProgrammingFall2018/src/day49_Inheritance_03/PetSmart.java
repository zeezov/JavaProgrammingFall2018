package day49_Inheritance_03;

	// #6

public class PetSmart extends Store {
	
	public PetSmart() {
		super("Pet Store");
		System.out.println("PetSmart no args");
	}
	
	public PetSmart(double rent) {
		super("Pet Store", rent);
		System.out.println("PetSmart construnctor with rent: " + rent);
	}
	

}
