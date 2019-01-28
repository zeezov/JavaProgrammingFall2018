package repl.it;

public class LimitString {
	
	  public static void main (String[] args) {
		    
		    System.out.println(limit("abcd",3));
		    
		  }
		  public static String limit(String text, int maxLength) {
		    
		   if(text.length() > maxLength) {
		     text = text.substring(0,maxLength);
		   }
		   return text;

		  }
}