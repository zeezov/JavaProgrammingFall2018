package day53_Abstraction_Interface2;

public class Rectangle extends Shape {
	
	public int width;
	public int height;
	
	public Rectangle(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public Rectangle() {
		System.out.println("This is Rectangle");
	}
	
	public Rectangle(String name, int width, int height) {
		super(name);
		this.width = width;
		this.height = height;
	}

	@Override
	public void calculateArea() {
		
		int result = width * height;
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
