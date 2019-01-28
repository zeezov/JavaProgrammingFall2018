package day54_Polymorphysm;

public class ChromeDriver implements WebDriver {
	
	public void setChromeOptions(String[] options) {
		
		for(String option : options) {
			System.out.println("Setting opetition "  + option);
		}
		
	}

	@Override
	public void navigate(String url) {
		System.out.println("Navigating to " + url + " on chrome");
		
	}

	@Override
	public void open() {
		System.out.println("Opening chrome browser");
		
	}

	@Override
	public void close() {
		System.out.println("closing chrome browser");
		
	}

	@Override
	public void quite() {
		System.out.println("Chrome quite special");
	}

}
