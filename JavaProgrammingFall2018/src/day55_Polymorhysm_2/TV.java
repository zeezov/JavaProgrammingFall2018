package day55_Polymorhysm_2;

public class TV {
	public static void main(String[] args) {
		
		TV t = new TV();
		
		System.out.println(t); // will print without toString Override method day55_Polymorhysm_2.TV@33909752
		System.out.println(t.toString()); // will print without toString Override method day55_Polymorhysm_2.TV@33909752
		
	}
	
	@Override
	public String toString() {
		return "TV to String Method";
	}

}
