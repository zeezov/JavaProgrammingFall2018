package day54_Polymorphysm;

public abstract class SlackUser {
	
	int age;
	String name;
	
	
	public SlackUser(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	public abstract void sendMessage(String message);
	

}
