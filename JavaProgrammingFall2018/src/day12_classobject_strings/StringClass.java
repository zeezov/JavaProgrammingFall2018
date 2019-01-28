package day12_classobject_strings;

public class StringClass {
	public static void main (String[] args) {
		
		String name = "Nazim";
		/*
		 * 1.declaring a variable -> String name. 
		 *  -> variable name is name and type is String
		 *  -> Hey java i want you to create a variable called name
		 *  -> that can store String object.
		 * 2. Assign value - String object.
		 *  Anything in double quotes is String Object with that value.
		 */
		
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		
		System.out.println(name.length());
		System.out.println("java".length()); 
		
		System.out.println(name.charAt(4));
		
		char secondChar = name.charAt(1);
		System.out.println(secondChar);
	}

}
