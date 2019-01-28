package repl.it;

import java.util.Arrays;

public class StringBuilderToBeOrNotTobe {
	public static void main(String[] args) {
		
		StringBuilderToBeOrNotTobe m = new StringBuilderToBeOrNotTobe();
		
		StringBuilder str = new StringBuilder("false, true");
		
		boolean tst = m.toBe(str);
		System.out.println(tst);
		
	}
	
	public boolean toBe(StringBuilder r) {
		
		String[] str = r.toString().split(",");
		
		for (int i = 0; i < str.length; i++) {
			if(str[i].equals("true")) {
				return true;
			}
		}
		
		return false;
	}

}
