package day46_this_isa;

public class _03_Calc {
	
	private int result;
	
	public _03_Calc plus(int num) {
		result += num;
		return this;
	}
	
	public _03_Calc minus(int num) {
		result -= num;
		return this;
	}
	
	public int getResult() {
		return result;
	}

}
