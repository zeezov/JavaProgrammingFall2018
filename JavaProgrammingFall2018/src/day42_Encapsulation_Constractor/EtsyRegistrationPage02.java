package day42_Encapsulation_Constractor;

public class EtsyRegistrationPage02 {
	public static void main(String[] args) {

		EtsyAccount01 account1 = new EtsyAccount01();

		account1.setEmail("etsy1@gmail.com");
		account1.setFirstName("Bob");
		account1.setPassword("bob12345");

		EtsyAccount01 account2 = new EtsyAccount01();

		account2.setEmail("etsy2@gmail.com");
		account2.setFirstName("Bill");
		account2.setPassword("bill54321");

		EtsyAccount01 account3 = new EtsyAccount01();

		account3.setEmail("etsy3@gmail.com");
		account3.setFirstName("_");
		account3.setPassword("123");
		
		// use getters to read data
		System.out.println("First name of account1: " + account1.getFirstName());
		
		
		EtsyAccount01 account4 = new EtsyAccount01();
		
		account4.setAccountInfo("abc@yahoo.com", "Ben", "1234567");
		
		System.out.println(account4.getEmail() + " | " + account4.getFirstName() + " | " + account4.getPassword());
		
		// how to change email
		
		account4.setEmail(account4.getEmail().replace("yahoo", "gmail"));
		
		System.out.println(account4.getEmail() + " | " + account4.getFirstName() + " | " + account4.getPassword());
		
		// calling the new return method getAccountinfo()
		System.out.println(account4.getAccountinfo());
		
		
		EtsyAccount01 yourAccount = new EtsyAccount01();
		yourAccount.setAccountInfo("yourEmail123@gmail.com", "Apple", "moacbook34");
		String accountInfo = yourAccount.getAccountinfo();
		
		System.out.println(accountInfo);
		

	}

}
