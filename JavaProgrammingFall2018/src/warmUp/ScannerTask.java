package warmUp;

import java.util.Scanner;

public class ScannerTask {
	public static void main(String[] args) {
		
		Scanner input  = new Scanner(System.in);
		System.out.println("Please enter integer");
		int i = input.nextInt();
		System.out.println("please enter doulbe");
		double d = input.nextDouble();
		System.out.println("please enter String");
		input.nextLine();
		String s = input.nextLine();
		
		System.out.println("Int: " +i);
		System.out.println("Double: " + d);
		System.out.println("String: " + s);
		
	}

}
