package day43_Static_Constractors02;

public class Application_06 {
	public static void main(String[] args) {
		
		AppUser_05 user1 = new AppUser_05("Iron man", "Mark Smith", "ac123");
		AppUser_05 user2 = new AppUser_05("Postman", "Sar Sma", "a234123");
		AppUser_05 user3 = new AppUser_05("superman", "Hi Joe", "fc16424");
		
		user1.setCount(100);
		
		System.out.println(user1.getCount());
		System.out.println(user2.getCount());
		System.out.println(user3.getCount());
		
		AppUser_05 user4 = new AppUser_05();
		
		System.out.println(user4.getCount());
		
		System.out.println(user1.getName());
		System.out.println(user2.getName());
		
	}

}
