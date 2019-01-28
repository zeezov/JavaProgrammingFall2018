package repl.it;

public class uniqueChar {
	public static void main(String[] args) {
		
		System.out.println(uniqueChars("java"));

	}

	/*
	 * uniqueChars is a method that you will code now, should be able to accept any
	 * string in the world and return unique characters from the parameter.
	 * 
	 * Examples:
	 * 
	 * uniqueChars("java") ==> "jav"
	 * 
	 * uniqueChars("mama") ==> "ma"
	 * 
	 * uniqueChars("spoon") ==> "spon"
	 */
	
	public static String uniqueChars(String str) {
		
		String newStr="";
	       
	       for (int i = 0; i < str.length(); i++) {
	        if(!newStr.contains(str.substring(i,i+1)))
	        newStr+=str.substring(i,i+1);
	          
	    }
	       return newStr;
	}

}
