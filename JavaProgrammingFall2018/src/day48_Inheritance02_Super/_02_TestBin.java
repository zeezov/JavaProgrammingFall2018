package day48_Inheritance02_Super;

public class _02_TestBin {
	public static void main(String[] args) {
		
		_01_Bin yourBin = new _01_Bin();
		System.out.println(yourBin.toString());
		
		yourBin.add("book");
		yourBin.add("notepad");
		yourBin.add("ipad");
		
		System.out.println(yourBin.toString());
		
		// remove
		yourBin.remove("book");
		
		System.out.println(yourBin.toString());
		
		//RecycleBin
		_03_RecycleBin rBin = new _03_RecycleBin();
		
		rBin.add("Bottle");
		
		System.out.println(rBin);


		
	}

}
