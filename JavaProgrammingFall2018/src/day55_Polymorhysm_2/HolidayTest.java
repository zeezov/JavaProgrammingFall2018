package day55_Polymorhysm_2;

public class HolidayTest {
	public static void main(String[] args) {
		
		// after line 20 this will be Garbage collected
	  Holiday h1 = new Christmas();
	  	
	  	h1.sendHolidayMessage();
	  	
	  // Down Casting. Happens when we want to call methods from sub-class 
	  Christmas c1 = (Christmas) h1;
	  	c1.exchangeGifts();
	  	
	  	// only reference type decide what you can access at compile time
	  
//	  Holiday h2 = new NewYear();
//	  
//	  	h2.sendHolidayMessage();
	  	
	  	h1 = new NewYear();
	  	h1.sendHolidayMessage();
	  	
	  NewYear n1 = (NewYear) h1;
	  	n1.countdown_WelcomeNewBeginning();
	  	
	  	
	  
	  	
	  
		
	}

}
