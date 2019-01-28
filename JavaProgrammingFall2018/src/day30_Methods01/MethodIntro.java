package day30_Methods01;

import day31_Methods02.Calculator;

public class MethodIntro {
	public static void main(String[] args) {
		
		sayHello("Nazim");
		askHowRU();
		reply();
		sayBye();
		
		Calculator.Multiply(34, 25); // this was imported from Day31_Calculator
		
		
	}
	
	
//	public static void sayHello() {
//		
//		int c = 0;
//		do {
//		
//		System.out.println("Hello");
//		System.out.println("CyberTek");
//		c++;
//		} while (c < 5);
//		
//	}
	
	public static void sayHello(String name) {
		System.out.println("Hello " + name);
	}
	
	public static void askHowRU() {
		
		System.out.println("How are you");
		
	}
	
	public static void reply() {
		
		System.out.println("I am doing well, how are you");
		
	}
	
	public static void sayBye() {
		
		System.out.println("Bye! Have a good day!");
		
	}

}
