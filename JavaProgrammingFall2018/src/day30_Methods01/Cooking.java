package day30_Methods01;

public class Cooking {
	public static void main(String[] args) {
		
	/*
	 * method cook accepts a String food name, and prints 
	 * "Today we are cooking food name" 
	 */
		
	 /*
	  * method youWillNeed, accpets a String with things we need 
	  * to prints "We need following items: items"
	  */
		
	  /*
	   * method cookFor accepts minutes and way of cooking and prints:
	   * "You need to cook for tha many minutes wayOfCooking"
	   */
		
	   /*
	    * method ready, deos not accept any paramenters, 
	    * prints "Meal is ready! Enjoy"
	    */
		
		cook("Plov");
		youWillNeed("Rice, Meat, Carrots");
		cookFor(30, " minutes in high fire");
		ready();
		
	}
	
	public static void cook(String name) {
		System.out.println("Today we are cooking " + name);
	}
	
	public static void youWillNeed(String name) {
		System.out.println("We need following items " + name);
	}
	
	public static void cookFor(int minutes, String name) {
		System.out.println("You need to cook for " + minutes + name);
	}
	
	public static void ready() {
		System.out.println("Meal is ready! Enjoy");
	}

}
