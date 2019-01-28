package day39_StringBuilder;

public class ComparingStringBuilders {
	public static void main(String[] args) {
		
		StringBuilder builder1 = new StringBuilder("java");
		StringBuilder builder2 = new StringBuilder("java");
		
		System.out.println(builder1 == builder2); // false becuase both objects are in diff memory locations
		
		System.out.println(builder1.equals(builder2)); // also false becase equals same as ==
		
		/*
		 *  Convert to Strings and than call String equals method
		 */
		
		// to compare StringBuilder we need to first convert it toString
		boolean isEqual = builder1.toString().equals(builder2.toString());
		System.out.println(isEqual); // prints true
		
		
		StringBuilder builder3 = builder1; // builder3 is becoming same as builder1
		System.out.println(builder3 == builder1); // true
		
		System.out.println(builder1); // prints java
		System.out.println(builder3); // prints java
		
		builder3.append(" programming"); // both builder1 and builder 3 will become java programming
		
		System.out.println(builder1);
		System.out.println(builder3);
		
		StringBuilder builder4 = new StringBuilder(builder1); // this will only copy the value of builder1
		System.out.println(builder4); // prints java programming
		
		builder1.append("!!!");
		System.out.println(builder4); // will not change. Still printing java programming
		System.out.println(builder1); // this one has changed in value
		System.out.println(builder3); // will print the same as builder1 because they are in the same memorry heap
		
		
		
		
	}

}
