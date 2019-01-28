package day49_Inheritance_03;

	// #5

public class StoreTest {
	public static void main(String[] args) {
		
		Store store1 = new Store("Grocery");
		
		Store store2 = new Store(10000.0);
		
		Store store3 = new Store("Computer Store", 5000.0);
		
		System.out.println("====== PETSMART OBJECTS ======");
		
		PetSmart petSmart1 = new PetSmart();
		
		System.out.println("====== PETSMART WITH RENT OBJECT CREATION ======");
		
		PetSmart petSmart2 = new PetSmart(12345.98);
		
		System.out.println("Petsmart1 type: " + petSmart1.getType());
		System.out.println("Petsmart2 type: " + petSmart2.getType());
		
		System.out.println("Petsmart1 rent: " + petSmart1.getRent());
		System.out.println("Petsmart2 rent: " + petSmart2.getRent());
		
		
	}

}
