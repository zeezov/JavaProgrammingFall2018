package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListManipulations {
	public static void main(String[] args) {

		// Create ArrayList fruits using 5 differnt ways
		// fruits1, fruits 2 etc
		
		ArrayList<String> fruits1 = new ArrayList<>();
		List<String> fruits2 = new ArrayList<>();
		List<String> fruits3 = new ArrayList<>(10);
		ArrayList<String> fruits4 = new ArrayList<>(fruits3);
		// one you make ArrayList ==> Array. THe size will be fixed and you cant add or remove anything to it. 
		List<String> fruits5 = Arrays.asList(new String[] {"Watermelon", "Peach", "PineApple", "Kiwi"});
		// transfer the array back to ArrayList
		List<String> fruits6 = new ArrayList<>(fruits5);
		// creating ArrayList and making Array transfer back to ArrayList
		List<String> fruits7 = new ArrayList<>(Arrays.asList(new String[] {"Plum", "Cherry", "Mandarin"}));
		
		// add Values
		
		fruits1.add("Grapes");
		fruits1.add("Tomato");
		fruits1.add("BlueBerries");
		fruits1.add("BlackBerries");
		fruits1.add(0, "Orange");
		fruits1.add(4, "Strawberries");
		
		System.out.println(fruits1);
		
		fruits2.addAll(fruits1);
		fruits2.add("Dragon Fruit");
		
		System.out.println(fruits2);
		
		// remove element
		fruits1.remove(0);
		System.out.println(fruits1);
		
		fruits1.remove("Strawberries");
		System.out.println(fruits1);
		
		// remove all elements of fruits1 from from fruits2
		fruits2.removeAll(fruits1);
		System.out.println("Fruits2: "  + fruits2);
		
		fruits1.clear();
		System.out.println(fruits1);
		
		List<Integer> nums = new ArrayList<>();
		
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		
		System.out.println(nums);
		
		// remove 3 without using Index
		nums.remove(new Integer (3));
		System.out.println(nums);
		
		nums.remove(new Integer(2));
		System.out.println(nums);
		
		
			
		


		
		
		
	}

}
