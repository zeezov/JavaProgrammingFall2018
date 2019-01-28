package day40_customclasses;

public class MovieTester {
	public static void main(String[] args) {
		
		Movie interenship = new Movie();
		Movie gladiator = new Movie();
		Movie starWars = new Movie();
		
		interenship.name = "Interenship";
		gladiator.name = "Gladiator";
		starWars.name = "Star Wars";
		
		interenship.length = 119;
		gladiator.length = 140;
		starWars.length = 150;
		
		interenship.watch();
		gladiator.watch();
		starWars.watch();
		
		interenship.buy(10.77);
		gladiator.buy(23.50);
		starWars.buy(22.0);
		
		
		
	}

}
