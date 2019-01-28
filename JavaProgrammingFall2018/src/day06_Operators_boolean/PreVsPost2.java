package day06_Operators_boolean;

public class PreVsPost2 {
	public static void main (String[] args) {
		
		int a = 1;
		a++;
		System.out.println(a);
		++a; // ands 1 to previouse variable as well
		System.out.println(a);
		
		int b = 1;
		System.out.println(b++);
		System.out.println(b);
		
		int c = 1;
		System.out.println(++c);
		System.out.println(c);
		
		//more examples with other variables
		int d, e;
		d = 1;
		e = d++;
		
		System.out.println("e: " + e);
		System.out.println("d: " + d);
		
	}
	
	

}
