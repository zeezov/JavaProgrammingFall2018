package day17_reveiwSession_Strings;


public class Substrings {
	public static void main(String[] args) {
		
		/*
		 * Create a variable diceResults
		 * assign 1 - 30 of 1,367 positions
		 * using substring extract number of open positions 
		 */
		
		String diceResults = "1 - 30 of 1,367 positions";
		System.out.println(diceResults.length());
		
		System.out.println(diceResults.substring(10, 15));
		
		System.out.println("================================");
		
		String languages = new String("Java, Fortrun, English, Cobol, Ruby, C#");
		String ln1, ln2, ln3, ln4, ln5, ln6;
		
		/*
		 * Using substring assign each languache to each variable
		 * for the last leanguea just past 1 number to substring
		 */
		
		ln1 = languages.substring(0, 4);
		ln2 = languages.substring(6,13);
		ln3 = languages.substring(15,22);
		ln4 = languages.substring(24,29);
		ln5 = languages.substring(31,35);
		ln6 = languages.substring(37);
		
		System.out.println(ln1 + " " + ln2 + " " + ln3 + " " + ln4 + " " + ln5 + " " + ln6);
		
	}

}
