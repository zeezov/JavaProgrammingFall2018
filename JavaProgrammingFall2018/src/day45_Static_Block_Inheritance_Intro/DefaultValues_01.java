package day45_Static_Block_Inheritance_Intro;

public class DefaultValues_01 {
	
	public int intValue;
	public byte byteValue;
	public double doubleValue;
	public boolean booleanValue;
	public char charValue;
	public String stringValue; // null
	public Integer integerObject; // null becuase it is Object
	
	public static void main(String[] args) {
		
		DefaultValues_01 d = new DefaultValues_01();
		
		System.out.println(d.intValue);
		System.out.println(d.byteValue);
		System.out.println(d.doubleValue);
		System.out.println(d.booleanValue);
		System.out.println(d.charValue);
		System.out.println(d.stringValue);
		System.out.println(d.integerObject);
		
		
		System.out.println(d.intValue + 101); // will print 101
		//System.out.println(d.stringValue.toUpperCase());// Will Throw Exception
		
		d.stringValue = "Hello World";
		System.out.println(d.stringValue.toUpperCase());
		
		
		
	}
	

}
