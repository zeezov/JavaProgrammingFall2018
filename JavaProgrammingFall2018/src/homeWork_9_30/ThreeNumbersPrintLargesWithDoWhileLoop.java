package homeWork_9_30;

import java.util.Scanner;

public class ThreeNumbersPrintLargesWithDoWhileLoop {
	public static void main(String[] args) {
		
		//with Do While Loop
		
		Scanner input = new Scanner(System.in);
		
        int num = 0;
        int largest = 0;
        int sum = 0;
		
		do {
			System.out.println("Please enter another 1st numbers");
			int num1 = input.nextInt();
			int num2 = input.nextInt();
			int num3 = input.nextInt();
			num++;
			
			if (num1 > num2) {
				largest = num1;
			} else if (num2 > num3) {
				largest = num2;
			} else {
				largest = num3;
			}
			sum = num1 + num2 + num3;
			break;
			
		} while (num == 0);
			System.out.println("Largest number: " + largest);
			System.out.println("Total is: " + sum);
		input.close();
		
	}

}
