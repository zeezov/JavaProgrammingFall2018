package day22_Loops5_andNestedLoops;

public class Nested_Loop_Example {
	public static void main(String[] args) {

		/*
		 * Loop inside the loop Outer loop, inner/nested loop
		 */

		for (int k = 1; k <= 5; k++) {
			for (int i = 1; i <= 10; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//modify neste loops above so it prints this pattern
		
		/*
		 * 1
		 * 12
		 * 123
		 * 1234
		 * 12345
		 * 123456 
		 * 1234567
		 * 12345678
		 * 123456789
		 * 12345678910
		 */
		
		for (int n = 1; n <= 10; n++){
			for (int z = 1; z <= n; z++) {
				System.out.print(z + " ");
			}
			System.out.println();
		}
		
		
		for (int n = 10; n >= 1; n--){
			for (int z = 1; z <= n; z++) {
				System.out.print(z + " ");
			}
			System.out.println();
		}
		
		
	}

}
