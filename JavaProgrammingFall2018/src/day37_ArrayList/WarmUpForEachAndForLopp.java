package day37_ArrayList;

import java.util.ArrayList;

public class WarmUpForEachAndForLopp {
	public static void main(String[] args) {

		/*
		 * Create an Arraylist cities Add 15 cities
		 * 
		 * -Print count of cities in the list
		 * 
		 * -Print all cities in one line separated by space
		 * 
		 * -Create another ArrayList longNames and add all cities from Cities list with
		 * more than 6 characters into longNames list.
		 * 
		 * -then print longNames in single line formatted way
		 */

		ArrayList<String> cities = new ArrayList<>();

		cities.add("Los Angeles");
		cities.add("New York");
		cities.add("San Francisco");
		cities.add("Pittsburg");
		cities.add("Miami");
		cities.add("Santa Fe");
		cities.add("Austin");
		cities.add("Charleston");
		cities.add("New Orleans");
		cities.add("Honolulu");
		cities.add("Nashville");
		cities.add("Colombus");
		cities.add("Fort Worth");
		cities.add("Phoenix");
		cities.add("San Jose");

		System.out.println(cities.size());
		// System.out.print(cities + " ");

		for (String city : cities) {
			System.out.print(city + " | ");
		}

		System.out.println();
		System.out.println("=================================");

		ArrayList<String> longNames = new ArrayList<>();

		for (String city : cities) {
			if (city.length() >= 6) {
				longNames.add(city);
			}
		}

		System.out.println(longNames);

		longNames.clear(); // ArrayList will become empty

		for (int i = 0; i < cities.size(); i++) {
			
//			String city = cities.get(i); // Another way of doing it
//			if(city.length() >= 6)
//				longNames.add(city);			
			
			if (cities.get(i).length() >= 6) {
				longNames.add(cities.get(i));
			}
		}
		System.out.println("Cities count with > 6 chars: "  + longNames.size());
		System.out.print(longNames + " ");

	}

}
