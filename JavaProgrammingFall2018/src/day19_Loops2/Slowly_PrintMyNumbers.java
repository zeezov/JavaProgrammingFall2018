package day19_Loops2;

public class Slowly_PrintMyNumbers {
	public static void main (String[] args) throws InterruptedException {
		
		/*
		 * Wrtie a program to print numbers and slow it down
		 */
		
		int num = 1;

		while (num <= 10) {
			System.out.print(num + ", ");
			num++;
			Thread.sleep(1000); //to slow the output down. 1000 milliseconds == 1 second
		}
		
	}

}
