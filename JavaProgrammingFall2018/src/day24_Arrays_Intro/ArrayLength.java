package day24_Arrays_Intro;

public class ArrayLength {
	public static void main(String[] args) {
		
		// Declare array names that can store 5 names
		
		String[] names = new String[5];
		
		names[0] = "Nazim";
		names[1] = "Khalili";
		names[2] = "Z";
		//names[3] = "Erkan"; // still will give 5 array values
		//names[4] = "Zarina";
		
		System.out.println(names.length);// count of values in array
		System.out.println(names[4]); // will give null
		
		//String name and assing Khalili to it by reading from array
		String name = names[1];
		
		System.out.println(name.length());// count of characters in string
		
		
		
	}

}
