package day45_Static_Block_Inheritance_Intro;

public class BocksTest_07 {
	public static void main(String[] args) {
		
//		System.out.println(Blocks_06.num); // 1100
//		System.out.println(Blocks_06.str); // Hello
		
		Blocks_06 b1 = new Blocks_06(); // 3200
		Blocks_06 b2 = new Blocks_06(); // 7400
		
		System.out.println(b1.num);
		System.out.println(b1.str);
		
		System.out.println(b2.num);
		System.out.println(b2.str);
		
	}

}
