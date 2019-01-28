package day14_stringManupulationCont;

// this is the name of the class. Everything happens inside the class.
public class StringAndValues {
	
	//declaring a variable without any value
	//java will put null value by default.
	static String str;
	
	//we are declaring a main method
	public static void main (String[] args) {
		
		//will print null beause no value assigned
		System.out.println(str);
		
		//assigning value into str
		str = "a";
		// will print a
		System.out.println(str);
		
		//assigning another value into str. It will change from "a" to "b"
		str = "b";
		System.out.println(str);
		
		//prins current value of str (b) and "AAA"
		System.out.println(str + "AAA");
		
		//just showing that value of str was not changed from "b"
		System.out.println(str);
		
		//changing the value with another "="
		//str is not eaual to "bAAA"
		str = str + "AAA";
		
		//print the new value of str "bAAA"
		System.out.println(str);
		
		// ---------------
		
		//created a new variable and gave value of "a" with white space
		String myString = "  a  ";
		
		//printing the trimmed version of myString
		//this line will not effect original value of myString variable
		System.out.println(myString.trim()); // will remove spaces
		
		//prints the value of the myString which still contains spaces
		System.out.println(myString);// will print with white spaces
		
	}

}
