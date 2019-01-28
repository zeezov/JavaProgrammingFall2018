package day17_reveiwSession_Strings;


public class Strings_03 {
	public static void main(String[] args) {
		
		// take a String countryName and abbreviate it by taking first 2 letters
		//exp: countryName -> Bangladesh -> BA , (toUpperCase)
		
		
		String countryName = "Brazil";
		
		
		System.out.println(countryName.substring(0, 2).toUpperCase());
		
		// ternary conditions using ? and :
		// check if abbreviated is 2 chars:
		// if true say -> " 2 chars detected"
		// else say -> "2 chars were not fount"
		
		System.out.println(countryName.substring(0,2).length() == 2 ? "2 chars detected" : "2 chars were not found");
		
		String msg1 = "2 Chars detected";
		String msg2 = "2 chars were not found";
		
		String result = countryName.length() == 2 ? msg1 : msg2;
		System.out.println(result);
		
		System.out.println("==============================================");
		
		/* Convert this to Turnery
		 * If 2 chars
		 * 		if first char is U
		 * 			say "Maybe USA"
		 * 		esle "Not USA for Sure"
		 *  else 
		 *  	say 2 cahrs were not found
		 */
		
		String str = "USAAAAA";
		
		String ms1 = "Maybe USA";
		String ms2 = "Not USA for Sure";
		String ms3 = "2 Chars were not found";
		String result2 = str.substring(0,2).length() == 2 ? str.charAt(0) == 'U' ? ms1 : ms2 : ms3;
		System.out.println(result2);
		
		
	}

}
