package day54_Polymorphysm;

public interface WebDriver {
	
	
	/*
	 * 4 things we can have inside interface
	 * 	1. CONSTANT -> public static final variable
	 * 	2. ABSTRACT METHOD 
	 * 	3. DEFAULT METHOD
	 * 	4. STATIC METHOD
	 */
	
	public void navigate(String url);
	public void open();
	public void close();
	default void quite() {
		System.out.println("I am default method from interface WebDriver");
	}

}
