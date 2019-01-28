package day55_Polymorhysm_2;

public class MainRunner {
	public static void main(String[] args) {
		
		Person p1 = new Person("Ted", 24);
		
		Object p2 = new Person("Ole", 55);
		
		printPerson(p1);
		printPerson(p2);
		
		
	}
	
	public static void printPerson(Person p) {
		
		System.out.println("First printPerson is being used");
		System.out.println(p);
		
	}
	
	
	public static void printPerson(Object o) {
		
		System.out.println("Second printPerson is being used");
		System.out.println(o);
		
	}
	

}
