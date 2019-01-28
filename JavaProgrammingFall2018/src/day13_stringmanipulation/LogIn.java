package day13_stringmanipulation;

public class LogIn {
	public static void main(String[] args) {
		
		String secretUserName = "admin123";
		String secretPassword = "abc123";
		
		//2 variables username and password
		//make sure they match with secret once and allow log in succesifuly
		//if not log in unsecssessiful
		//whenever login is not seccesiful, let program tell exact reason
		//why it is not valid
		//user name is not valid or password is not valid or
		//bot are not valid
		
		String userName = "AdmiN23";
		String password = "abc3123";
				//to use both lower case and upper
		if (userName.equalsIgnoreCase(secretUserName) && password.equals(secretPassword)) {
			System.out.println("Logged in");
		} else {
			if (!userName.equalsIgnoreCase(secretUserName) && !password.equals(secretPassword)) {
				System.out.println("Both username and password are not valid");
			} else if (!userName.equalsIgnoreCase(secretUserName)) {
				System.out.println("Username is not valid");
			} else {
				System.out.println("Password is not valid");
			}
		}
		
	}

}
