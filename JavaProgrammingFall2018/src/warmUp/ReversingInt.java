package warmUp;

import java.util.Arrays;

public class ReversingInt {
	public static void main(String[] args) {
		
		int[] arr = {6,5,4,3,2,1};
		
		for (int k = 0; k < arr.length / 2; k++) {
			
			int temp = arr[k];
			arr[k] = arr[arr.length - k - 1];
			arr[arr.length - k - 1] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
