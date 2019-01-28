package day18_Loops1;

public class WarmUP_StringManupulation {
	public static void main(String[] args) {

		/*
		 * Task 1: -Create a string variable SMSmessage, assign following value:
		 * "Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}"
		 * -Create 3 string variables: sender, phoneNumber,message - by using indexOf
		 * and substring methods, retrieve related information from SMSmessage string
		 * and assign to those 3 variables.
		 * 
		 * -print each variable in separate line
		 * 
		 * 
		 */

		String smsMessage = "Sender:<Mike Smith>. From Number: [202-123-3456]. Message: {I love programming and problem solving}";

		String name = smsMessage.substring(smsMessage.indexOf("<") + 1, smsMessage.indexOf(">"));
		String phoneNumber = smsMessage.substring(smsMessage.indexOf("[") + 1, smsMessage.indexOf("]"));
		String message = smsMessage.substring(smsMessage.indexOf("{") + 1, smsMessage.indexOf("}"));

		System.out.println("Name: " + name);
		System.out.println("Phone number: " + phoneNumber);
		System.out.println("Message: " + message);

		System.out.println("============================================");

		/*
		 * Task 2: 
		 * Contains method: -Create a String variable garage and Assign
		 * following string: "Toyota, Nissan, Honda, BMW, Mazerati, Ford" -convert whole
		 * garage into lowercase letters -if garage isEmpty print "no cars in garage"
		 * -using contains method check:
		 * 
		 * -if garage contains "toyota" or "nissan" print
		 * "There is a Japanese car in garage" if not print "No Japanese cars" 
		 * -if
		 * garage has "bmw" print "there is a german car in garage" 
		 * if not print
		 * "no german cars" 
		 * -if garage has "Mazerati" print
		 * "there is an italian car in garage" if not print "no italian cars" 
		 * - if
		 * garage has "jaguar" print "there is an british car in garage" if not print
		 * "no british cars"
		 */
		
		String garage = "Toyota, Nissan, Honda, BMW, Mazerati, Ford";
		garage = garage.toLowerCase();
		System.out.println(garage);
		
		//if garage isEmpty print "no cars in garage"
		if (garage.isEmpty()) {
			System.out.println("No cars in garage");
		}
		
		//how do you find one string within another string?
		//1. Contains method
		//2. IndexOf > - 1
		if (garage.contains("toyota") || garage.contains("nissan")) {
			System.out.println("There are Japanise cars in garage");
		} else {
			System.out.println("No Japanies cars");
		}
		
		if (garage.indexOf("bmw") > -1) {
			System.out.println("There is a german car in garage");
		} else {
			System.out.println("No german cars");
		}
		
		if (garage.indexOf("mazerati") > -1) {
			System.out.println("There is a Italian car in garage");
		} else {
			System.out.println("No Italian cars");
		}
			
		if (garage.contains("jaguar")) {
			System.out.println("There is British car in garage");
		} else {
			System.out.println("No british car");
		}

	}
}
