package day54_Polymorphysm;

public class CellPhone extends Phone {
	
	int buttonCount = 20;
	boolean isTouchScreen;
	
	@Override
	public void makeCall() {
		System.out.println("Call by Cellphone " + buttonCount);
	}
	
	public void callWithoutCable() {
		System.out.println("A method thta cellPhoneOnly");
	}
	
	public static void main(String[] args) {
		
		
		// Only refernce type decide what you can access using that reference variable
		
		Phone p1 = new CellPhone();
			p1.makeCall();
			System.out.println(p1.buttonCount);
		
			
		
		
	}

}
