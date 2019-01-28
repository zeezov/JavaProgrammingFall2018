package homeWork_10_07;

public class _08_FindHowManyTimesBananaInArray {
	public static void main(String[] args) {

		/*
		 * 8) loop a string array filled with fruit names and count how many instances
		 * of the string "banana" are inside the array, after the loop print how many
		 * instances of banana you find. this is the array: String[] list = new
		 * String[]{"banana","apple","pinapple","banana","mango","banana"};
		 */

		String[] list = new String[] {"banana", "banana", "banana", "apple", "orange", "pinapple", "banana", "mango", "banana"};

		int count = 0;

		for (int i = 0; i < list.length; i++) {
				if (list[i].equals("banana")) {
					count++;
				}
		}
		
		System.out.println("There are " + count + " banana matches in the Array");


	}

}
