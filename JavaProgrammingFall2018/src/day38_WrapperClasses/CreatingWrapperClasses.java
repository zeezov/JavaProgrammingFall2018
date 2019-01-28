package day38_WrapperClasses;

public class CreatingWrapperClasses {
	public static void main(String[] args) {
		
		// Create Wrapper class objects
		
		Integer n1 = new Integer(100);
		Integer n2 = Integer.valueOf(456);
		Integer n3 = Integer.parseInt("2345");
		
		Double d1 = new Double(123.45);
		Double d2 = Double.valueOf(345.6);
		Double d3 = Double.parseDouble("1000.3");
		// similarly we can do with other Wrapper classes as well
		
		Character ch1 = new Character('A');
		Character ch2 = Character.valueOf('@');
		
		char ch3 = '3'; // true
		char ch4 = 'q'; // false
		
		System.out.println(Character.isDigit(ch3));
			
		String str = "ab5c";
		
		System.out.println(Character.isAlphabetic(str.charAt(0))); // ture
		System.out.println(Character.isAlphabetic(str.charAt(2))); // false because 5 number
		
		
		// to check if Character is number or letter
		System.out.println(Character.isLetterOrDigit('1')); // true
		System.out.println(Character.isLetterOrDigit('i')); // true
		System.out.println(Character.isLetterOrDigit('@')); // false
		
		
		
		
		
		

		
	}

}
