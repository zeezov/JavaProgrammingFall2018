package day52_Abstraction_Interface;

public abstract class Student {
	int age;
	
	public Student (int age) {
		this.age = age;	
		} 	// so, this is constructor we don't need to copy this one
	
	public void attendClass() {	
	System.out.println("Hello moto");
	} 		
	/* this is simple method in abstract class which we dont need to re-create in
	 * new NON-abstract class which extends abstract class 
	 */
	
	
	}
//-----------------------------------------------------------
abstract class  LocalStudent extends Student {
	
	int seatID;
	
	public LocalStudent() {
		super(100); // so, this is also constructor we don't need to copy this one
	}
	
	public void attendClass() { 
		System.out.println("abc");
	}
	/* this is simple method in abstract class which we dont need to re-create in
	 * new NON-abstract class which extends abstract class 
	 */
	
	public abstract void study(); 
	}
		/*
		 * this is new abstract method in abstract class so we will need to re-create this method in non abstract class
		 */
//--------------------------------------------------------------------------------
class UENStudent extends LocalStudent {

			@Override
			public void study() {
				// TODO Auto-generated method stub
			}
/*
 * so this is non abstract class which extends abstract LocalStudent class. so in this class we have one abtract method 
 * which must be Override like simple method. 
 * so main thing which you need to know in this classes, if you have abtract class and 
 * inside of this class abstract method you need to Override this abstract method in your child non abstract class
 * for ex LocalStudent class has a abstract void study class so in UENSStudent we are extending to LocalStudent class 
 * and because of it we are creating method from this class.
 * if you have 3 abstract methods in your LocalSTudent class you will need Override all three of them. 
 * you can try it your own. go to LocalStudent class create 2 more abstract classes and you UENSStudent will show you 
 * that you need to Override them
 */
	
}
