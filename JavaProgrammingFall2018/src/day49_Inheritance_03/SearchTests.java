package day49_Inheritance_03;

public class SearchTests {
	public static void main(String[] args) {
		
		SearchEngine srch = new SearchEngine();
		
		srch.search("Iphone charger");
		
		Google google = new Google();
		
		google.search("Java overriding rules");
		
		Etsy etsy = new Etsy();
		
		etsy.search("Wooden Spoon");
		
	}

}
