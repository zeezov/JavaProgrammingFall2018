package day24_Arrays_Intro;

public class MultiplicationTableWithWarmUpV2 {
	public static void main(String[] args) {
		
		/*
		 * Multiplication Table Version 2
		 * Task from Day24 Java
		 */
		
		System.out.println("==============================================================================");
		System.out.println("                              Multiplication Table");
		System.out.println("==============================================================================");
		
		//int result = 0;
		
		for (int i = 0; i <= 12; i++) {
			//System.out.println("--");
			
			for (int k = 0; k <= 12; k++) {
				if (i == 0 && k == 0) {
					System.out.print("|     ");
					continue;
				}
				//System.out.print(k * i + "\t");
				System.out.printf("| %3d ", (i == 0 || k == 0) ? (i == 0 ? k : i) : i * k);
				
			}
			System.out.println("|");
			if (i == 0) {
				System.out.println(" ------------------------------------------------------------------------------");
			}
	
		}
		System.out.println("===============================================================================");
		
	}

}
