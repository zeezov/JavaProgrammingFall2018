package day55_Polymorhysm_2;

public class Christmas extends Holiday implements GiftReciever {
	
	int giftCount;
	
	public void sendHolidayMessage() {
		System.out.println("Merry Christmas");
	}
	
	
	public void exchangeGifts() {
		
		System.out.println("exchangeGifts");
		
	}


	@Override
	public void recieveGift() {
		System.out.println("Recieve gift");
		
	}
	

}
