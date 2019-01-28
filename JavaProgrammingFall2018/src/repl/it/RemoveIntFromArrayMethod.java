package repl.it;

import java.util.Arrays;

public class RemoveIntFromArrayMethod {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3 };
		int element = 2;

		System.out.println(Arrays.toString(deleteR(arr, element)));
	}

	public static int[] deleteR(int[] arr, int element) {

		int[] newArr = new int[arr.length - 1];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				continue;
			}
			newArr[index] = arr[i];
			index++;
		}

		return newArr;

	}// end deleteR
}
