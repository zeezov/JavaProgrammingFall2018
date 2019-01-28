package day43_Static_Constractors02;

public class Dinner_07 {
	
	public static int pizzaSlices = 8;

	public void takeASlice() {
		pizzaSlices--;
	}
	
	public void takeASlice(int num) {
		pizzaSlices -= num;
	}

}
