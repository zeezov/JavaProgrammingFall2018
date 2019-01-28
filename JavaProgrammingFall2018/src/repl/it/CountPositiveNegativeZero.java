package repl.it;

import java.util.Arrays;
import java.util.Scanner;

public class CountPositiveNegativeZero {
	public static void main(String[] args) {
		
	Scanner inp = new Scanner(System.in);
    int size = inp.nextInt();
    int[] arr = new int[size];
    
    for(int i=0 ;i<=size-1;i++) {

        arr[i]=inp.nextInt();
    }

    System.out.println(Arrays.toString(arr));
    
    plus_minus(arr);
    
    }
	
	public static void plus_minus(int[] num) {
		
		int positive = 0;
		int negative = 0;
		int zero = 0;
		
		for (int i = 0; i < num.length; i++) {
			if(num[i] > 0) {
				positive += 1;
			} else if (num[i] < 0) {
				negative += 1;
			} else {
				zero += 1;
			}
		}
		System.out.println("Positive " + positive + " negative " + negative + " zero " + zero);
		
		
	}
    
}
