package day14_stringManupulationCont;

public class TrimExample {
	public static void main (String[] args) {
		
		/*
		 *  trim() -> deltes whitespace in the beginnning and end of the string
		 */
		
		String str = " Blah Blah Blah  ";
			System.out.println(str);
			
			// console will print str without the space
			//but the value of the str does not change
			System.out.println(str.trim());
			
			
			System.out.println(str.length());
			
			// chaining -> calling methods one after another
			System.out.println(str.trim().length());
			
			

		
	}

}
