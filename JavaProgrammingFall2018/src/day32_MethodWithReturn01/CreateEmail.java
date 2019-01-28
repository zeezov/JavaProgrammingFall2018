package day32_MethodWithReturn01;

public class CreateEmail {
	public static void main(String[] args) {
		
		String name = getFirstName().toLowerCase();
		String last = getLastName().toLowerCase();
		
		String email = name + "_" + last + "@gmail.com";
		//System.out.println(name + "_" + last + "@gmail.com");
		
		System.out.println(email.toUpperCase());
		
	}
	
	// Method getFirstName, getLastName
	// Main you will call these methods and build and email
	// String email = [firstname]_[lastname] @gmail.com
	
	public static String getFirstName() {
		return "Nazim";
	}
	
	public static String getLastName() {
		return "Shaazizov";
	}

}
