package day18_Loops1;

public class While_Loop {
	public static void main(String[] args) {
		
		
		//below loop is called infitence loop because b will never be false.
//		boolean b = true;
//		
//		while (b) { // as long as condtions is true, Loop will keep running
//			System.out.println("Hello World!");
//		}
		
		int num = 0;
		
		while (num < 10) {						//to see the actual numbers
			System.out.println("In while Loop " + num);
			num++; // to add 1 more number after each loop
		} 
		
		/* 
		 * Create a varialble counter and assign 1 to it
		 * keep printing the value of the counter as long as counter is less than 15
		 */
		
		int counter = 1;
		
		while(counter < 15) {
			System.out.println(counter);
			counter++;
		}
		
		
	}

}
