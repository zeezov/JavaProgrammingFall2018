package day24_Arrays_Intro;

public class MultiplicationTableWithWarmUp {
	public static void main(String[] args) {

		/*
		 * Please write a program to print multiplication table using nested loops.
		 * 
		 * Version 1 - we will go over this one during the class:
		 * 
		 * Print the table like in image below and you can print in single column, not
		 * in 5 columns. make sure there are borders like in the image:
		 */
		
		//int num = 2;
		
		System.out.println("                       * Multiplication Table *");
		System.out.println();
		System.out.println("=================================================================================");

		
		for (int outer = 1; outer <= 10; outer++) {
			for (int inner = 1; inner <= 5; inner++) {
				int result = outer * inner;
				System.out.print("| " + outer + " x " + inner + " = " + result + "\t|");
			}
			System.out.println();
		}
		
		System.out.println("=================================================================================");
		
		for (int outer = 1; outer <= 10; outer++) {
			for (int inner = 6; inner <= 10; inner++) {
				int result = outer * inner;
				System.out.print("| " + outer + " x " + inner + " = " + result + "\t|");
			}
			System.out.println();
		}
		
	}

}
