package day27_Arrays04;

public class ArrayCopySomeValuesFoorLoop {
	public static void main(String[] args) {

		String[] arr = {"remote", "local", "break", "cell", "brain", "cheese"};

		// count how many words have 'e' in the arr

		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].contains("e")) {
				counter++;
			}
		}

		// create array fewValues, with size of counter
		String[] fewValues = new String[counter];

		// go over arr one more time and add the words with 'e' into values
		int i = 0;

		for (int j = 0; j < arr.length; j++) {
			if (arr[j].contains("e")) {
				fewValues[i] = arr[j];
				i++;
			}
		}

		for (String val : fewValues) {
			System.out.print(val + " ");
		}

	}

}
