package day32_MethodWithReturn01;


public class MethodWithParameters {
	public static void main(String[] args) {
		
		String newEmail = buildEmail("Mike", "Smith");
		System.out.println(newEmail.toLowerCase());
		// also
		System.out.println(buildEmail("John", "Doe").toLowerCase());
		
		int bigNum =  getMax(1,2);
		System.out.println(bigNum);
		// also
		System.out.println(getMax(4,5));
		
		int largest = getMax3(10,5,3);
		System.out.println(largest);
		
		largest = getMax3(10,10,3);
		System.out.println(largest);
		
		largest = getMax3(10,50,30);
		System.out.println(largest);
		
		largest = getMax3(10,10,300);
		System.out.println(largest);
		
		boolean valid = isValidDay("Monday");
		System.out.println(valid); // true
		
		valid = isValidDay("funday");
		System.out.println(valid); // false
		
		
	}

	// buildEmail that will accept 2 String parms: firstName and lastName and 
	// return a full email by adding @gmail.com
	
	public static String buildEmail(String firstName, String lastName) {
		String email = firstName + "_" + lastName + "@gmail.com";
		return email;
	}
	
	// Method getMax that accepts to ints and returns larget one
	
	public static int getMax(int n1, int n2) {
		if (n1 > n2) {
			return n1;
		} else {
			return n2;
		}
	}
	
	// Method getMax3 that accepts 3 ints and returns largest value
	
	public static int getMax3(int n1, int n2, int n3) {
		int largest;
		if (n1 > n2) {
			largest = n1;
		} else if (n2 > n3) {
			largest = n2;
		} else {
			largest = n3;
		}
		
		return largest;
	}
	
	// isValidDay method: Accpets a weekDayname, and checks
	// if it is a valdi aone of 7 days then retrun true, otherwise false
	
	public static boolean isValidDay (String day) {
		day = day.toLowerCase().trim();
		
		if (day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") ||
			day.equals("thursday") || day.equals("friday") || day.equals("saturday") || 
			day.equals("sunday")) {
				return true;
		} else  {
			return false;
		}
		
	}
	
	// #2
//	
//	if (day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") ||
//			day.equals("thursday") || day.equals("friday") || day.equals("saturday") || 
//			day.equals("sunday")) {
//				return true;
//		} 
//		return false;
//		
	
	// #3
	
//	return (day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || 
//			   day.equals("thursday") || day.equals("friday") || day.equals("saturday") ||
//			   day.equals("sunday"));
	
	
}
