package day25_Arrays02;

public class CountMatches {
	public static void main(String[] args) {
		
		/* 
		 * Creata a double array called price. 
		 * Assign some 10 or more different prices 
		 * Using a loop count how many items that is more than $20
		 * Print the count
		 * If no price was found that is more than $20 then print
		 * "No items that costs more than $20"
		 */
		
		double[] prices = {10, 3, 17, 21, 1, 4, 15, 11, 18, 13};
		int count = 0;
		
		for (double price : prices) {
			if (price >= 20.0) {
				count++;
			} 
		}
		
		if (count == 0) {
			System.out.println("No items for more than $20");
		} else {
			System.out.println(count + " items with more than $20");
		}
		
	}

}
