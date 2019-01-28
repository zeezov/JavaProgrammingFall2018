package day36_overloading_arrayList;

import java.util.ArrayList;

public class arrayListGeneral {
	public static void main(String[] args) {
		
		// create a general (raw type) arraylist
		// we can add any type of Date to this list. Int, Double, String etc.
		ArrayList list = new ArrayList();
		
		list.add("Nazim");
		list.add(123);
		list.add(true);
		list.add("Slack");
		
		System.out.println(list); 
		
		list.add("new added item");
		list.add('b');
		
		System.out.println(list); 
		
		// to get the item from arrayList
		System.out.println(list.get(0)); // will print Nazim
		
		

		
		
		
	}

}
