package day54_Polymorphysm;

public class WebDriverTest {
	public static void main(String[] args) {
		
		
		//Whether object type IS-A reference type
		
		WebDriver driver1 = new ChromeDriver();
			driver1.open();
			driver1.navigate("google");
			driver1.close();
			driver1.quite();
			
		WebDriver driver2 = new FireFoxDriver();
			driver2.open();
			driver2.navigate("Yahoo");
			driver2.close();
			driver2.quite();
			
		WebDriver driver3 = new ChromeDriver();
		
		System.out.println("================================");
			
			// DRY PRINCIPLE --> DO NOT REPEAT YOURSELF
			
		/// Open Chrome - Navigate to Cybertek - Clost it - Quite
		/// Open FireFox - Navigate to Cybertek - Clost it - Quite
		/// Open Chrome - Navigate to Cybertek - Clost it - Quite
		
		// We are using Array to store drivers so we dont have to repeat everytime. 
			
		WebDriver[] driver = {driver1, driver2, driver3};
		//WebDriver[] drivers = {new ChromeDriver(), new FireFoxDriver(), new ChromeDriver()};
		
			for (WebDriver dvr : driver) {
				dvr.open();
				dvr.navigate("cybertekschool");
				dvr.close();
				dvr.quite();
				System.out.println("------------------------------");
			}
		
			
			
		
		
	}

}
