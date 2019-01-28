package day24_Arrays_Intro;

public class ArraysCreation {
	public static void main (String[] args) {
		
		//declaring aray that can hold 5 items
		int[] numbers = new int[5];
		//assign values. We go by index that starts with 0,1,2,3,4
		
		numbers[0] = 234;
		numbers[1] = 432;
		numbers[2] = 100;
		numbers[3] = 54;
		numbers[4] = 7654;
		
		//read from array
		System.out.println(numbers[0]);
		System.out.println(numbers[3]);
		
		//to change the value of array
		numbers[0] = 1000;
		System.out.println(numbers[0]);
		
		numbers[1] = numbers[2] + numbers[3];// it will print 154
		System.out.println(numbers[1]);
		
		//Declare a char array greades and assign A, B, C, D, E to it.
		//Use any one of 3 ways to do so.
		
		char[] grades = {'A', 'B', 'C', 'D', 'E'};
		
		//print first item
		System.out.println(grades[0]);
		
		char myGrade = grades[1];
		System.out.println(myGrade);
		
		
		//String[] cities = new String[3];
		//or
		String[] cities;
		cities = new String[3];
		
		cities[0] = "Washington";
		cities[1] = "Los Angeles";
		cities[2] = "New York";
		
		
		
		
		
	}

}
