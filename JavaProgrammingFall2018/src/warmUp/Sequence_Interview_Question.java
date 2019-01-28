package warmUp;

public class Sequence_Interview_Question {
	
	public static void main(String[] args) {
		
		System.out.println(getSequence(2,7));
		
	}
	
	/*
	 * num1 and num2
	 * num1 is first number that will be multiplied by 2
	 * num2 is how many numbers to display
	 * 
	 * 2,4 = 4,8,16,32
	 * 3,5 = 6,12,24,48,96
	 * 4,4
	 * 
	 */
	
	public static String getSequence(int num1, int num2) {
		
		StringBuilder sb = new StringBuilder();
			
		for (int i = 1; i <= num2; i++) {
			num1 = num1 * 2;
			sb.append(num1 + ", ");
			
		}
		
		return sb.substring(0,sb.length()-2).toString();
		
		
	}
	
	
	

}
