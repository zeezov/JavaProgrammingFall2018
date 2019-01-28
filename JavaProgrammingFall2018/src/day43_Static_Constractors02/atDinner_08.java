package day43_Static_Constractors02;

public class atDinner_08 {
	public static void main(String[] args) {
		
		// using static Dad, Mom, Kid will share 1 pizza
		// using withour Static Dad, Mom, Kid each have their own pizza
		
		
		Dinner_07 Dad = new Dinner_07();
		Dinner_07 Mom = new Dinner_07();
		Dinner_07 Kid = new Dinner_07();
		
		System.out.println("Pizza slices: " + Dinner_07.pizzaSlices);

		Dad.takeASlice(2);
		Kid.takeASlice(3);
		Mom.takeASlice();
		
		System.out.println("Pizza slices: " + Dinner_07.pizzaSlices);
		
		Mom.takeASlice();
		
		System.out.println("Pizza slices: " + Dinner_07.pizzaSlices);

		
	}

}
