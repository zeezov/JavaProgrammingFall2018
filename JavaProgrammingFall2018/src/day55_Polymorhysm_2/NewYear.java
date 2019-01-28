package day55_Polymorhysm_2;

public class NewYear extends Holiday {
	
	int dayOffCount;
	
	/*
	 * override --> sendHolidayMessage() 
	   countdown_WelcomeNewBeginning() 
	 */
	
	public void sendHolidayMessage() {
		System.out.println("Happy New Year");
	}
	
	public void countdown_WelcomeNewBeginning() {
		System.out.println("This new 2019 will be different");
	}

}
