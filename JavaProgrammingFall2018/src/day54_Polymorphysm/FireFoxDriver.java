package day54_Polymorphysm;

import java.util.List;

public class FireFoxDriver implements WebDriver {
	
	public void setFireFoxDriver(List<String> options) {
		
		for (String option : options) {
			System.out.println("Setting Firefox options " + option);
		}
		
	}

	@Override
	public void navigate(String url) {
		
		System.out.println("Navigating to " + url + " on FireFox");
		
	}

	@Override
	public void open() {
		
		System.out.println("Opening FireFox browser");
		
	}

	@Override
	public void close() {
		
		System.out.println("closing FireFox browser");
		
	}

	@Override
	public void quite() {
		System.out.println("FireFox quite special");
	}

}
