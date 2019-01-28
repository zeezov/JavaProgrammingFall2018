package day54_Polymorphysm;

public class MainRunner {
	public static void main(String[] args) {
		
		RegularUser u1 = new RegularUser("John", 23,6);
			u1.sendMessage("Hello World");
			u1.joinGroup(43);
		
		AdminUser u2 = new AdminUser(30, "Akbar", true);
			u2.sendMessage("Hello Student");
			u2.activateUser("John");
			u2.deactivateUswer("Heydar");
		
		
	}
	
	

}
