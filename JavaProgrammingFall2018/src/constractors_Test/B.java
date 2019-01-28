package constractors_Test;

public class B {
	
	public static void main(String[] args) {
		
		//A a = new A("Nazim"); this wont work because we dont have constactor with params
		
		A a = new A();
		
		a.name = "John";
		a.age = 68;
		
		A b = new A(78);
		
		System.out.println(a.name + " " + b.age);
		
		
		
	}

}
