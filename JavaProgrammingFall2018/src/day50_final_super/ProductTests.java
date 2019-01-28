package day50_final_super;

// #6

public class ProductTests {
	public static void main(String[] args) {
		
		Product p1 = new Product("Sony PlayStation");
		
		System.out.println(p1);
		
		Electronics el = new Electronics("Dyson vacum V8", 450.50);
		
		System.out.println(el.toString());
		
		el.buy();
		
		//System.out.println(Product.IS_AVAILABLE);
		//System.out.println(Electronics.IS_AVAILABLE);
		
		
	}

}
