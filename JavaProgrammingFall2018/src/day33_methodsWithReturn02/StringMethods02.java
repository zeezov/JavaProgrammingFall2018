package day33_methodsWithReturn02;

public class StringMethods02 {
	public static void main(String[] args) {

		int myCount = countTimes("Jona", "a");
		System.out.println(myCount);
		
		// Version 2
		System.out.println(countTimesV2("Jaana", "a"));
		
		// Version 3
		System.out.println(countTimesV3("Johongor", "o"));
		

	}

	// Method: countTime
	// Params: 2 Strings
	// Return type: int
	// Count number of occurences of first string within second string (Second
	// String has only 1 Char)
	// and return count

	// Exp:
	// countTimes("java", "a") -> 2
	// countTimes("Break time is over!" "e") -> 3
	// countTimes("google", "a") -> 0

	public static int countTimes(String w1, String w2) {

		int count = 0;

		for (int i = 0; i < w1.length(); i++) {
			if (w1.substring(i, i + 1).equals(w2)) {
				count++;
			}
		}
		return count;
	}
	
	// Version 2 using split
	// String str = "abcabc"; str.split("b"); -> ["a","ca", "c"] -> length -> 3.b s are 2
	// Update this method so that it handles when w2 is at the end or start
	public static int countTimesV2(String w1, String w2) {

			String[] arr = w1.split(w2);
		
		return arr.length-1;
	}
	
	// Version 3
	public static int countTimesV3(String w1, String w2) {
		int len1 = w1.length();
		w1 = w1.replace(w2, "");
		int len2 = w1.length();
		return len1 - len2;
	}
	
	

}
