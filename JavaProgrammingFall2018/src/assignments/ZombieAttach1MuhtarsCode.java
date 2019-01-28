package assignments;

import java.util.Arrays;

public class ZombieAttach1MuhtarsCode {
	public static void main(String[] args) {
		
		int[] populations = { 3, 6, 0, 4, 3, 2, 7, 1 }, newpopus = new int[populations.length];
		int days=0;
		System.out.println("day "+days+" popilations are: " + Arrays.toString(populations));
		do {
			for (int i = 0; i < populations.length; i++) {
				newpopus[i] = (populations[i] /= 2);
			}
			int EndIsNear = 0;
			for (int z : newpopus) {
				EndIsNear += z;
			}
			days++;
			System.out.println("day " + days + " popilations are: " + Arrays.toString(newpopus));
			if (EndIsNear == 0)
				break;
			
		} while (true);
	




		
	}

}
