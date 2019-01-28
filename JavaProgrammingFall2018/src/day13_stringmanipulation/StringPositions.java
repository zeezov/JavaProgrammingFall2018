package day13_stringmanipulation;

public class StringPositions {
	public static void main(String[] arg) {
		
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(alphabet.indexOf("A"));
		int pPosition = alphabet.indexOf("P");
		System.out.println("P is at index " + pPosition);
		
		//HIJ location
		
		int hijLocation = alphabet.indexOf("HIJ");
		System.out.println(hijLocation);
		
		String sentance = "Today is Sunday and tomorrow is Monday";
			System.out.println(sentance.indexOf("Sunday"));
			System.out.println(sentance.indexOf("a"));
			
			System.out.println(sentance.lastIndexOf("a")); //36
			System.out.println(sentance.indexOf("y", 5)); //14
			
			
			
	}

}
