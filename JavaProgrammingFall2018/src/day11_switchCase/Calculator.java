package day11_switchCase;

public class Calculator {
	public static void main(String[] args) {
		
		/*
		 * 
		 */
		
		double num1, num2, result;
		char operator;
		
		num1 = 15;
		num2 = 3;
		operator = '%';
		
		switch (operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		case '%':
			result = num1 % num2;
			break;
		default:
			System.out.println("Error: Invalid Operator selected");
			return; // dont run the rest of the code below.
					// get out of main method right here.
		}
		
		System.out.println(result);
	}

}
