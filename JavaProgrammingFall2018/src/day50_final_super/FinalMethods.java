package day50_final_super;

// #2

public class FinalMethods {
	
	public final void makeAPhoneCall(String phoneNumber) {
		System.out.println("Dial number: " + phoneNumber + "\n Press On Call");
	}
	
	public static final void readSMSMessage(String sender) {
		System.out.println("Open message and red for " + sender);
	}

}

class Sub extends FinalMethods {
	
	// Cannot override ingerited final method
	
//	public void makeAPhoneCall(String phoneNumber) {
//		
//	}
	
	// this is overloading. This way we can use it. 
	public void makeAPhoneCall(int number) {
		
	}
	
	
}