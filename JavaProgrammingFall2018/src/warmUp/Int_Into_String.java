package warmUp;

public class Int_Into_String {
	
	public static void main(String[] args) {
		
		int numberOne = 5;
		
		int numberTwo = 6;
		
		Integer numberThree = numberTwo; // turn Int in to Integert than
		
		String strThree = numberThree.toString();//"7"
		
		System.out.println(numberTwo + numberThree);//13
		
		System.out.println("==============");
		
		System.out.println(numberTwo + strThree);//6"7"
		
		/*
		 * Add numberOne to numberTwo with "+" to get answer 56
		 */
		
		System.out.println(numberOne +""+ numberTwo);//56
		

		System.out.println(numberOne + numberTwo);//11
		
		
		Integer one = 1; // Integer is same as Int
		
		String strOne = one.toString(); // turn Integer into String 
		
		int two = Integer.parseInt(strOne);
		
		String three = "1";
		
		int four = Integer.parseInt(three);
		
		
		
	}

}
