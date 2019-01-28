package day08_conditionals2;

public class ChooseALeanguage {
	public static void main(String[] args) {
		/*
		 * English -> 1
		 * Spanish -> 2
		 * Turkish -> 3
		 * Russian -> 4
		 * Uygur -> 5
		 * Uzbek -> 6
		 * Kyrgyz -> 7
		 * Tajik -> 8
		 */
		
		System.out.println("Please select: English -> 1 \n" +
		                                   "Spanish -> 2 \n" +
				                           "Turkish -> 3 \n" + 
		                                   "Russin -> 4 \n" +
				                           "Uygur -> 5 \n" +
				                           "Uzbek -> 6 \n" +
		                                   "Kyrgyz -> 7 \n" +
				                           "Tajik - > 8 \n");
		
		int language = 9; 
		String greeting = "";
		
			if(language == 1) {
				greeting = "Hello, how are you?";
			} else if (language == 2) {
				greeting = "Como estas?";
			} else if (language == 3) {
				greeting = "Merhaba nasılsın?";
			} else if (language == 4) {
				greeting = "Kak dela?";
			} else if (language == 5) {
				greeting = "ياخشى تۇردىڭىزمۇ?";
			} else if (language == 6) {
				greeting = "Qale ishla? ";
			} else if (language == 7) {
				greeting = "qondoysin?";
			} else if (language == 8) {
				greeting = "Salom, Chihel bro ";
			}  else {
				System.out.println("Dont recognize this language");
			}
		
		System.out.println(greeting);
		
	}

}
