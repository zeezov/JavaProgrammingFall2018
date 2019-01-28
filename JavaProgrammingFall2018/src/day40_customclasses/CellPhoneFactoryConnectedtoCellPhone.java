package day40_customclasses;

public class CellPhoneFactoryConnectedtoCellPhone {
	public static void main(String[] args) {
		
		
		// create object from CellPhone class
		CellPhone phone1 = new CellPhone(); 
		
		phone1.brand = "Apple Iphne XS";
		phone1.color = "Piono Black";
		phone1.price = 999.0;
		
		phone1.call();
		phone1.text();
		
		// create 2 cellphone objects
		CellPhone phone2 = new CellPhone();
		CellPhone phone3 = new CellPhone();
		
		// assing value to object variables
		phone2.brand = "Ericson 1018";
		phone2.color = "Silver";
		phone2.price = 30.5;
		
		phone3.brand = "HTC Evo";
		phone3.color = "Black";
		phone3.price = 350.99;
		
		// object class method
		phone2.call();
		phone3.text();
		
		System.out.println("phone1 brand - " + phone1.brand);
		System.out.println("phone2 brand - " + phone2.brand);
		System.out.println("phone3 brand - " + phone3.brand);
		
		
		
		// calculate total price for all 3 price
		System.out.println("Total for all 3 phones $" + (phone1.price + phone2.price + phone3.price));
		
		// can we updated object values? yes
		
		phone1.price = 1200.0;
		phone2.price = phone3.price;
		
		System.out.println("phone1 price $" + phone1.price);
		System.out.println("phone2 price $" + phone2.price);
		System.out.println("phone3 price $" + phone3.price);
		
		
		// Cellphone.call() wont work, call is not static
		
		
	}

}
