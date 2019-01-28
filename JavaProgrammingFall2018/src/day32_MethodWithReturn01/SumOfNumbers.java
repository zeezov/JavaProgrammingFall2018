package day32_MethodWithReturn01;

public class SumOfNumbers {
	public static void main(String[] args) {
		
		int myNum = num(3);
		System.out.println(myNum);
		
	}
	
	/*
	 * method: sumToN: accepts an int and return sum of ints starting from 1 to that int.
	 * sumToN(3) -> 6  (1+2+3)
	 * sumToN(5) -> 15 (1+2+3+4+5)
	 */
	
	public static int num (int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
			System.out.println(i);
		}
		return sum;
	}

}
