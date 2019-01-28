package warmUp;

public class Fibionacci {
	
	public static void main(String[] args) {
		
	for(int i = 1; i <= 10; i++) {
		System.out.print(fibionacci(i) + " ");
	}	
		
	}
	
	public static int fibionacci(int n) {
		if(n == 1) {
			return 0;
		}
		if (n == 2) {
			return 1;
		}
		int beforePreviouse = 0;
		int previouse = 1;
		int fib = 1;
		
		for (int i = 3; i <= n; i++) {
			
			fib = beforePreviouse + previouse;
			beforePreviouse = previouse;
			previouse = fib;
		}
		
		return fib;
		
	}
	
	

}
