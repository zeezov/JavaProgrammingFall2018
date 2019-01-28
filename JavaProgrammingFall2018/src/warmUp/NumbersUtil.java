package warmUp;

public class NumbersUtil {

	public static boolean isPalindrome(int number) {
	    //Write your code here.
	    
	    int reversed = 0, remainder, originalInteger;
			
			originalInteger = number;
			
			while (number != 0) {
				remainder = number % 10;
				reversed = reversed * 10 + remainder;
				number /= 10;
			}
			
			if (originalInteger == reversed) {
				return true;
			} else {
			
			return false;
			}
	}
	
	public static void main(String[] args) {
		
		NumbersUtil.isPalindrome(123321);
		
	}
	
	
}


