package day46_this_isa;

public class _04_CalcTest {

	public static void main(String[] args) {
		
		_03_Calc c = new _03_Calc();
		
		c.plus(10);
		System.out.println(c.getResult());
		
		c.plus(5).plus(15).plus(10).minus(3);
		
		System.out.println(c.getResult());
		
	}

}
