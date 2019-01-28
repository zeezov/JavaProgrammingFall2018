package day04_operators;

public class WarmUpTask {
	public static void main(String[] args) {
		
		//Pancakes: eggs - 2, flour - 1 cup, milk - 0.5 cup
		//sugar - 2 spoons, oil - 2 table spoons
		
		int eggs = 20;
		int cupOfFlour = 1;
		float cupOfMilk = 0.5f;
		int spoonsOfSugar = 2;
		int spoonsOfOil = 2;
		
			System.out.println("You need " + eggs + " eggs");
			System.out.println("You need " + cupOfFlour + " Cup of Flour");
			System.out.println("You need " + cupOfMilk + " Cup of Milk");
			System.out.println("You need " + spoonsOfSugar + " Spoons of Suger");
			System.out.println("You need " + spoonsOfOil + " Spoons of Oil");
			
			//print all of those in one sentence using single println

			System.out.println("You need " + eggs + " eggs." 
					+ " You need " + cupOfFlour + " Cup of Flour." 
					+ " You need " + cupOfMilk + " Cup of Milk." 
					+ " You need " + spoonsOfSugar + " Spoons of Suger." 
					+ " You need " + spoonsOfOil + " Spoons of Oil.");
		
	}
}
