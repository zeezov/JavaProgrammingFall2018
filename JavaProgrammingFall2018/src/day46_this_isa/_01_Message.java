package day46_this_isa;

public class _01_Message {
	
	private String body;
	private String sender;
	private String receiver;
	
	
	/*
	 * this() Whenever overloaded constructors do similar steps, we can call a constructor from
	 * another constructor using this()
	 * 
	 * this() will always come first on the body of Constructor
	 * 
	 */
	
	// toString method is special method. Normally used to discribe the object in String format
	public String toString() {
		return "_01_Message [body=" + body + ", sender=" + sender + ", receiver=" + receiver + "]";
	}
	
	
	public _01_Message(String body, String sender, String receiver) {
		
		this.body = body;
		this.sender = sender;
		this.receiver = receiver;
		
	}
	
	// overload the constructor
	public _01_Message(String body) {
		
//		this.body = body;
//		this.sender = "unknown";
//		this.receiver = "unknown";
		
		// changint it to this()
		this(body, "unknown", "unknown");
	
	}
	

	// overload the constructor
	public _01_Message(String body, String receiver) {
		
//		this.body = body;
//		this.sender = "unknown";
//		this.receiver = receiver;
		
		// changint it to this()
		this(body, "unknown", receiver);
		
	}
	// overload the constructor
	public _01_Message() {
//		
//		this.body = "";
//		// on empty Constructor we dont have to use this.
//		sender = "unknown";
//		receiver = "unknown";
		
		// changint it to this()
		this("", "unknown", "unknown");
		
		
	}
	
	
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	
	

}
