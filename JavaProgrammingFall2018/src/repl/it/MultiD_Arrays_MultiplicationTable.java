package repl.it;

import java.util.Arrays;

public class MultiD_Arrays_MultiplicationTable {
	public static void main(String[] args) {
		
		int[][] mT = new int [10][10];
		
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				mT[i-1][j-1] = i*j;
			}
		}
		System.out.print(Arrays.deepToString(mT));
		
		
	}

}
