package day32_MethodWithReturn01;

public class AccumulatorMethods {
	public static void main(String[] args) {
		
	String myStars = getStars(5);
	System.out.println(myStars);
	
	//also
	System.out.println(getStars(10));
	
	int[] nums = {1,2,3,4,5,6,7,8,7,6,5,4,3,2,1};
	
	for (int n : nums) {
		System.out.println(getStars(n));
	}
		
	}
	
	// method get starts that accepts an int and returns a String
	// it will return that many * from method
	// getStarrs(5) -> *****
	// getStarrs(2) -> **
	
	public static String getStars(int count) {
		
		String temp = "";
		
		for (int i = 1; i <= count; i++) {
			temp += "*"; // add one more star
		}
		
		return temp;
		
	}
	
	// if we want to use void
	
	public static void printStars(int count) {
		
		String temp = "";
		
		for (int i = 1; i <= count; i++) {
			temp += "*"; // add one more star
		}
		
		System.out.println(temp);
		
	}
	

}
