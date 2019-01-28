package day35_MethodsReview;

public class MethodsAndStuff {
	public static void main(String[] args) {
		
		String del = "Bless you";
		
//		str = str.replace("a", "yyyy");
//		System.out.println(str); // will print lyyyyptop
		
		del = delete(del, "you");
		
		System.out.println(del);
		
		System.out.println("======================================");
		
//		String str1 = "Meessage";
//		String str2 = "e";
		
		int count = numberOfOccurences("hallowweenn", "h");
			System.out.println(count);
		
		
	}
	
	
	/*
	 *  delete utility 
	 *  will delete a given char from the given string
	 */
	
	public static String delete(String str1, String str2) {
		
		String newOne = str1.replace(str2, "");
		return newOne;
		
		
	}
	
	/*
	 *  given a string, write a method which returns
	 *  how many times a certain string appears on a string
	 */
	
	public static int numberOfOccurences(String str1, String str2) {
		
		int count = 0;
		
		for (int i = 0; i < str1.length() - str2.length() + 1; i++) {
			String current = str1.substring(i, i + str2.length());
			
			if (current.equals(str2)) {
				count++;
			}
			
		}
		
		return count;
		
	}

}
