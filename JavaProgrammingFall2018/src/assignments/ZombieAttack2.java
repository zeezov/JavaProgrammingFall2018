package assignments;

import java.util.Arrays;

public class ZombieAttack2 {
	public static void main(String[] args) {
		
		int[] inhabitants = {3,6,0,4,3,2,2,5};
		
		
		int days = 0;
		System.out.println("Day " + days + " " + Arrays.toString(inhabitants));
		
		    while (true) {
		    for (int i = 0; i < inhabitants.length; i++) {
		      if (i < inhabitants.length - 1) {
		        if (inhabitants[i] != 0 && inhabitants[i + 1] == 0) {
		            inhabitants[i] /= 2;
		        }
		        if (inhabitants[i] == 0 && inhabitants[i + 1] != 0) {
		            inhabitants[i + 1] /= 2;
		            i += 1;
		        }
		      }
		    }
		      
		      days++;
		      System.out.println("Day " + days + " " + Arrays.toString(inhabitants));
		      
		      int sum = 0;
		      
		      for (int k : inhabitants) {
		        sum += k;
		      }
		      
		      if (sum == 0) {
		        break;
		      }
		    }
		  
		 
		   System.out.println("---- EXTINCT ----");
		
		
	}

}
