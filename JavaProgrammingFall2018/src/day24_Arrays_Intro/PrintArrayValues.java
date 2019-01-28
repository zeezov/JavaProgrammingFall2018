package day24_Arrays_Intro;

public class PrintArrayValues {
	public static void main(String[] args) {
		
		// Create an array cars and directly following values
		// Moskvich, Audi, Porsche, BMW, Toyota, Honda, Tesla, Dodge, Kia, Acura, Fiat
		
		String[] cars = {"Moskvic", "Audi", "Porsche", "BMW", "Toyota", "Honda", "Tesla", "Dodge", "Kia", "Acura", "Fiat"};
		
		
		//print number of cars
		System.out.println(cars.length);
		
		System.out.println();
		
		
//		int i = 0;
//		System.out.println(cars[i]);
//		i++;
//		System.out.println(cars[i]);
//		i++;
//		System.out.println(cars[i]);
		
		// print all values using for loop
		for (int idx = 0; idx < cars.length; idx++) {
			System.out.println(cars[idx]);
			}
		
		System.out.println();
		System.out.println("===FOR EACH LOOP===");
		System.out.println();
		
		//print all values using a for EACH Loop
		for (String car : cars) { // create variable 
			System.out.println(car);
		}
		
		
		
	}

}
