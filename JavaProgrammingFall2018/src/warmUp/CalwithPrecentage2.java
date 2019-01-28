package warmUp;


public class CalwithPrecentage2 {
	public static void main(String[] args) {

		/*
		 * Build a program that asks user to enter unit price and quantity
		 * and depending on that calculates %
		 * if 100 - 120 qty 10% discount
		 * if over 120 qty 15% discount
		 * if less than 100 qty no discount
		 * 
		 */
		
		int price = 10;
		int qty = 100;
		
		double grandTotal = 0, discount = 0, total = 0, discountApplied = 0; 
		
		
		if(qty >= 100 && qty <= 120) {
			discount = 0.10; // 10% discount
			total = price * qty;
			discountApplied = total * discount;
			grandTotal = total;
			
		} else if (qty >= 120) {
			discount = 0.15; // 15% discount
			total = price * qty;
			discountApplied = total * discount;
			grandTotal = total;
		
		} else if (qty <= 100) {
			discount = 0;
			total = price * qty;
			discountApplied = total * discount;
			grandTotal = total;
		
		}
			
		System.out.println("Your grand total is " + grandTotal);
		System.out.println("Discount is " + discount * 100 + "%");
		System.out.println("Discount amount " + discountApplied);
		System.out.println("Total after discount " + (grandTotal - discountApplied));
	}

}
