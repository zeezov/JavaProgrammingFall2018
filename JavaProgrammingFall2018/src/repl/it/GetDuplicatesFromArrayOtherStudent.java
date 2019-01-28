package repl.it;

public class GetDuplicatesFromArrayOtherStudent {
	
	public static void main (String [] args) {
	    
	    String[] str = {"1","2","aa","1"};
	    
	    getDup(str);
	  }
	  
	  public static int getDup(String[] r) {
	   
	    String unique = "";
		
			String current = "";
			
			int count = 0;
			
			for (String x : r) {
				current = x;
				count = 0;
				for (String y : r) {

					if (current.equals(y)) {

						count++;
					}

				}

				if (count == 1) {//if it is not duplicated add unigue 
					unique += current;
				}
			}

			return r.length - unique.length();
	    
	  } 

}
