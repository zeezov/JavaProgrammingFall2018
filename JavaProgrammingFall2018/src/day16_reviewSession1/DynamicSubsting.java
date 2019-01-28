package day16_reviewSession1;

public class DynamicSubsting {
	public static void main(String[] args) {
		
	
	
	String sentence = "We are learning Java programming";
	
	/*
	 * IndexOf -> accepts a string and find the position
	 * Exp: String str = "abc start"
	 * str.indexOf("b") -> 1
	 * str.indexOf("start") -> 4
	 */
	
	int start = sentence.indexOf("learning");
	int end = sentence.indexOf("programming");
	
	System.out.println(start);
	System.out.println(end);
	
	start += "learning".length();
	
	String language = sentence.substring(start, end);
	System.out.println(language.trim()); // is cutting space in front ouf Java and in the end
	
	
	}

}
