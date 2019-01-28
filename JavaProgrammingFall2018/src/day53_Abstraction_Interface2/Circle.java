package day53_Abstraction_Interface2;

public class Circle extends Shape {

	int radius;
	
	public Circle(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;
	}
	
	public Circle() {
		System.out.println("This is Circle");
	}
	

	@Override
	public void calculateArea() {
		
		double result = 3.14 * radius * radius;
		System.out.println(result);
		
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int drawLine(String s) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
