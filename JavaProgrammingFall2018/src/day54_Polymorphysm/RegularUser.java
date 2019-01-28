package day54_Polymorphysm;

public class RegularUser extends SlackUser {
	
	// from SlackUser
//	int age;
//	String name;
	int groupNumber;
	
	public RegularUser(String name, int age, int groupNumber) {
		super(age,name);
		this.groupNumber = groupNumber;
		
	}
	
	
	public void sendMessage(String message) {
		System.out.println("Regular user send " + message);
	}
	
	public void joinGroup(int groupNumber) {
		System.out.println("Regurlar user joinAGroup " + groupNumber);
		this.groupNumber = groupNumber;
	}
	
	

}
