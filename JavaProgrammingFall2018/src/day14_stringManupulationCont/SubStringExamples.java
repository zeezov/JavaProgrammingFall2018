package day14_stringManupulationCont;

public class SubStringExamples {
	public static void main(String[] args) {

		// substring gets part of a string
		// there are two versions, 1 takes 1 int, 1 takes 2 ints
		// if it takes 1 int, it means starting point
		// we cannot give a number bigger than the length, other wise it will throw
		// exception
		// if we give number equals to the length it will return epty string.

		String str = "donaldtheduck@gmail.com";
		System.out.println(str.substring(14));
		// 2 INT

		// first number is where the new string will start from
		// second number is where the new string will end
		System.out.println(str.substring(0, 6));// to get word "donald"
		System.out.println(str.substring(6, 9));// to get word "the"

	}

}
