package day41_classes02_encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class HouseBuilder {
	public static void main(String[] args) {

		House myHouse1 = new House();

		myHouse1.type = "Mansion";
		myHouse1.address = "111 Beverly Hills";
		myHouse1.bedroom = 45;
		myHouse1.year = 2018;

		House myHouse2 = new House();

		myHouse2.type = "Poor mans house";
		myHouse2.address = "4564 Compton Ave";
		myHouse2.bedroom = 3;
		myHouse2.year = 2013;
		
		House myHouse3 = new House();
		
		myHouse3.type = "Apartment";
		myHouse3.address = "2345 N Vermont Aplt 45 LA CA 90015";
		myHouse3.bedroom = 2;
		myHouse3.year = 2011;
		
		House whiteHouse = new House();
		
		whiteHouse.type = "White House";
		whiteHouse.address = "1600 Pennsylvania Ave NW, Washington, DC 20500";
		whiteHouse.bedroom = 132;
		whiteHouse.year = 1800;
		
		System.out.println("House1 type " + myHouse1.type);
		System.out.println("House1 type " + myHouse2.type);
		System.out.println("House1 type " + myHouse3.type);
		System.out.println("House1 type " + whiteHouse.type);
		
		// Examples with Array
		
		int[] nums = new int[4];
		nums[0] = 234; // to store 234 at index 0
		
		String[] names = new String[4];
		names[0] = "bill"; // to store Bill at index 0
		
		House[] houses = new House[4];
		houses[0] = myHouse1;
		houses[1] = myHouse2;
		houses[2] = myHouse3;
		houses[3] = whiteHouse;
		
		System.out.println(houses[0].address);
		
		System.out.println();
		
		// Example with for each loop
		for (House h : houses) {
			System.out.println("# " +h.type + "|->|" + h.address + h.bedroom + h.year);
		}
		
		System.out.println();
		
		// Example with for loop
		for (int i = 0; i < houses.length; i++) {
			System.out.println("# " + houses[i].type + "|" + houses[i].address);
		}
		
		System.out.println();
		// Example with ArrayList
		System.out.println("========== ArrayList Of House Object ==========");
		
		ArrayList<Integer> numsList = new ArrayList<>(); // how to create regular ArrayList
		
		ArrayList<House> housesList = new ArrayList<>(); // how to create ArrayList using your Class
		housesList.add(myHouse1);
		housesList.add(myHouse2);
		housesList.add(myHouse3);
		housesList.add(whiteHouse);
		
		// print year of each house address object in ArrayList if year is between 2006 and 2016
		
		// using FOR EACH LOOP
		
		for (House house : housesList) {
			int year = house.year; // 
			if(year >= 2006 && year <= 2016) {
				System.out.println(year + " | " + house.address);
			}
		}
		
		// using FOR LOOP
		
		for (int j = 0; j < housesList.size(); j++) {
			House tempHouse = housesList.get(j);
			
			if(tempHouse.year >= 2016 && tempHouse.year <= 2016) {
				System.out.println(tempHouse.year + " | " + tempHouse.address);
			}
		}
		
		
		
		
		// to transfer already created Array to ArrayList. But this options is not dynamic
		// it will be fixed size. You cannot add another house
		ArrayList<House> houseList2 = new ArrayList<>(Arrays.asList(houses));
	
	}
	
	
	
	
	

}
