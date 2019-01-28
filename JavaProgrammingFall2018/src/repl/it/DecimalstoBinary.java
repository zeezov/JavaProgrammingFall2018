package repl.it;

import java.util.Arrays;
import java.util.Scanner;

public class DecimalstoBinary {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    
	    int decimal = input.nextInt();
	    int[] binary = new int[8];
	    
	    if (decimal<=1000000000) {
		    
		    for (int i = 0; i < binary.length; i++) {	
		    	binary[binary.length-i-1]=decimal%2;
		    	decimal=decimal/2;
			}
		    System.out.println(Arrays.toString(binary));
		    } else {
		    	System.out.println("Please enter less than 255");
			}
		    input.close();
		
	}

}
