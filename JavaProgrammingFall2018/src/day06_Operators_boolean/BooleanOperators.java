package day06_Operators_boolean;

public class BooleanOperators {
	public static void main(String[] args) {
		boolean isExpensive = true;
		System.out.println(isExpensive);
		
		boolean isEnough = false;
		System.out.println(isEnough);
		
		System.out.println(10>5);//true
		System.out.println(100 < 99);//false
		
		int count = 55;
		System.out.println(count > 10);
		
		int currentNumber = 555;
		System.out.println(count == currentNumber);//equals?
		
		int speedLimit = 55;
		int currentSpeed = 60;
		
		//check if current speed is more than speed limit
		System.out.println(currentSpeed > speedLimit);
		//print if current speed is less than speed limit
		System.out.println(currentSpeed < speedLimit);
		//print if current speed is same as speed limit
		System.out.println(currentSpeed == speedLimit);
		
		int num1 = 10;
		int num2 = 20;
		boolean comp = num1 >= num2;//<--False
		System.out.println(comp);
				
		
		
		
	}

}
