package day43_Static_Constractors02;

public class AppUser_05 {
	
	private String userID;
	private String name;
	private String password;
	private static int count;
	
	
	public AppUser_05() {
		count++;
	}
	
	public AppUser_05(String userID, String name, String password) {
		
		this.userID = userID;
		this.name = name;
		this.password = password;
		count++;
	}
	
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	

}
