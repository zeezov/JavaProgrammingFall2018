package day34_methods03;

public class Var_Args {
	public static void main(String[] args) {
		
	sum(10,20);
	
	sumAll(10,20,30,40);
	
	shoppingList("apple", "orange", "table", "watermelon");

	
	
}
	public static void sum(int n1, int n2) {
		System.out.println(n1 + n2);
	}
	
	public static void sumAll(int... nums) {
		System.out.println("Number of inputs: " + nums.length);
		// to get the sum
		int sum = 0;
		for(int num : nums) {
			sum += num;
		}
		
		System.out.println("Sum: " + sum);
	}
	
	// Methods: shoppingList 
	// that has var - args
	// it will print shopping items in single line seperated by space
	
	public static void shoppingList(String... varargs) {
		
		String word = "";
		
		for (String str : varargs) {
			word += str + " ";
		}
		System.out.print("List: " + word);	
	}

}
