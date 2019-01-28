package assignments;

import java.util.Arrays;

public class ZombieAttack1 {
	public static void main(String[] args) {

		/*
		 * An array of inhabitants represent cities and their respective populations.
		 * For example, the following arrays shows 8 cities and their respective
		 * populations:
		 * [3, 6, 0, 4, 3, 2, 7, 1]
		 * Some cities have a population of 0 due to a pandemic zombie disease that is
		 * wiping away the human lives. After each day, every city will lose half of its
		 * population.
		 * write a program to loop though each city population and make it lose half of
		 * its population until all cities have no humans left. And print like below for
		 * each day:
		 * Day 0 [3, 6, 0, 4, 3, 2, 7, 1]
		 * Day 1 [1, 3, 0, 2, 1, 1, 3, 0]
		 * Day 2 [0, 1, 0, 1, 0, 0, 1, 0]
		 * Day 3 [0, 0, 0, 0, 0, 0, 0, 0]
		 * ---- EXTINCT ----
		 * Write the program in a way that it will handle any number of people in
		 * cities, above was just an example numbers to follow.
		 */
		

		
		int[] cityPop = {9, 8, 7, 6, 5, 4, 3, 2};
		//int[] newPop = new int[cityPop.length];
		
		int day = 0;
		System.out.println("Day " + day + " " + Arrays.toString(cityPop));
		
		while (true) {
			for (int i = 0; i < cityPop.length; i++) {
				cityPop[i] /= 2;
			}
			
			day++;
			System.out.println("Day " + day + " " + Arrays.toString(cityPop));
			
			int sum = 0;
			
			for (int n : cityPop) {
					sum = sum + n;
				}

				if (sum == 0) {
				break;
			}
		}
		System.out.println("===========EXTINCT============");
	}

}
