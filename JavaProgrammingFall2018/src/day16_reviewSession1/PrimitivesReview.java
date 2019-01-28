package day16_reviewSession1;

public class PrimitivesReview {
	public static void main(String[] args) {

		/*
		 * Data Types in Java: 1. Primitives 2. Objects/Class types/non-premitive
		 * 
		 * Primitive: 
		 * 		WholeNumbers/Integer: byte > short > int > long 
		 * 	Floating Point Numbers/Numbers with Decimals:
		 * 		float > double // float hold 4 bits in memory
		 * 		and double hold 8 bits. Thats why its called double Character type: char
		 * Boolean: 
		 * 		true/false
		 * 
		 */

		byte chairs = 70;
		byte secondRoomChairs = 50;

		System.out.println("First room has " + chairs + " chairs and second room has " +
							secondRoomChairs + " chairs\n" +
							"There are " + (chairs - secondRoomChairs) + " more chairs in the first room");
		//System.out.println("There are " + (chairs - secondRoomChairs) + " more charis in the first room");

		short shortValue = 32000;
		System.out.println("Short value: " + shortValue);
		
		int intValue = shortValue; // small can fit into large type. Implicit/Automatic casting
		System.out.println(intValue);
		intValue = intValue * 100;// 3200000
		
		shortValue = (short)intValue; // explicit casting/converting
		System.out.println("Short after casting: " + shortValue);//wont work
		
		int cityPopulation = 200_000_000;//undersore are allowed so that we can read easier
										//comiler will ignore those
										//your number cannot start or end with underscore
		
		System.out.println(cityPopulation);
		
		long worldPopulation = 8_000_000_000L;
		System.out.println("Current world population is: " + worldPopulation);
		
		
		
		double price = 45.33, discount = 12.5;
		
		double total = price = discount;
		//
		System.out.println(price);
		System.out.println(discount);
		System.out.println(total);
		
		
		
		
		
	}

}
