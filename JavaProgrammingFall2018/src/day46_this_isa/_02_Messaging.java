package day46_this_isa;

public class _02_Messaging {
	public static void main(String[] args) {
		
		_01_Message msg1 = new _01_Message("Hello !", "Marufjon", "Akbar");
		_01_Message msg2 = new _01_Message("Java is Fun...");
		_01_Message msg3 = new _01_Message("This keyword is interesting", "Shahin");
		_01_Message msg4 = new _01_Message();
		
		System.out.println(msg1.toString());
		System.out.println(msg2.toString());
		// you can also call it without Sysout .toString
		System.out.println(msg3);
		System.out.println(msg4.toString());
		
	}

}
