package day32_MethodWithReturn01;

public class MethodsWithReturns {
	public static void main(String[] args) {
		
		int amount = giveMe5$();
		System.out.println(amount);
		//also
		System.out.println(giveMe5$());
		
		String president = getPresidentsName();
		System.out.println(president);
		//aso
		System.out.println(getPresidentsName());

	}
	
	public static int giveMe5$() {
		int d = 5;
		return d;		
	}
	
	public static String getPresidentsName() {
		return "Nazim Shaazizov";
	}
	
	public static String whatIsYourName() {
		String name = "Nazim";
		return name;
	}

}
