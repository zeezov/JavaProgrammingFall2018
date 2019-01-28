package day42_Encapsulation_Constractor;

public class EtsyAccount01 {
	
	private String email;
	private String firstName;
	private String password;
	
	
	public String getAccountinfo() {
		
//		String ret = email + " | " + firstName + " | " + password;
//		return ret;
		
		//or
		
		return email + " | " + firstName + " | " + password;
		
	}
	
	
	public void setAccountInfo(String email, String firstName, String password) {
		
		this.email = email;
		this.firstName = firstName;
		setPassword(password); // calling the password method at the bottom that is already created.
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		
		if(password.length() <= 6) {
			System.out.println("Password must be 6 or more");
			return;
		}
		
		this.password = password;
	}	

}
