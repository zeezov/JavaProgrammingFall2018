package day13_stringmanipulation;

public class StringContains {
	public static void main(String[] args) {
		
		String word = "water";
		System.out.println(word.contains("t")); //true
		
		System.out.println(word.startsWith("w")); //true
		System.out.println(word.endsWith("r")); //true
		System.out.println(word.endsWith("er")); //true
		
		String str = "";
		System.out.println(str.isEmpty()); //true
	}

}
