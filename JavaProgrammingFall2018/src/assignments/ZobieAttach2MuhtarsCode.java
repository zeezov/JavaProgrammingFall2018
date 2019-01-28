package assignments;

import java.util.*;

public class ZobieAttach2MuhtarsCode {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of cities");
		int city = scan.nextInt(), days = 1;
		int[] populations = new int[city];

		for (int z = 0; z < city; z++) {
			System.out.println("enter the populations for city #" + (z + 1) + " : ");
			int people = scan.nextInt();
			populations[z] = people;
		}
		System.out.println("day 0 popilations are: " + Arrays.toString(populations));
		while (true) {
			for (int i = 0; i < populations.length; i++) {
				populations[i] = populations[i] / 2;
			}
			int EndIsNear = 0;
			for (int z : populations) {
				EndIsNear += z;
			}
			days++;
			System.out.println("day " + days + " popilations are: " + Arrays.toString(populations));
			if (EndIsNear == 0) {
				break;
			}
		}

	}

}
