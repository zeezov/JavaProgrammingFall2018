package homework_12_9_Inheritance;

public class Room extends House {
	
	static {
		System.out.println("This Room static block #2");
	}
	
	{
		System.out.println("This Room int block #2");
	}
	
	public Room() {
		System.out.println("This is Room contstructor #2");
	}

}
