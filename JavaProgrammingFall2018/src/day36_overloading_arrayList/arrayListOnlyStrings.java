package day36_overloading_arrayList;

import java.util.ArrayList;

public class arrayListOnlyStrings {
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Java");
		names.add("Shapkat");
		names.add("Cam");
		names.add("Khalili");
		names.add("Z");
		names.add("Anastasia");
		
		System.out.println(names);
		
		// get size/number of elements
		int length = names.size();
		System.out.println("Number of names: " + length);
		
		// read first person name
		String first = names.get(0);
		System.out.println("First name is: " + first);
		
		String last = names.get( names.size()-1 );
		System.out.println(last);
		
		// remove the element from the list
		names.remove(0);
		System.out.println(names);
		
		names.remove("Z");
		System.out.println(names);
		
	}

}
