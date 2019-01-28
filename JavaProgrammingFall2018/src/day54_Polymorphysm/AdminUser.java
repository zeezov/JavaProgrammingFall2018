package day54_Polymorphysm;

public class AdminUser extends SlackUser {
	
	boolean isOwner;

	public AdminUser(int age, String name, boolean isOwner) {
		super(age, name);
		this.isOwner = isOwner;
	}
	
	@Override
	public void sendMessage(String message) {
		System.out.println("Adming user can send message " + message + " with @channel");
	}
	
	void activateUser(String name) {
		System.out.println("Adming user Activate user " + name);
	}
	
	void deactivateUswer(String name) {
		System.out.println("Adming user Deactivate " + name);
	}
	
}
