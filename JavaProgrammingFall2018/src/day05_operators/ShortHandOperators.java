package day05_operators;

public class ShortHandOperators {
	public static void main(String[] args) {
		
		int count = 100;
		count = count + 1;
			System.out.println(count);
			
			//add 10 to count, same way:
		count = count + 10;
			System.out.println(count);
			//you can also do:
			//+=, -=, *=, /=, %=
		count += 10;
		count -= 10;
		count *= 10;
		count /= 10;
		count %= 10;
			System.out.println(count);
		
		//decimal
		double price = 14.4;
		price /= 2;
			System.out.println(price);
			
			//remainder
		int i = 100;
			System.out.println(i % 8);
			
			
	}

}
