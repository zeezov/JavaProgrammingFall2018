package Monday_Project_10_1;

public class Five {
	public static void main(String[] args) {

		/*
		 * 5. Print numbers between 1 and 20 in a way that:
		 * 
		 * a. numbers are printed with plus signs between them and a space on either
		 * side,
		 * 
		 * b. there should be no plus sign or space before the first number and after
		 * the last number
		 * 
		 * Expected Output: 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 + 11 + 12 + 13 + 14 +
		 * 15 + 16 + 17 + 18 + 19 + 20
		 */
		
		//While Loop
		int num = 1;

		while (num <= 20) {
			if(num == 20) {
				System.out.print(num);
				break;
			}
			System.out.print(num + " + ");
			num++;
			}
		
		
		System.out.println(" ");
		System.out.println("=========================");

		// for loop
		for (int i = 1; i <= 20; i++) {
			if(i == 20) {
			System.out.println(i);
			break;
		}
			System.out.print(i + " + ");
		}
	}

}
