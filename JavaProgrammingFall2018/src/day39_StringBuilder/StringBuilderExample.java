package day39_StringBuilder;

public class StringBuilderExample {
	public static void main(String[] args) {
		
		StringBuilder stb1 = new StringBuilder("Halloween");
		System.out.println(stb1);
		
		//=======================================================================
		
		StringBuilder stb2 = new StringBuilder();
		//stb2 = stb2 + "Java"; will not work with StringBuilder
		
		// .append method will append/add more string to the StringBuilder value
		
		stb2.append("java");
		System.out.println(stb2);
		
		stb2.append(",SQL" + ",C#").append(",HTML");
		System.out.println(stb2);
		
		StringBuilder list = new StringBuilder("Wooden Spoon");
		
		list.append(",Iron Spoon");
		System.out.println(list);
		
		list.append('|');
		System.out.println(list);
		
		list.append(100);
		System.out.println(list);
		
		//=======================================================================

		
		StringBuilder letters = new StringBuilder("ABCDEFJHIJKLM");
		
		letters.append("Z"); // always add to the end
		System.out.println(letters);
		
		letters.delete(0,3);
		System.out.println(letters);
		
		letters.delete(5, 10); // deletes IJKLM
		System.out.println(letters);
		
		//=======================================================================

		
		StringBuilder sentence = new StringBuilder("Javaisfun");
		System.out.println(sentence);
		
		sentence.reverse();
		System.out.println(sentence);
		
		sentence.deleteCharAt(0); // to delete first character
		System.out.println(sentence);
		
		sentence.deleteCharAt(sentence.length()-1); // to delete last character
		System.out.println(sentence);
		
		
		//=======================================================================
		
		/*
		 * 					** POPULAR METHODS **	
		 * 
		 * -.append(value) => add more string to value
		 * -.delete(start, end) => delete from start index till end index
		 * =.reverse() => reverses the StringBuilder value
		 * -.deleteCharAt(index) => delete a character at index
		 * -.insert(index, String) => inserts the value at the specific index positions
		 * -.replace(start, end, String) => it replaces Starting and Ending positions with given String
		 */
		
		//=======================================================================
		
		
		StringBuilder stbInsert = new StringBuilder("SeleniumAutomation");
		
		//SeleniumAutomation => Selenium test Automation
		stbInsert.insert(8, " test ");
		System.out.println(stbInsert);
		
		stbInsert.insert(9, 1); // will add 1 at index 9
		System.out.println(stbInsert);
		
		stbInsert.replace(0,1, "*"); // will change (Selenium) to *elenium
		System.out.println(stbInsert);
		
		// Appium test Automation
		stbInsert.replace(0,8, "Appium"); // changed *elenium 1test Automation to Appium 1test Automation
		System.out.println(stbInsert);
		
//		You can also do this way using indexOf method
//		stbInsert.replace(0,  stbInsert.indexOf(" "), "Appium");
		
		
		// using String replace
		String str = "aabbaajj";
		str = str.replace("aa", "cc"); // will change both of the aa. Will print ccbbccjj
		System.out.println(str);
		
		
		
		
		
		
		
		
		

		
		
		
		
	
}
	
	
}
