package day21_Loops4;

public class Continue {
	public static void main(String[] args) {
		
		/*
		 * 
		 */
		
		for(int i = 1; i <=5; i++){
			   System.out.println(i);
			if(i > 2) {
				break;
			}
		}	
		
		for (int k = 0; k <= 10; k++) {
			if (k == 1 || k == 2) {
				continue; // will not include 1 an 2 numbers
			}
			System.out.println("Value of K " + k);
		}
		
		
		/*
		 * loop through numbers from 1 - 50
		 * print each number in same line, seperated by space
		 * if a numer is divisible by 5 then skip it
		 * if a number is divisible by 20 than exit the loop
		 */
		
		for (int i = 1; i <= 50; i++) {
			if (i % 5 == 0) {
				continue;
			} 
			
			if (i % 2 == 0) {
				break;
			}
			
			System.out.print(i + " ");
			
		}
		
		
		//
		
	}

}
