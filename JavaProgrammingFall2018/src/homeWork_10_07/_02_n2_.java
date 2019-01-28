package homeWork_10_07;

public class _02_n2_ {
	public static void main(String[] args) {

		/*
		 * 2) take this array : int[] a = new int[]{4,5,6}; and create an array called b
		 * with the length of a + 1 more position. if the first array size is 3 the
		 * second array size should be 3+1. output the b array size to console.
		 * (remember an array positions start from zero but the length counts the actual
		 * number in an array,if an array has 3 positions its length will be 3 when you
		 * create a new array you will need the actual number of positions).
		 */
		
		int[] a = new int[]{4,5,6};
		
		int[] b = a;
		 
		//int[] b = new int[a.length+1]; also can be done this way
		
		System.out.println(b.length);
		
		
	}

}
