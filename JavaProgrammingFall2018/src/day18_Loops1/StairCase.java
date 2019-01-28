package day18_Loops1;

public class StairCase {
	public static void main (String[] args) {
		
		/*
		 * *
		 * * *
		 * * * * 
		 * * * * *
		 * * * * * *
		 * * * * * * *
		 */
		
		String stairs = "";
		int count = 1;
		
		while (count <= 5) {
			stairs = stairs + " * ";
			System.out.println(stairs);
			count++;
			
		}
		
	}

}
