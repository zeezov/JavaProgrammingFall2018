package day51_Abstraction_And_AbstractClasses;

public abstract class File {
	
	private String name;
	public static int count;
	
	public abstract void open();
	
	// no arg constructor
	public File() {
		System.out.println("File class Constructor");
		name = "unknown";
		count++;
	}
	
	// 1 arg constructor
	public File(String name) {
		System.out.println("File class 1 arg Constructor");
		this.name = name;
		count++;
	}
	
	public void close() {
		System.out.println("Closing the file.");
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	

}
