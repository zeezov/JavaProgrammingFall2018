package officeHours;

public class Loop_CharAt {
	public static void main (String[] args) {
		
		//charAt()
		//phone -> enohp
		
		String str = "phone";
		System.out.println(str.charAt(4) + "" + str.charAt(3));//and so on. This is a hard way
		
		int count =  str.length() - 1;
		String str1 = "";
		
		
		while (count >= 0) {
			str1 = str1 + str.charAt(count);
			count--;
		}
		
		System.out.print(str1); System.out.println("");
		
		
		System.out.println("=================================");
		
		String word = "Cybertek";
		System.out.println(word.indexOf("r"));
		System.out.println(word.charAt(1));
		
		//Instead of "Cybertek" make it "Cyber - Check"
		
		System.out.println(word.substring(0,5) + " - Check");
		
	}

}
 