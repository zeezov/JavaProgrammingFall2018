package day07_conditionals;

public class SwapVarValues {
	public static void main(String[] args) {
		//swap varieable values
		
		int apples = 100;
		int oranges = 200;
		
		//apples = oranges; <-- did not work
		//oranges = apples;
		
		int tempContainer = apples;
		apples = oranges;
		oranges = tempContainer;
		
		System.out.println("Oranges: " + oranges + " apples " + apples);
		
		
		
		
		
		
	}

}
