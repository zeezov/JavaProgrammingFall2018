package day19_Loops2;

public class Snack_Time {
	public static void main(String[] args) {
		
		/*
		 * Create boolean var hungry and assign true 
		 * Create another int var apples and assing 1 
		 * 
		 * As long as you are hungry print "Eating an apple"
		 * and increase the apple.
		 * Once you eat 5 apples you are no longer hungry
		 */
		
		boolean hungry = true;
		int apple = 1;
		
		while (hungry) { 
			System.out.println(apple + ". Eating an apple");
			//apple++;
			if (apple == 5) {
				hungry = false;
			}
			apple++;
		}
			
			
		
		
		
	}

}
