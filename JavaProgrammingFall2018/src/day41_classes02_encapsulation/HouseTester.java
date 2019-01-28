package day41_classes02_encapsulation;

public class HouseTester {
	public static void main(String[] args) {
		
		// Step 1. Create house object and assign date to fields/instance variables
		House yourHouse = new House();
		yourHouse.type = "Castle";
		yourHouse.address = "100 Massachusets Ave, Washinton DC 22001";
		yourHouse.bedroom = 250;
		yourHouse.year = 2018;
		
		
		// Step 2. Pass your house object to printHouseInfo method
		printHouseInfo(yourHouse);
		
		
		// create one more object of House and pass it to method
		House herHouse = new House();
		herHouse.type = "Tent";
		herHouse.address = "100 Massachusets Ave, Washinton DC 22001";
		herHouse.bedroom = -1;
		herHouse.year = 2000;
		
		printHouseInfo(herHouse);
		
		// calling second method
		House returnHouse = buildAHouse("Loft", "777 Wooden Spoon Lane, NY 11230", 2, 1999);
			System.out.println(returnHouse.address);
		
	}
	
	public static void printHouseInfo(House houseObj) {
		System.out.println("===========");
		System.out.println("Type: " + houseObj.type);
		System.out.println("Address: " + houseObj.address);
		System.out.println("Bedrooms #: " + houseObj.bedroom);
		System.out.println("Year: " + houseObj.year);
		System.out.println("============");
	}
	
	
	// Method buildAHouse: 
	// Params: 4 -> 2 Strings and 2 Ints
	// Return type: House
	// In the method, using the values of the parameters build a new house object the return that
	
	
	public static House buildAHouse(String type, String address, int rooms, int year) {
		
		House newHouseObj = new House();
		
		newHouseObj.type = type;
		newHouseObj.address = address;
		newHouseObj.bedroom = rooms;
		newHouseObj.year = year;
		
		return newHouseObj;
		
	}

}
