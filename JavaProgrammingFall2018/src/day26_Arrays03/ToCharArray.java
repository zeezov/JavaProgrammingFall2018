package day26_Arrays03;

public class ToCharArray {
	public static void main(String[] args) {
		
		String word = "Hello";
		char[] letters = word.toCharArray();
		
	
		for (char letter : letters) {
			System.out.print(letter);
		}
		
		System.out.println();
		
		String gift = "Diamond Ring";
		// convert to char array and print reverse
		
		char[] reverse = gift.toCharArray();
		
		for (int i = reverse.length-1; i >= 0; i--) {
			System.out.print(reverse[i]);
		}
	
	}

}
