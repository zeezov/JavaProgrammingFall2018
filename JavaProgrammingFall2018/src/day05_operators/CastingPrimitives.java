package day05_operators;

public class CastingPrimitives {
	public static void main(String[] args) {
		
		int i = 100;
		byte b = (byte)i;
		
		//In above example, we are casting from int to byte
		
		//implicit casting examples
		
		int count = 455;
		double doubleCount = count;
			System.out.println(doubleCount);
			
		byte byteValue = 127;
		int intValue = byteValue;
			System.out.println(intValue);
			
		//explicit casting examples
			
		int students = 70;
		byte byteStudents = (byte)students;
			System.out.println(byteStudents);
			
		double priceOfSmith = 5343.23;
		int intPrice = (int)priceOfSmith;
			System.out.println(intPrice);
			
		
		
				
		
	}

}
