package day39_StringBuilder;

public class AppendAlphabet {
	public static void main(String[] args) {
		
		char ch = 'A';
		ch++;
		System.out.println(ch); // will print B
		
		
		for(char chars = 'A'; chars <= 'Z'; chars++) {
			System.out.print(chars);// will print whole Alphabet
		}
		
		System.out.println();
		
		// this is how to put whole Alphabet into StringBuilder
		StringBuilder alp = new StringBuilder();
		
		for(char chars = 'A'; chars <= 'Z'; chars++) {
			alp.append("[" + chars + "]");
		}
		System.out.println(alp);
		
	}

}
