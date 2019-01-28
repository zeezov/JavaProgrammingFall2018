package day38_WrapperClasses;

public class ConvertingStringToPrimitives {
	public static void main(String[] args) {
		
		String count = "432";
		
		int iCount = Integer.parseInt(count);// convert String to int
		
		if (iCount > 0) {
			System.out.println("Count is positive");
		} else {
			System.out.println("Count is negative");
		}
		
		String str = "Price is 45.77";
		String[] sp = str.split(" ");
		double price = Double.parseDouble(sp[2]);
		System.out.println(price);
		
		String etsyResult = "wooden spoon (13,950 Result)";
		
		String[] sp1 = etsyResult.split(" ");
		String strSpoonCount = sp1[2].replace("(", "").replace(",", "").replace(")", "");
		int price1 = Integer.parseInt(strSpoonCount);
		System.out.println(price1);
		
	}

}
